package id.ac.unpar.siamodels.matakuliah.interfaces;

import java.util.List;

import id.ac.unpar.siamodels.Mahasiswa;

/**
 * Mendefinisikan kelas-kelas yang memiliki prasyarat, terkustomisasi
 * untuk seorang {@link Mahasiswa}. Jika ada tambahan, jangan lupa untuk
 * mendaftarkannya di {@link #DEFAULT_HASPRASYARAT_CLASSES}. Jika berubah package,
 * jangan lupa mengupdate {@link #DEFAULT_PRASYARAT_PACKAGE}.
 * @author pascal
 *
 */
public interface HasPrasyarat {
	
	/**
	 * Daftar dari nama kelas default seluruh turunan interface ini. Perlu didaftarkan
	 * manual, karena Java reflection tidak dapat mendeteksi otomatis.
	 */
	public String[] DEFAULT_HASPRASYARAT_CLASSES = { "AIF181100_04", "AIF182101_03",
			"AIF182103_04", "AIF182105_02", "AIF182100_04", "AIF182302_04", "AIF182204_03", "AIF182206_03",
			"AIF182308_03", "AIF183101_03", "AIF183303_03", "AIF183305_02", "AIF183307_02", "AIF183209_03",
			"AIF183211_04", "AIF183100_03", "AIF183105_06", "AIF183308_03", "AIF184303_03", "AIF184001_03",
			"AIF184002_05", "AIF184004_08", "AIF182110_02", "AIF182112_03", "AIF182114_03", "AIF182116_02",
			"AIF182118_03", "AIF182120_02", "AIF182122_03", "AIF182124_03", "AIF182126_02", "AIF183117_02",
			"AIF183119_02", "AIF183121_03", "AIF183227_03", "AIF183331_03", "AIF183333_02", "AIF183335_02",
			"AIF183112_02", "AIF183114_03", "AIF183116_02", "AIF183118_03", "AIF183120_03", "AIF183122_03",
			"AIF183124_03", "AIF183126_03", "AIF183230_03", "AIF183232_03", "AIF183234_03", "AIF183236_03",
			"AIF183340_02", "AIF183342_03", "AIF183344_03", "AIF183348_03", "AIF184109_03", "AIF184115_02",
			"AIF184119_03", "AIF184121_03", "AIF184123_03", "AIF184125_03", "AIF184129_03", "AIF184231_03",
			"AIF184233_03", "AIF184235_03", "AIF184339_03", "AIF184341_03", "AIF184345_03", "AIF184104_03",
			"AIF184106_03", "AIF184108_03", "AIF184110_03", "AIF184112_03", "AIF184114_03", "AIF184116_02",
			"AIF184118_02", "AIF184222_03", "AIF184224_03", "AIF184226_03", "AIF184228_02", "AIF184230_03",
			"AIF184334_03", "AIF184338_03", "AIF184340_02"};
	
	/**
	 * Package tempat menyimpan seluruh turunan standar interface ini. Perlu didefinisikan
	 * manual, karena Java reflection tidak dapat mendeteksi otomatis.
	 */
	public String DEFAULT_PRASYARAT_PACKAGE = "id.ac.unpar.siamodels.matakuliah";
	
	/**
	 * Memeriksa prasyarat-prasyarat dari kuliah, spesifik untuk mahasiswa
	 * yang dituju. Jika ada pesan-pesan khusus, akan ditambahkan pada parameter
	 * reasonsContainer.
	 * @param mahasiswa prasyarat kuliah akan diperiksa spesifik pada mahasiswa ini
	 * @param reasonsContainer pesan-pesan terkait prasyarat akan ditambahkan di sini, jika ada. 
	 * @return true jika seluruh prasyarat dipenuhi, false jika tidak. 
	 */
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer);
}
