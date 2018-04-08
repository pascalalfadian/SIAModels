package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;

import java.util.List;


@InfoMataKuliah(nama = "Teori Bilangan", sks = 3)
public class AIF182118_03 extends MataKuliah implements HasPrasyarat{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasTempuhKuliah("AIF181107-03")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF181107-03");
            ok = false;
        }
        return ok;
    }
}
