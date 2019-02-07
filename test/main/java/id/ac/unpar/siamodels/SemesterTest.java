package id.ac.unpar.siamodels;

import org.junit.Test;
import static org.junit.Assert.*;

public class SemesterTest {

    public SemesterTest() {
    }

    /**
     * Test of values method, of class Semester.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Semester[] expResult = Semester.values();
        Semester[] result = Semester.values();
        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Semester.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "PENDEK";
        Semester expResult = Semester.PENDEK;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of fromString method, of class Semester.
     */
    @Test
    public void testFromString() {
        System.out.println("fromString");
        String text = "PENDEK";
        Semester expResult = Semester.PENDEK;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrder method, of class Semester.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        Semester instance = Semester.fromString("PENDEK");
        int expResult = 10;
        int result = instance.getOrder();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
