package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;
import id.ac.unpar.siamodels.Mahasiswa;

import java.util.List;


@InfoMataKuliah(nama = "Jaringan Komputer", sks = 2)
public class AIF183204 extends MataKuliah implements HasPrasyarat{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasTempuhKuliah("AIF182210")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF182210");
            ok = false;
        }
        return ok;
    }
}
