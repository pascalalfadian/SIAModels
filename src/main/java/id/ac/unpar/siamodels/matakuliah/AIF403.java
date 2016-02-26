package id.ac.unpar.siamodels.matakuliah;

import java.util.List;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;
/**
 * 1. Memberikan wawasan kepada mahasiswa tentang kemunculan dan pemanfaatan teknologi baru, 
 * khususnya yang berkaitan dengan komputer, dan dampaknya terhadap masyarakat luas.
 * 2. Memberikan kesadaran dan panduan bersikap kepada mahasiswa dalam menghadapi gejolak yang
 * disebabkan oleh munculnya teknologi baru, khususnya yang berkaitan dengan komputer.
 * 
 * @author Oerip S. Santosa (oerip@unpar.ac.id)
 */
@MataKuliah(kode = "AIF403", nama = "Komputer & Masyarakat", sks = 2)
public class AIF403 implements HasPrasyarat, Wajib {

      	@Override
      	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
      		int sksLulus = mahasiswa.calculateSKSLulus();
      		if (sksLulus < 70) {
      			reasonsContainer.add("SKS Lulus " + sksLulus + ", belum mencapai syarat minimal 70");			
      			return false;
      		}
      		return true;
      	}
}
