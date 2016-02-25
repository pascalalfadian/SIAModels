package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

import java.util.List;

@MataKuliah(kode = "AIF303", nama = "Pengantar Sistem Informasi", sks = 3)
public class AIF303 implements HasPrasyarat, Wajib {

    /**
     * @author Rosa de Lima E. Padmowati 
     * @return deskripsi mata kuliah
     */
    
    public String getDeskripsi() {
        return "Mempelajari Konsep Data, Informasi, Pengetahuan, Sistem Informasi, proses dan pemodelan bisnis, jenis-jenis sistem informasi, untuk mendukung pengambilan keputusan. \n"
                + "Mempelajari trend Teknologi Informasi, tahap-tahap pembangunan sistem informasi.\n"
                + "Mempelajari pengantar : EIS, e-bisnis/e-commerce, Business Intelligence, Cloud Computing dan Mobile Applications";
    }

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasTempuhKuliah("AIF204") && !mahasiswa.hasTempuhKuliah("AIF294")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF204 atau AIF294");
            ok = false;
        }
        return ok;
    }

}
