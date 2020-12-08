package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;
import id.ac.unpar.siamodels.Mahasiswa;

import java.util.List;


@InfoMataKuliah(nama = "Pemrograman Berbasis Web", sks = 3)
public class AIF182204 extends MataKuliah implements HasPraktikum, HasPrasyarat{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasTempuhKuliah("AIF182302")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF182302");
            ok = false;
        }
        return ok;
    }
}
