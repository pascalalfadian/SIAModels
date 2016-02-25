package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Pilihan;

import java.util.List;

@MataKuliah(kode = "AIF469", nama = "Layanan Berbasis Web", sks = 3)
public class AIF469 implements HasPrasyarat, Pilihan {

	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		boolean ok = true;
		if (!mahasiswa.hasTempuhKuliah("AIF305")) {
			reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF305");
			ok = false;
		}
		if (!mahasiswa.hasTempuhKuliah("AIF315")) {
			reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF315");			
			ok = false;
		}
		return ok;
	}
        
        /**
         * @author Pascal (pascal@unpar.ac.id)
         * @return deskripsi mata kuliah
         */
        public String getDeskripsi(){
            return "Mata kuliah ini mengajarkan kepada mahasiswa teknik-teknik untuk membuat layanan berbasis web."
                    + " Mahasiswa diperkenalkan dengan standar-standar seperti HTTP, XML, JSON dan diajarkan untuk memanfaatkannya"
                    + " dalam membuat maupun menggunakan layanan pihak ketiga. Dalam kuliah ini, juga akan diperkenalkan minimal satu"
                    + " layanan pihak ketiga yang dapat dimanfaatkan mahasiswa, seperti Google Places Web Service.";
        }
}
