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
 * @author User
 */
public class TahunSemesterTest {
    
    public TahunSemesterTest() {
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
     * Test of getSemester method, of class TahunSemester.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        TahunSemester instance = new TahunSemester(2016,Semester.GANJIL);
        Semester expResult = Semester.GANJIL;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTahun method, of class TahunSemester.
     */
    @Test
    public void testGetTahun() {
        System.out.println("getTahun");
        TahunSemester instance = new TahunSemester(2016,Semester.GANJIL);
        int expResult = 2016;
        int result = instance.getTahun();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getKodeDPS method, of class TahunSemester.
     */
    @Test
    public void testGetKodeDPS() {
        System.out.println("getKodeDPS");
        TahunSemester instance = new TahunSemester("161");
        String expResult = "161";
        String result = instance.getKodeDPS();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class TahunSemester.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        TahunSemester o = new TahunSemester(2016,Semester.GANJIL);
        TahunSemester instance = new TahunSemester(2015,Semester.GANJIL);
        int expResult = -1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class TahunSemester.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new TahunSemester(2016,Semester.GANJIL);
        TahunSemester instance = new TahunSemester(2016,Semester.GANJIL);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TahunSemester.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TahunSemester instance = new TahunSemester(2016,Semester.GANJIL);
        String expResult = "TahunSemester [2016/GANJIL]";
        String result = instance.toString();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
