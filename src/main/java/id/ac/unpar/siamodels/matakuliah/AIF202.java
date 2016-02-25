package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasResponsi;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;


import java.util.List;

@MataKuliah(kode = "AIF202", nama = "Desain & Analisis Algoritma", sks = 4)
public class AIF202 implements HasPrasyarat, Wajib, HasResponsi, HasPraktikum {

    /**
     * @author Joanna Helga
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
        return "Mata kuliah ini memperkenalkan kepada mahasiswa beberapa "
                + "algoritma dan struktur data, alternatif cara implementasinya,"
                + " dan analisis kompleksitas waktunya. Mahasiswa diberikan "
                + "beberapa masalah komputasi yang harus diselesaikan dengan "
                + "menggunakan algoritma atau struktur data yang sudah "
                + "diperkenalkan dan mengimplementasikannya dalam bahasa "
                + "pemrograman Java.";
    }
    
	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		boolean ok = true;
		if (!mahasiswa.hasLulusKuliah("AIF102") && !mahasiswa.hasLulusKuliah("AIF192")) {
			reasonsContainer.add("Tidak memenuhi prasyarat lulus AIF102 atau AIF192");
			ok = false;
		}
		int angkatan = mahasiswa.getTahunAngkatan();
		if (angkatan >= 2012 && angkatan <= 2014) {
			if (!mahasiswa.hasTempuhKuliah("AIF203")) {
				reasonsContainer.add("Angkatan " + angkatan + " tetapi tidak memenuhi prasyarat tempuh AIF103");			
				ok = false;
			}
		}
		return ok;
	}

}
