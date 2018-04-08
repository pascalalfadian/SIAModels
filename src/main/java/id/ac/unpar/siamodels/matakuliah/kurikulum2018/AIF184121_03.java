package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;
import id.ac.unpar.siamodels.Mahasiswa;

import java.util.List;


@InfoMataKuliah(nama = "Metode Optimisasi", sks = 3)
public class AIF184121_03 extends MataKuliah implements HasPrasyarat{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasLulusKuliah("AIF183101-03")) {
            reasonsContainer.add("Tidak memenuhi prasyarat lulus AIF183101-03");
            ok = false;
        }
        if (!mahasiswa.hasTempuhKuliah("AIF183100-03")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF183100-03");
            ok = false;
        }
        return ok;
    }
}
