package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

import java.util.List;

/**
 * Mata kuliah ini memperkenalkan kepada mahasiswa tahapan rekayasa perangkat 
 * lunak, terutama dengan paradigma berorientasi objek, dilengkapi dengan 
 * pengenalan tentang manajemen proyek perangkat lunak.
 * Selain, itu diberikan deskripsi proyek berskala kecil yang harus dikerjakan 
 * oleh mahasiswa dalam kelompok dengan menerapkan teori yang telah 
 * dipelajarinya.
 * @author Thomas Anung Basuki (anung@unpar.ac.id)
 */
@MataKuliah(kode = "AIF208", nama = "Rekayasa Perangkat Lunak", sks = 4)
public class AIF208 implements HasPrasyarat, Wajib {

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        if (!mahasiswa.hasTempuhKuliah("AIF201")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF201");
            return false;
        }
        return true;
    }

}
