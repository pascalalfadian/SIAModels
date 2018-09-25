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

    public static final String[][] WAJIB = {{"AIF181101", "AIF181103", "AIF181105","AIF181107", "MKU180130", "MKU180110", "MKU180120"},
            {"AIF181100", "AIF181202", "AIF181104", "AIF181106", "MKU180240", "MKU180250"},
            {"AIF182101", "AIF182103", "AIF182105", "AIF182007", "AIF182109", "MKU180360"},
            {"AIF182100", "AIF182302", "AIF182204", "AIF182106", "AIF182308", "AIF182210"},
            {"AIF183201", "AIF183303", "AIF183305", "AIF183107", "AIF183209", "AIF183111"},
            {"AIF183300", "AIF183002", "AIF183204"},
            {"AIF184005"}, {"AIF184000"}};

    public static final String[] AGAMA = {"MKU180370", "MKU180380"};

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
        if (!mahasiswa.hasLulusKuliah("AIF183106") && !mahasiswa.hasLulusKuliah("AIF184303")) {
            reasonsContainer.add("Anda belum mengambil salah satu dari MK Proyek AIF183106 atau AIF183308 & AIF184303");
            bisaLulus = false;
        }
        //cek skripsi atau tugas akhir
        if (!mahasiswa.hasLulusKuliah("AIF184002") && !mahasiswa.hasLulusKuliah("AIF184004")) {
            reasonsContainer.add("Anda belum mengambil MK AIF184001 & AIF184002 atau AIF184004");
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
