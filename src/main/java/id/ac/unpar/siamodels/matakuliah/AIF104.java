package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasResponsi;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

@MataKuliah(kode = "AIF104", nama = "Logika Informatika", sks = 3)
public class AIF104 implements Wajib, HasPraktikum, HasResponsi {

    
    /**
     * @author Mariskha Tri Adithia 
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
        return "Mata kuliah ini memberikan pengetahuan tentang logika yang "
                + "digunakan di dalam ilmu komputer. Dalam kuliah ini, "
                + "mahasiswa belajar untuk bisa memodelkan suatu kalimat dalam "
                + "kehidupan sehari-hari, ke dalam kalimat dengan sintaks "
                + "tertentu, yang hanya memiliki satu arti. Lalu, diperkenalkan"
                + " juga, bagaimana mengartikan suatu kalimat (benar atau salah)"
                + " dan bagaimana menentukan sifat dari kalimat tersebut.";
    }

}