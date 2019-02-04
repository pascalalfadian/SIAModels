package main.java.id.ac.unpar.siamodels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import main.java.id.ac.unpar.siamodels.Dosen;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
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

    /**
     * Test of getNik method, of class Dosen.
     */
    @Test
    public void testGetNik() {
        System.out.println("getNik");
        Dosen instance = new Dosen("119015", "Pascal");
        String expResult = "119015";
        String result = instance.getNik();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNik method, of class Dosen.
     */
    @Test
    public void testSetNik() {
        System.out.println("setNik");
        String nik = "119015";
        Dosen instance = new Dosen(nik, "Pascal");
        instance.setNik(nik);
    }

    /**
     * Test of getNama method, of class Dosen.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Dosen instance = new Dosen("2015","rafael");
        String expResult = "rafael";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNama method, of class Dosen.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "Keenan";
        Dosen instance = new Dosen("140058", "Keenan");
        instance.setNama(nama);
    }

    /**
     * Test of equals method, of class Dosen.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Dosen("141401", "Keenan");
        Dosen instance = new Dosen("121109", "Jhon");
        boolean expResult = obj.equals(instance);
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
