package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.PilihanWajib;

import java.util.List;

@MataKuliah(kode = "AIF312", nama = "Keamanan Informasi", sks = 2)
public class AIF312 implements HasPrasyarat, PilihanWajib, HasPraktikum {

    /**
     * @author Mariskha Tri Adithia
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi() {
        return "Mata kuliah ini memberikan pengetahuan awal tentang keamanan informasi. "
                + "Pada beberapa pertemuan awal, dibahas keamanan informasi secara matematis, yaitu di materi-materi seputar kriptografi dan serangannya. "
                + "Lalu, dibahas pula konsep keamanan informasi pada jaringan komputer dan pada software.";
    }

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        if (!mahasiswa.hasTempuhKuliah("AIF305")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF305");
            return false;
        }
        return true;
    }

}
