package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;

import java.util.List;


@InfoMataKuliah(nama = "Analisis Desain Berorientasi Objek", sks = 4)
public class AIF182100_04 extends MataKuliah implements HasPraktikum, HasPrasyarat, HasResponsi{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasLulusKuliah("AIF182105-02")) {
            reasonsContainer.add("Tidak memenuhi prasyarat lulus AIF182105-02");
            ok = false;
        }
        return ok;
    }
}
