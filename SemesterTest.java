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

/**
 *
 * @author lenovo
 */
public class SemesterTest {
    
    public SemesterTest() {
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
     * Test of values method, of class Semester.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Semester[] expResult = null;
        Semester[] result = Semester.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Semester.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Semester expResult = null;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromString method, of class Semester.
     */
    @Test
    public void testFromString() {
        System.out.println("fromString");
        String text = "";
        Semester expResult = null;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrder method, of class Semester.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        Semester instance = null;
        int expResult = 0;
        int result = instance.getOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
