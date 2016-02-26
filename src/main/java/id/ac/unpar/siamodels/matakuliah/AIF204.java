package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

import java.util.List;

/**
 * Mata kuliah ini memperkenalkan konsep dan arsitektur DBMS, mengajarkan 
 * aljabar relasional dan SQL serta pemanfaatannya pada pemrograman kueri 
 * sederhana s/d relatif kompleks. Selain itu, mata kuliah ini juga mengajarkan 
 * dan mempraktekkan perancangan basisdata untuk masalah sederhana 
 * (lingkup kecil) termasuk pengembangan program aplikasinya;
 * @author Veronica S. Moertini (moertini@unpar.ac.id)
 */
@MataKuliah(kode = "AIF204", nama = "Manajemen Informasi dan Basis Data", sks = 4)
public class AIF204 implements HasPrasyarat, Wajib, HasPraktikum {

    /**
     * @author Veronica S. Moertini
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
        return "Mata kuliah ini memperkenalkan konsep dan arsitektur DBMS, "
                + "mengajarkan aljabar relasional dan SQL serta pemanfaatannya "
                + "pada pemrograman kueri sederhana s/d relatif kompleks. "
                + "Selain itu, mata kuliah ini juga mengajarkan dan "
                + "mempraktekkan perancangan basisdata untuk masalah sederhana "
                + "(lingkup kecil) termasuk pengembangan program aplikasinya;";
    }
    
	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		boolean ok = true;
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
