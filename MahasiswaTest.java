/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.id.ac.unpar.siamodels;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class MahasiswaTest {
    
    public MahasiswaTest() {
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
     * Test of getNama method, of class Mahasiswa.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setNama("Michael Walah");
        String expResult = "Michael Walah";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNama method, of class Mahasiswa.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "Michael Walah";
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setNama(nama);
    }

    /**
     * Test of getNpm method, of class Mahasiswa.
     */
    @Test
    public void testGetNpm() {
        System.out.println("getNpm");
        Mahasiswa instance = new Mahasiswa("2014730019");
        String expResult = "2014730019";
        String result = instance.getNpm();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhotoURL method, of class Mahasiswa.
     */
    @Test
    public void testGetPhotoURL() throws MalformedURLException {
        System.out.println("getPhotoURL");
        Mahasiswa instance = new Mahasiswa("2010310045");
        URL myURL = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
        instance.setPhotoURL(myURL);
        URL expResult = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
        URL result = instance.getPhotoURL();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhotoURL method, of class Mahasiswa.
     */
    @Test
    public void testSetPhotoURL() throws MalformedURLException {
        System.out.println("setPhotoURL");
        URL photoURL = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
        Mahasiswa instance = new Mahasiswa("2010310045");
        instance.setPhotoURL(photoURL);
    }

    /**
     * Test of getJadwalKuliahList method, of class Mahasiswa.
     */
    @Test
    public void testGetJadwalKuliahList() {
        System.out.println("getJadwalKuliahList");
        Mahasiswa instance = null;
        List<JadwalKuliah> expResult = null;
        List<JadwalKuliah> result = instance.getJadwalKuliahList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJadwalKuliahList method, of class Mahasiswa.
     */
    @Test
    public void testSetJadwalKuliahList() {
        System.out.println("setJadwalKuliahList");
        List<JadwalKuliah> jadwalKuliahList = null;
        Mahasiswa instance = null;
        instance.setJadwalKuliahList(jadwalKuliahList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailAddress method, of class Mahasiswa.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Mahasiswa instance = new Mahasiswa("2014730019");
        String email = "7314019@student.unpar.ac.id";
        String expResult = "7314019@student.unpar.ac.id";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRiwayatNilai method, of class Mahasiswa.
     */
    @Test
    public void testGetRiwayatNilai() {
        System.out.println("getRiwayatNilai");
        Mahasiswa instance = null;
        List<Mahasiswa.Nilai> expResult = null;
        List<Mahasiswa.Nilai> result = instance.getRiwayatNilai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNilaiTOEFL method, of class Mahasiswa.
     */
    @Test
    public void testGetNilaiTOEFL() {
        System.out.println("getNilaiTOEFL");
        Mahasiswa instance = null;
        SortedMap<LocalDate, Integer> expResult = null;
        SortedMap<LocalDate, Integer> result = instance.getNilaiTOEFL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNilaiTOEFL method, of class Mahasiswa.
     */
    @Test
    public void testSetNilaiTOEFL() {
        System.out.println("setNilaiTOEFL");
        SortedMap<LocalDate, Integer> nilaiTOEFL = null;
        Mahasiswa instance = null;
        instance.setNilaiTOEFL(nilaiTOEFL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateIPKLulus method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPKLulus() {
        System.out.println("calculateIPKLulus");
        Mahasiswa instance = null;
        double expResult = 0.0;
        double result = instance.calculateIPKLulus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateIPLulus method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPLulus() {
        System.out.println("calculateIPLulus");
        Mahasiswa instance = null;
        double expResult = 0.0;
        double result = instance.calculateIPLulus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateIPTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPTempuh() {
        System.out.println("calculateIPTempuh");
        boolean lulusSaja = false;
        Mahasiswa instance = null;
        double expResult = 0.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateIPKumulatif method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPKumulatif() {
        System.out.println("calculateIPKumulatif");
        Mahasiswa instance = null;
        double expResult = 0.0;
        double result = instance.calculateIPKumulatif();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateIPKTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPKTempuh() {
        System.out.println("calculateIPKTempuh");
        boolean lulusSaja = false;
        Mahasiswa instance = null;
        double expResult = 0.0;
        double result = instance.calculateIPKTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateIPS method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPS() {
        System.out.println("calculateIPS");
        Mahasiswa instance = null;
        double expResult = 0.0;
        double result = instance.calculateIPS();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateSKSLulus method, of class Mahasiswa.
     */
    @Test
    public void testCalculateSKSLulus() {
        System.out.println("calculateSKSLulus");
        Mahasiswa instance = null;
        int expResult = 0;
        int result = instance.calculateSKSLulus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateSKSTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateSKSTempuh() {
        System.out.println("calculateSKSTempuh");
        boolean lulusSaja = false;
        Mahasiswa instance = null;
        int expResult = 0;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTahunSemesterAktif method, of class Mahasiswa.
     */
    @Test
    public void testCalculateTahunSemesterAktif() {
        System.out.println("calculateTahunSemesterAktif");
        Mahasiswa instance = null;
        Set<TahunSemester> expResult = null;
        Set<TahunSemester> result = instance.calculateTahunSemesterAktif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasLulusKuliah method, of class Mahasiswa.
     */
    @Test
    public void testHasLulusKuliah() {
        System.out.println("hasLulusKuliah");
        String kodeMataKuliah = "";
        Mahasiswa instance = null;
        boolean expResult = false;
        boolean result = instance.hasLulusKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasTempuhKuliah method, of class Mahasiswa.
     */
    @Test
    public void testHasTempuhKuliah() {
        System.out.println("hasTempuhKuliah");
        String kodeMataKuliah = "";
        Mahasiswa instance = null;
        boolean expResult = false;
        boolean result = instance.hasTempuhKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTahunAngkatan method, of class Mahasiswa.
     */
    @Test
    public void testGetTahunAngkatan() {
        System.out.println("getTahunAngkatan");
        Mahasiswa instance = null;
        int expResult = 0;
        int result = instance.getTahunAngkatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Mahasiswa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mahasiswa instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
