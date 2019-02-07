package id.ac.unpar.siamodels;

import org.junit.Test;
import static org.junit.Assert.*;

public class MataKuliahFactoryTest {

    public MataKuliahFactoryTest() {
    }

    /**
     * Test of getInstance method, of class MataKuliahFactory.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MataKuliahFactory expResult = MataKuliahFactory.getInstance();
        MataKuliahFactory result = MataKuliahFactory.getInstance();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_3args() {
        System.out.println("createMataKuliah");
        String kode = "123";
        int sks = 2;
        String nama = "ABC";
        MataKuliahFactory instance = new MataKuliahFactory();
        MataKuliah expResult = new MataKuliah(kode, nama, sks);
        MataKuliah result = instance.createMataKuliah(kode, sks, nama);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_String() {
        System.out.println("createMataKuliah");
        String kode = "123";
        MataKuliahFactory instance = new MataKuliahFactory();
        instance.createMataKuliah(kode, 2, "AIF312");
        MataKuliah expResult = new MataKuliah(kode, "AIF312", 2);
        MataKuliah result = instance.createMataKuliah(kode);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
