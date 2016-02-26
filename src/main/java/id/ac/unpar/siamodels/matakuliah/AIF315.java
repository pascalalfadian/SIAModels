package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.PilihanWajib;

import java.util.List;

/**
 * Mata kuliah ini memperkenalkan konsep dan lingkungan pemrograman berbasis web,
 * kemudian belajar membuat aplikasi berbasis web menggunakan HTML5, CSS, Java Script 
 * dan PHP. Untuk meningkatkan keterampilan pemrograman dilengkapi dengan praktikum. 
 * Sedangkan untuk mendapatkan pengalaman penerapan konsep diberikan tugas besar membuat 
 * program berbasis web dengan kasus yang ditentukan oleh mahasiswa.
 * @authors Gede Karya(gkarya@unpar.ac.id), Husnul Hakim(husnulhakim@unpar.ac.id).
 */
@MataKuliah(kode = "AIF315", nama = "Pemrograman Berbasis Web", sks = 2)
public class AIF315 implements HasPrasyarat, PilihanWajib, HasPraktikum {

	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		if (!mahasiswa.hasTempuhKuliah("AIF204") && !mahasiswa.hasTempuhKuliah("AIF294")) {
			reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF204 atau AIF294");
			return false;
		}
		return true;
	}
}
