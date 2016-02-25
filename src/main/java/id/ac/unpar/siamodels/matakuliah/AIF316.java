package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.PilihanWajib;

import java.util.List;

@MataKuliah(kode = "AIF316", nama = "Komputasi Paralel", sks = 2)
public class AIF316 implements HasPrasyarat, PilihanWajib,HasPraktikum {

	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		if (!mahasiswa.hasTempuhKuliah("AIF102") && !mahasiswa.hasTempuhKuliah("AIF192")) {
			reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF102 atau AIF192");
			return false;
		}
		return true;
	}
        /**
         * @author Joanna Helga, M.Sc. (joanna@unpar.ac.id)
         * @return deskripsi mata kuliah
         */
        public String getDeskripsi(){
            return "Mata kuliah ini memperkenalkan konsep-konsep dasar komputasi paralel, dimana sebuah program yang berjalan secara paralel harus memiliki safety property dan liveness property. Mahasiswa dikenalkan dengan beberapa teknik pemrograman multi-thread "
                    + "seperti lock, monitor, barrier, thread pool, dan sebagainya, yang diimplementasikan dalam bahasa pemrograman Java. Mahasiswa juga dikenalkan dengan beberapa metode untuk menganalisis kebenaran program baik secara matematis maupun secara praktis dengan bantuan model checker.";
            
        }

}
