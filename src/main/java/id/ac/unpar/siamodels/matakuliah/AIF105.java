package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasResponsi;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

@MataKuliah(kode = "AIF105", nama = "Pengantar Informatika", sks = 3)
public class AIF105 implements Wajib{

    
    /**
     * @author Thomas Anung Basuki 
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
       return "Mata kuliah ini memperkenalkan kepada mahasiswa terminologi dan "
               + "konsep dasar yang akan banyak dipakai sepanjang kuliah di "
               + "Teknik Informatika. Selain itu mata kuliah ini juga "
               + "mempersiapkan dan membiasakan mahasiswa dengan suasana "
               + "akademik yang khas perguruan tinggi seperti kedisiplinan, "
               + "kerja sama, kemampuan menggunakan teknologi informasi dalam "
               + "pembuatan tugas, kemampuan komunikasi, dsb.";
    }

}