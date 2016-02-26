package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

import java.util.List;

/**
 * Mata kuliah ini memperkenalkan kepada mahasiswa konsep dasar tentang *sistem
 * cerdas dan komponen-komponennya. " "Terdapat 4 topik utama yang dibahas yaitu
 * teknik pencarian untuk *penyelesaian masalah, representasi pengetahuan dalam
 * sistem *cerdas, pemodelan ketidakpastian dalam masalah dan teknik
 * pembelajaran mesin.
 *
 * @author Thomas Anung Basuki
 *
 */

@MataKuliah(kode = "AIF301", nama = "Pengantar Sistem Cerdas ", sks = 3)
public class AIF301 implements HasPrasyarat, Wajib {

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasTempuhKuliah("AIF204") && !mahasiswa.hasTempuhKuliah("AIF294")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF204 atau AIF294");
            ok = false;
        }
        return ok;
    }

}
