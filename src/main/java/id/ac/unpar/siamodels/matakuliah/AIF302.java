package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

import java.util.List;

@MataKuliah(kode = "AIF302", nama = "Penulisan Ilmiah", sks = 2)
public class AIF302 implements HasPrasyarat, Wajib {

    /**
     * @author Thomas Anung Basuki
     * @return deskripsi mata kuliah
     */
    
    public String getDeskripsi(){
        return "Mata kuliah ini melatih mahasiswa dalam menulis ilmiah serta memperkenalkan metodologi penelitian serta kakas untuk menulis ilmiah.";
    }
	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		int sksLulus = mahasiswa.calculateSKSLulus();
		if (sksLulus < 84) {
			reasonsContainer.add("SKS Lulus " + sksLulus + ", belum mencapai syarat minimal 84");			
			return false;
		}
		return true;
	}

}
