package id.ac.siamodels.prodi.teknikinformatika;

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

	public static final int SKS_LULUS = 144;

	public static final int MIN_PIL_WAJIB = 4;

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
		boolean bisaLulus = false;
		int sks = mahasiswa.calculateSKSLulus();
		if (sks < SKS_LULUS) {
			reasonsContainer.add("Masih Kurang " + (SKS_LULUS - sks) + " SKS");
		} else {
			bisaLulus = true;
		}
		// cek agama
		boolean agama = false;
		for (int i = 0; i < AGAMA.length; i++) {
			if (mahasiswa.hasLulusKuliah(AGAMA[i])) {
				agama = true;
				bisaLulus = bisaLulus & true;
				break;
			}
		}
		if (agama == false) {
			reasonsContainer.add("Belum mengambil salah satu dari " + Arrays.toString(AGAMA));
		}
		// cek kuliah wajib
		for (int i = 0; i < WAJIB.length; i++) {
			for (int j = 0; j < WAJIB[i].length; j++) {
				if (mahasiswa.hasLulusKuliah(WAJIB[i][j]) == false) {
					reasonsContainer.add("Belum Lulus Kuliah Wajib " + WAJIB[i][j]);
				} else {
					bisaLulus = bisaLulus & true;
				}
			}
		}
		// cek pilihan wajib
		int pil_count = 0;
		for (int i = 0; i < PILIHAN_WAJIB.length; i++) {
			if (mahasiswa.hasLulusKuliah(PILIHAN_WAJIB[i])) {
				pil_count++;
			}
		}
		if (pil_count < MIN_PIL_WAJIB) {
			reasonsContainer.add(
					"Belum Mencukupi " + MIN_PIL_WAJIB + " Pilihan Wajib, Baru Lulus " + pil_count + " Mata Kuliah");
		} else {
			bisaLulus = bisaLulus & true;
		}
		// cek projek
		if (mahasiswa.hasLulusKuliah("AIF306") || mahasiswa.hasLulusKuliah("AIF405")) {
			bisaLulus = bisaLulus & true;
		} else {
			reasonsContainer.add("Belum mengambil salah satu dari AIF306 atau AIF304+405");
		}
		return bisaLulus;
	}
}

