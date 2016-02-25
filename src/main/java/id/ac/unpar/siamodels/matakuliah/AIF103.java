package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasResponsi;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

@MataKuliah(kode = "AIF103", nama = "Matematika Diskrit", sks = 3)
public class AIF103 implements Wajib{

    /**
     * @author Mariskha Tri Adithia
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
        return "Mata kuliah ini merupakan salah satu cara untuk "
                + "mencapai kompetensi dasar tentang matematika diskrit yang "
                + "prinsipnya banyak digunakan dalam bidang ilmu komputer. "
                + "Selain itu, kuliah ini juga merupakan cara untuk membentuk "
                + "pola pikir logis yang dibutuhkan untuk menempuh kuliah-kuliah"
                + " di tingkat yang lebih tinggi.";
    }
}