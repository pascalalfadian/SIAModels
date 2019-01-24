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
 * @author firmansp
 */
public class AritmatikaTest {
    
    public AritmatikaTest() {
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
     * Test of add method, of class Aritmatika.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double a = 10.0;
        double b = 6.0;
        Aritmatika instance = new Aritmatika();
        double expResult = 16.0;
        double result = instance.add(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Aritmatika.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double a = 10.0;
        double b = 6.0;
        Aritmatika instance = new Aritmatika();
        double expResult = 4.0;
        double result = instance.subtract(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of times method, of class Aritmatika.
     */
    @Test
    public void testTimes() {
        System.out.println("times");
        double a = 10.0;
        double b = 6.0;
        Aritmatika instance = new Aritmatika();
        double expResult = 60.0;
        double result = instance.times(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Aritmatika.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double a = 10.0;
        double b = 2.0;
        Aritmatika instance = new Aritmatika();
        double expResult = 5.0;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
