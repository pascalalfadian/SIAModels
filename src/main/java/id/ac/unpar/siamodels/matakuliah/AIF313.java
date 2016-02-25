package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.PilihanWajib;

@MataKuliah(kode = "AIF313", nama = "Grafika Komputer", sks = 2)
public class AIF313 implements PilihanWajib,HasPraktikum {
    
    /**
     * @Luciana (luciana@unpar.ac.id)
     * return deskripsi mata kuliah
    */
    public String getDeskripsi() {
        return "Mata kuliah ini memperkenalkan kepada mahasiswa konsep dasar pembuatan grafik dengan menggunakan komputer seperti mengenal berbagai algoritma pembuatan primitif 2 dimensi seperti titik, garis, lingkaran, elips, berbagai macam bentuk kurva, "
                + "fraktal, konsep warna (RGB), dasar-dasar grafika 3 dimensi seperti pewarnaan, pencahayaan, pemberian tekstur pada objek, transformasi, animasi, dan sebagainya. \n" 
                +"Selain, itu diberikan masalah-masalah komputasi sederhana yang harus diselesaikan menggunakan konsep-konsep yang  sudah diperkenalkan dan mengimplementasikannya menggunakan bahasa pemrograman Java.";
    }
    
}