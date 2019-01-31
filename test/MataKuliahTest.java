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
public class MataKuliahTest {
    String kode = "123";
    int sks = 2;
    String nama = "ABC";
    
    public MataKuliahTest() {
        this.kode = "123";
        this.sks = 2;
        this.nama = "ABC";
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
     * Test of getKode method, of class MataKuliah.
     */
    @Test
    public void testGetKode() {     
        MataKuliah instance = new MataKuliah(kode,nama,sks);
        String expResult = kode;
        String result = instance.getKode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNama method, of class MataKuliah.
     */
    @Test
    public void testGetNama() {
        MataKuliah instance = new MataKuliah(kode,nama,sks);
        String expResult = nama;
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSks method, of class MataKuliah.
     */
    @Test
    public void testGetSks() {
        MataKuliah instance = new MataKuliah(kode,nama,sks);
        Integer expResult = sks;
        Integer result = instance.getSks();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class MataKuliah.
     */
    @Test
    public void testEquals() {
        Object o = new MataKuliah(kode,nama,sks);
        MataKuliah instance = new MataKuliah(kode,nama,sks);
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
}
