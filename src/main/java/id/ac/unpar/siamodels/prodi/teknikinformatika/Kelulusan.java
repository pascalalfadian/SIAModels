package id.ac.unpar.siamodels.prodi.teknikinformatika;

import java.util.Arrays;
import java.util.List;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;

public class Kelulusan implements HasPrasyarat {

	public static final String[] PILIHAN_WAJIB = { "AIF311", "AIF312", "AIF313", "AIF314", "AIF315", "AIF316",
			"AIF317" };
	public static final String[][] WAJIB = { { "AIF101", "AIF103", "AIF105", "MKU001", "MKU008", "MKU010" },
			{ "AIF102", "AIF104", "AIF106", "AMS100", "MKU009", "MKU011" },
			{ "AIF210", "AIF203", "AIF205", "AMS200", "MKU012" }, { "AIF202", "AIF204", "AIF206", "AIF208", "AIF210" },
			{ "AIF301", "AIF303", "AIF305", "MKU002" }, { "AIF302", "AIF304", "AIF306" },
			{ "AIF401", "AIF403", "AIF405" }, { "AIF402", "APS402" } };
	public static final String[] AGAMA = { "MKU003", "MKU004" };

	public static final int MIN_SKS_LULUS = 144;

	public static final int MIN_PILIHAN_WAJIB = 4;

	@Override
	/**
	 * Melakukan pengecekan syarat kelulusan
	 * 
	 * @param mahasiswa
	 *            mahasiswa yang dicek
	 * @param reasonsContainer
	 *            alasan2 yang ada jika tidak lulus
	 * @return boolean true jika memenuhi syarat, false jika sebaliknya
	 */
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		// cek sks
		boolean bisaLulus = true;
		int sks = mahasiswa.calculateSKSLulus();
		if (sks < MIN_SKS_LULUS) {
			reasonsContainer.add("Masih Kurang " + (MIN_SKS_LULUS - sks) + " SKS");
			bisaLulus = false;
		}
		// cek agama
		boolean lulusSalahSatuMKAgama = false;
		for (int i = 0; i < AGAMA.length; i++) {
			if (mahasiswa.hasLulusKuliah(AGAMA[i])) {
				lulusSalahSatuMKAgama = true;
				break;
			}
		}
		if (!lulusSalahSatuMKAgama) {
			reasonsContainer.add("Belum mengambil salah satu dari " + Arrays.toString(AGAMA));
			bisaLulus = false;
		}
		// cek kuliah wajib
		for (String[] mkWajibSemesterI : WAJIB) {
			for (String mkWajib : mkWajibSemesterI) {
				if (!mahasiswa.hasLulusKuliah(mkWajib)) {
					reasonsContainer.add("Belum Lulus Kuliah Wajib " + mkWajib);
					bisaLulus = false;
				}
			}
		}
		// cek pilihan wajib
		int lulusPilihanWajib = 0;
		for (String mkPilihanWajib : PILIHAN_WAJIB) {
			if (mahasiswa.hasLulusKuliah(mkPilihanWajib)) {
				lulusPilihanWajib++;
			}
		}
		if (lulusPilihanWajib < MIN_PILIHAN_WAJIB) {
			reasonsContainer.add("Belum Mencukupi " + MIN_PILIHAN_WAJIB + " Pilihan Wajib, Baru Lulus "
					+ lulusPilihanWajib + " Mata Kuliah");
			bisaLulus = false;
		}
		// cek projek
		if (!mahasiswa.hasLulusKuliah("AIF306") && !mahasiswa.hasLulusKuliah("AIF405")) {
			reasonsContainer.add("Belum mengambil salah satu dari AIF306 atau AIF304+AIF405");
			bisaLulus = false;
		}
		return bisaLulus;
	}
}

