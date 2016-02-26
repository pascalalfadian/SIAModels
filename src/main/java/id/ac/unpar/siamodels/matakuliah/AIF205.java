package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

import java.util.List;

/**
 * Mata kuliah ini memperkenalkan kepada mahasiswa arsitektur komputer 
 * sederhana, modern, dan Advance. Perbedaan, kelebihan dan kekurangan untuk 
 * masing-masing arsitektur. Selain itu mahasiswa juga mempelajari cara kerja 
 * dari komponen-komponen komputer, terutama memory, cache, system BUS dan 
 * input/output.
 * @author Chandra Wijaya (chandraw@unpar.ac.id)
 */
@MataKuliah(kode = "AIF205", nama = "Arsitektur & Organisasi Komputer", sks = 3)
public class AIF205 implements HasPrasyarat, Wajib {

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasTempuhKuliah("AIF106")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF106");
            ok = false;
        }
        return ok;
    }

}
