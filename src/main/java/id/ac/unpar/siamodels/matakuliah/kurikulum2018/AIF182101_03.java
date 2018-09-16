package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;

import java.util.List;

@InfoMataKuliah(nama = "Algoritma dan Struktur Data", sks = 3)
public class AIF182101_03 extends MataKuliah implements HasPraktikum, HasPrasyarat{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasLulusKuliah("AIF181100-04")) {
            reasonsContainer.add("Tidak memenuhi prasyarat lulus AIF181100-04");
            ok = false;
        }
        return ok;
    }
}
