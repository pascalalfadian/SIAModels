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

    /*public static final String[][] WAJIB_OLD = {{"AIF101", "AIF103", "AIF105", "MKU001", "MKU008", "MKU010"},
    {"AIF102", "AIF104", "AIF106", "AMS100", "MKU009", "MKU011"},
    {"AIF210", "AIF203", "AIF205", "AMS200", "MKU012"}, {"AIF202", "AIF204", "AIF206", "AIF208", "AIF210"},
    {"AIF301", "AIF303", "AIF305", "MKU002"}, {"AIF302"},
    {"AIF401", "AIF403"}, {"AIF402", "APS402"}};*/
    public static final String[][] WAJIB = {{"AIF181101-03", "AIF181103-04", "AIF181105-02","AIF181107-03", "MKU170130-02", "MKU170110-02", "MKU170120-02"},
            {"AIF181100-04", "AIF181202-04", "AIF181104-03", "AIF181106-03", "MKU170240-02", "MKU170250-02"},
            {"AIF182101-03", "AIF182103-04", "AIF182105-02", "AIF182007-02", "AIF182109-03", "MKU170360-02"}, {"AIF182100-04", "AIF182302-04", "AIF182204-03", "AIF182206-03", "AIF182308-03"},
            {"AIF183101-03", "AIF183303-03", "AIF183305-02", "AIF183307-02", "AIF183109-03", "AIF183211-04"},
            {"AIF183100-03", "AIF183002-02", "AIF183104-03"},
            {"AIF184001-03", "AIF184005-02"}, {"AIF184002-05", "AIF184000-02"}};
    public static final String[] AGAMA = {"MKU170370-02", "MKU170380-02"};

    public static final int MIN_SKS_LULUS = 144;

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
        // cek projek
<<<<<<< HEAD
        if (!mahasiswa.hasLulusKuliah("AIF183106-06") && !mahasiswa.hasLulusKuliah("AIF184303-03")) {
            reasonsContainer.add("Anda belum mengambil salah satu dari MK Proyek AIF183106-06 atau AIF183308-03 & AIF184303-03");
=======
        if (!mahasiswa.hasLulusKuliah("AIF306") && !mahasiswa.hasLulusKuliah("AIF405")) {
            reasonsContainer.add("Anda belum lulus salah satu dari MK Proyek AIF306 atau AIF304 & AIF405");
>>>>>>> a18178161b412ce7da97ab5644d624c2eef3701f
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
