package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;
import id.ac.unpar.siamodels.Mahasiswa;

import java.util.List;


@InfoMataKuliah(nama = "Teknologi Big Data dan Cloud Computing", sks = 3)
public class AIF184345_03 extends MataKuliah implements HasPrasyarat{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasLulusKuliah("AIF183307-02") && !mahasiswa.hasLulusKuliah("AIF183211-04")) {
            reasonsContainer.add("Tidak memenuhi prasyarat lulus AIF182101-03 atau AIF183211-04");
            ok = false;
        }
        return ok;
    }
}
