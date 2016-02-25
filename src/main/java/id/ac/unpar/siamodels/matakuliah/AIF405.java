package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Projek;

import java.util.List;

@MataKuliah(kode = "AIF405", nama = "Proyek Sistem Informasi 2", sks = 3)
public class AIF405 implements HasPrasyarat, Projek, HasPraktikum {

	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		boolean ok = true;
		if (!mahasiswa.hasTempuhKuliah("AIF304")) {
			reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF304");			
			ok = false;
		}
		return ok;
	}
        
        /**
         * @author Veronica S. Moertini (moertini@unpar.ac.id)
         * @return deskripsi mata kuliah
         */
        public String getDeskripsi(){
            return "Mata kuliah ini merupakan lanjutan dari Projek Sistem Informasi 1 dan memberikan "
                    + "kesempatan bagi mahasiswa untuk melanjutkan/mengembangkan perancangan sitem pada organisasi studi kasus, "
                    + "mengimplementasikan rancangan dan melakukan pengujian  perangkat lunak;";
        }
}
