/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class DosenTest {
    
    public DosenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNik method, of class Dosen.
     */
    @Test
    public void testGetNik() {
        System.out.println("getNik");
        Dosen instance = new Dosen("123","ABC");
        String expResult = "123";
        String result = instance.getNik();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNik method, of class Dosen.
     */
    @Test
    public void testSetNik() {
        System.out.println("setNik");
        String nik = "321";
        Dosen instance = new Dosen("123","ABC");
        instance.setNik(nik);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama method, of class Dosen.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Dosen instance = new Dosen("123","ABC");
        String expResult = "ABC";
        String result = instance.getNama();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama method, of class Dosen.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "CBA";
        Dosen instance = new Dosen("123","ABC");
        instance.setNama(nama);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Dosen.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Dosen("123","ABC");
        Dosen instance = new Dosen("123","ABC");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
