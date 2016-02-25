package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

@MataKuliah(kode = "AMS100", nama = "Matematika Informatika", sks = 4)
public class AMS100 implements Wajib {
    
    /**
     * @author Taufik Limansyah, S.Si, MT.
     * @return 
     */
    public String getDeskripsi(){
        return "Sistem Bilangan, Fungsi, Limit dan Kekontinuan Fungsi, Turunan, Integral, Penggunaan Integral, "
                + "Sistem Persamaan Linear, Determinan, Vektor, Nilai dan Vektor Eigen.";
    }
}
