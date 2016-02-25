package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasResponsi;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

@MataKuliah(kode = "AIF106", nama = "Sistem Dijital", sks = 3)
public class AIF106 implements Wajib {

    /**
     * @author Mariskha Tri Adithia
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
        return "Mata kuliah ini memberikan pengetahuan tentang cara kerja "
                + "komputer, dimulai dari representasi data dan berbagai macam "
                + "operasinya. Selanjutnya, juga diperkenalkan bagaimana "
                + "merepresentasikan suatu fungsi dalam rangkaian gerbang "
                + "logika, dan bagaimana menyederhanakannya. Berbagai rangkaian "
                + "dasar yang digunakan di dalam komputer juga dipekenalkan. "
                + "Mahasiswa juga akan mempelajari komponen komputer, misalnya "
                + "register dan memori.";
    }

}