package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;
import id.ac.unpar.siamodels.Mahasiswa;

import java.util.List;


@InfoMataKuliah(nama = "Layanan Berbasis Web", sks = 3)
public class AIF184235_03 extends MataKuliah implements HasPrasyarat{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasLulusKuliah("AIF182204-03") && !mahasiswa.hasLulusKuliah("AIF182302-04") && !mahasiswa.hasLulusKuliah("AIF183211-04")) {
            reasonsContainer.add("Tidak memenuhi prasyarat lulus AIF182204-03, AIF182302-04 atau AIF183211-04");
            ok = false;
        }
        return ok;
    }
}
