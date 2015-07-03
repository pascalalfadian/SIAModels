package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Pilihan;
import java.util.List;

public class AIF453 implements HasPrasyarat, Pilihan {

	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		boolean ok = false;
		if (mahasiswa.hasLulusKuliah("AIF204") || mahasiswa.hasLulusKuliah("AIF294")) {
			ok = true;
		}
		if ((mahasiswa.hasLulusKuliah("AIF102") || !mahasiswa.hasLulusKuliah("AIF192")) && mahasiswa.calculateIPKLulus() > 2.75) {
			ok = true;
		}
		if (!ok) {
			reasonsContainer.add("Tidak memenuhi prasyarat ((tempuh AIF204/294) atau (tempuh AIF102/AIF192 & IPK Lulus > 2.75))");
		}
		return ok;
	}

}
