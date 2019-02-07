package id.ac.unpar.siamodels;

import org.junit.Test;
import static org.junit.Assert.*;

public class DosenTest {

    public DosenTest() {
    }

    /**
     * Test of getNik method, of class Dosen.
     */
    @Test
    public void testGetNik() {
        System.out.println("getNik");
        Dosen instance = new Dosen("12345", "Tetetoet");
        String expResult = "12345";
        String result = instance.getNik();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNik method, of class Dosen.
     */
    @Test
    public void testSetNik() {
        System.out.println("setNik");
        String nik = "54321";
        Dosen instance = new Dosen("12345", "Tetetoet");
        instance.setNik(nik);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama method, of class Dosen.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Dosen instance = new Dosen("12345", "Tetetoet");
        String expResult = "Tetetoet";
        String result = instance.getNama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama method, of class Dosen.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "Teteotet";
        Dosen instance = new Dosen("12345", "Tetetoet");
        instance.setNama(nama);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Dosen.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Dosen("12345", "Tetetoet");
        Dosen instance = new Dosen("54321", "Teteotet");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
