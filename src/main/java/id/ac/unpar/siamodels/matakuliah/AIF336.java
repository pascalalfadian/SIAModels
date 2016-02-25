package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.Pilihan;

@MataKuliah(kode = "AIF336", nama = "Algoritma Kriptografi", sks = 3)
public class AIF336 implements Pilihan{
    
    /**
     * @author Mariskha Tri Adithia (mariskha@unpar.ac.id)
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
        return "Mata kuliah ini merupakan mata kuliah lanjutan dari mata kuliah Keamanan Informasi, "
                + "dengan titik berat pada materi kriptografi. Mata kuliah ini memperkenalkan tambahan konsep kriptografi, "
                + "misalnya tentang otentikasi yaitu otentikasi entitas, manajemen kunci, dan bentuk lain dari metode merahasiakan "
                + "pesan, yaitu dengan menggunakan secret sharing. Selanjutnya, diperkenalkan juga penggunaan kriptografi pada "
                + "protokol-protokol yang sebenarnya banyak digunakan sehari-hari, misalnya pada e-cash, auction, dan electronic "
                + "voting.";
    }
}
