/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.id.ac.unpar.siamodels;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.id.ac.unpar.siamodels.matakuliah.*;

/**
 *
 * @author lenovo
 */
public class MataKuliahFactoryTest {
    
    public MataKuliahFactoryTest() {
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
     * Test of getInstance method, of class MataKuliahFactory.
     */
//    @Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        MataKuliahFactory expResult = main.java.id.ac.unpar.siamodels.MataKuliahFactory@;
//        MataKuliahFactory result = MataKuliahFactory.getInstance();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_3args() {
        System.out.println("createMataKuliah");
        String kode = "AIF152";
        int sks = 3;
        String nama = "walah";
        MataKuliahFactory instance = new MataKuliahFactory();
        MataKuliah result = instance.createMataKuliah(kode, sks, nama);
        MataKuliah expResult = instance.createMataKuliah(kode, sks, nama);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_String() {
        System.out.println("createMataKuliah");
        String kode = "AIF101";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        MataKuliah expResult = matkul;
        MataKuliah result = instance.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        assertEquals(expResult, result);
        
    }
}
