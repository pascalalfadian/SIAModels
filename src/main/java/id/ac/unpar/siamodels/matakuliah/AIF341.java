package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.Pilihan;

@MataKuliah(kode = "AIF341", nama = "Administrasi Jaringan Komputer 1", sks = 3)
public class AIF341 implements Pilihan, HasPraktikum{
    
    /**
     * @author Chandra Wijaya, ST., MT. (chandraw@unpar.ac.id)
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
        return "Mata kuliah ini memperkenalkan kepada mahasiswa konsep dasar jaringan dan aplikasinya di kehidupan "
                + "sehari-hari. Mahasiswa dikenalkan dengan teknologi-teknologi terbaru di bidang jaringan, sehingga "
                + "mahasiswa memiliki pengetahuan yang dapat digunakan dalam kehidupan sehari-hari. Selain itu mahasiswa "
                + "juga diperkenalkan dengan NetAcad, sebuah layanan dari Cisco yang dapat digunakan untuk memenuhi segala "
                + "macam kebutuhan terkait dengan Cisco Academy. ";
    }
}
