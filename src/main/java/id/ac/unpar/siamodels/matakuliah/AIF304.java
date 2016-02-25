package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Projek;

import java.util.List;

@MataKuliah(kode = "AIF304", nama = "Proyek Sistem Informasi 1", sks = 3)
public class AIF304 implements HasPrasyarat, Projek {

    /**
     * @author Veronica S. Moertini
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi() {
        return "Mata kuliah ini memberikan kesempatan bagi mahasiswa untuk memperdalam konsep tentang pengembangan sistem informasi dan mempraktekkan analisis kebutuhan, "
                + "analisis sistem dan perancangan sitem pada organisasi studi kasus;";
    }

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        if (!mahasiswa.hasTempuhKuliah("AIF303")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF303");
            return false;
        }
        return true;
    }

}
