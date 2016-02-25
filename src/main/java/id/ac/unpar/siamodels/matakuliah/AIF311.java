package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.PilihanWajib;

import java.util.List;

@MataKuliah(kode = "AIF311", nama = "Pemrograman Fungsional", sks = 2)
public class AIF311 implements HasPrasyarat, PilihanWajib, HasPraktikum {

    /**
     * @author Cecilia E. Nugraheni
     * @return deskripsi mata kuliah
     */
    public String getDeskrisi() {
        return "Kuliah Pemrograman Fungsional bertujuan untuk:\n"
                + "1. memperkenalkan paradigma pemrograman fungsional, yaitu sebuah pemrograman yang didasarkan pada konsep pemetaan dan fungsi matematika. Penyelesaian suatu masalah didasari atas aplikasi dari fungsi-fungsi tersebut.\n"
                + "2. memberikan dasar-dasar pemrograman fungsional dengan menggunakan bahasa fungsional Haskell.";
    }

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasTempuhKuliah("AIF103")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF103");
            ok = false;
        }
        return ok;
    }

}
