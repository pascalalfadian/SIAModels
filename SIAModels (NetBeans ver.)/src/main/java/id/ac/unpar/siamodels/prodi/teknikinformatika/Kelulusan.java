package id.ac.unpar.siamodels.prodi.teknikinformatika;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import java.util.Collection;

public class Kelulusan implements HasPrasyarat {

    public static final String[] PILIHAN_WAJIB = {"AIF311", "AIF312", "AIF313", "AIF314", "AIF315", "AIF316",
        "AIF317"};
    public static final String[][] WAJIB = {{"AIF101", "AIF103", "AIF105", "MKU001", "MKU008", "MKU010"},
    {"AIF102", "AIF104", "AIF106", "AMS100", "MKU009", "MKU011"},
    {"AIF210", "AIF203", "AIF205", "AMS200", "MKU012"}, {"AIF202", "AIF204", "AIF206", "AIF208", "AIF210"},
    {"AIF301", "AIF303", "AIF305", "MKU002"}, {"AIF302"},
    {"AIF401", "AIF403"}, {"AIF402", "APS402"}};
    public static final String[] AGAMA = {"MKU003", "MKU004"};

    public static final int MIN_SKS_LULUS = 144;

    public static final int MIN_PILIHAN_WAJIB = 4;

    @Override
    /**
     * Melakukan pengecekan syarat kelulusan
     *
     * @param mahasiswa mahasiswa yang dicek
     * @param reasonsContainer alasan2 yang ada jika tidak lulus
     * @return boolean true jika memenuhi syarat, false jika sebaliknya
     */
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        // cek sks
        boolean bisaLulus = true;
        int sks = mahasiswa.calculateSKSLulus();
        if (sks < MIN_SKS_LULUS) {
            reasonsContainer.add(String.format("Anda baru lulus %d SKS, masih kurang %d SKS lagi untuk mencapai %d.", sks, MIN_SKS_LULUS - sks, MIN_SKS_LULUS));
            bisaLulus = false;
        }
        // cek agama
        boolean lulusSalahSatuMKAgama = false;
        for (int i = 0; i < AGAMA.length; i++) {
            if (mahasiswa.hasLulusKuliah(AGAMA[i])) {
                lulusSalahSatuMKAgama = true;
                break;
            }
        }
        if (!lulusSalahSatuMKAgama) {
            reasonsContainer.add("Anda belum lulus salah satu dari MK Agama " + Arrays.toString(AGAMA));
            bisaLulus = false;
        }
        // cek kuliah wajib
        for (String[] mkWajibSemesterI : WAJIB) {
            for (String mkWajib : mkWajibSemesterI) {
                if (!mahasiswa.hasLulusKuliah(mkWajib)) {
                    reasonsContainer.add("Anda belum lulus MK wajib " + mkWajib);
                    bisaLulus = false;
                }
            }
        }
        // cek pilihan wajib
        int lulusPilihanWajib = 0;
        for (String mkPilihanWajib : PILIHAN_WAJIB) {
            if (mahasiswa.hasLulusKuliah(mkPilihanWajib)) {
                lulusPilihanWajib++;
            }
        }
        if (lulusPilihanWajib < MIN_PILIHAN_WAJIB) {
            reasonsContainer.add(String.format("Anda baru lulus %d MK pilihan wajib, sedangkan Anda perlu lulus %d", lulusPilihanWajib, MIN_PILIHAN_WAJIB));
            bisaLulus = false;
        }
        // cek projek
        if (!mahasiswa.hasLulusKuliah("AIF306") && !mahasiswa.hasLulusKuliah("AIF405")) {
            reasonsContainer.add("Anda belum lulus salah satu dari MK Proyek AIF306 atau AIF304 & AIF405");
            bisaLulus = false;
        }
        // cek nilai TOEFL
        SortedMap<LocalDate, Integer> toeflScore = mahasiswa.getNilaiTOEFL();
        if(toeflScore == null) {
            reasonsContainer.add("Belum ada skor TOEFL.");
            bisaLulus = false;
        }
        Collection nilai = toeflScore.values();   
        int maxToefl = 0;
        Iterator i = nilai.iterator();
        while (i.hasNext()) {
            int val = (int) i.next();
            if (maxToefl < val) {
                maxToefl = val;
            }
        }
        if (!(maxToefl >= 500)) {
            if (toeflScore.size() <= 8) {
                reasonsContainer.add("Belum mencapai nilai TOEFL sebesar 500.");
                bisaLulus = false;
            } else {
                if (maxToefl < 450) {
                    reasonsContainer.add("Belum mencapai nilai TOEFL sebesar 450.");
                    bisaLulus = false;
                } else {
                    reasonsContainer.add("Sudah lulus TOEFL dengan nilai " + maxToefl + " dan memerlukan dispensasi dari rektor karena sudah mengambil tes TOEFL sebanyak "+toeflScore.size()+" kali.");
                }
            }
        }
        return bisaLulus;
    }

}
