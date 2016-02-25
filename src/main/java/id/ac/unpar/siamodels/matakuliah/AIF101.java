package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.*;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;
import java.util.List;

@MataKuliah(kode = "AIF101", nama = "Pemrograman Berorientasi Objek", sks = 6)
public class AIF101 implements Wajib, HasPraktikum {

    /**
     * @author Lionov
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
        return "Mata kuliah ini memperkenalkan kepada mahasiswa konsep "
                + "dasar pemrograman seperti pengulangan dan percabangan, konsep"
                + " dasar penyimpanan data kontigu menggunakan array, konsep "
                + "dasar pemrograman berorientasi objek seperti kelas & objek, "
                + "method, dll, termasuk di dalamnya 4 prinsip dasar pemrograman"
                + " berorientasi objek : data abstraction, encapsulation, "
                + "inheritance dan polymorphism. \n" + "Selain, itu diberikan "
                + "masalah-masalah komputasi sederhana yang harus diselesaikan "
                + "menggunakan konsep-konsep yang  sudah diperkenalkan dan "
                + "mengimplementasikannya menggunakan bahasa pemrograman Java";
    }

}
