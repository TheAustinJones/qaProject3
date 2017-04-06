/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.board;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class CoordinateTest {
    
    public CoordinateTest() {
    }
    /*
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
*/
    /**
     * Test of setCoordinates method, of class Coordinate.
     */
    @Test
    public void testSetCoordinates() { // tests if string "A:1" can be converted to a coordinate
        System.out.println("setCoordinates");
        String coord = "A:1";
        Coordinate instance = new Coordinate(5,5);
        instance.setCoordinates(coord);
        //System.out.println(instance.toString());
        assertEquals(instance.toString(), "A:1");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCol method, of class Coordinate.
     */
    @Test
    public void testSetCol() { // tests setting a column to a coordinate
        System.out.println("setCol");
        int _col = 0;
        Coordinate instance = new Coordinate(5,5);
        instance.setCol(_col);
        //System.out.println(instance.toString());
        assertEquals(instance.toString(), "A:6");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRow method, of class Coordinate.
     */
    @Test
    public void testSetRow() { // tests setting a row to a coordinate
        System.out.println("setRow");
        int _row = 0;
        Coordinate instance = new Coordinate(5,5);
        instance.setRow(_row);
        //System.out.println(instance.toString());
        assertEquals("F:1", instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRow method, of class Coordinate.
     */
    @Test
    public void testGetRow() { // tests if we get back the row we set it to
        System.out.println("getRow");
        //int _row = 0;
        Coordinate instance = new Coordinate(4,5);
        //instance.setRow(_row);
        //System.out.println(instance.toString());
        assertEquals(4, instance.getRow());
    }

    /**
     * Test of getCol method, of class Coordinate.
     */
    @Test
    public void testGetCol() { // tests if we get back the col we set it to
        System.out.println("getCol");
        Coordinate instance = new Coordinate(4,5);
        //instance.setRow(_row);
        //System.out.println(instance.toString());
        assertEquals(5, instance.getCol());
    }

    /**
     * Test of columnLookup method, of class Coordinate.
     */
    @Test
    public void testColumnLookup() { // give a char column name, tests getting correct associated number back
        System.out.println("columnLookup");
        char colName = 'A';
        int expResult = 0;
        int result = Coordinate.columnLookup(colName);
        //System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of reverseColumnLookup method, of class Coordinate.
     */
    @Test
    public void testReverseColumnLookup() { // give an int column name, tests getting correct associated char back
        System.out.println("reverseColumnLookup");
        int col = 0;
        char expResult = 'A';
        char result = Coordinate.reverseColumnLookup(col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Coordinate.
     */
    @Test
    public void testToString() { // tests that the toString returns a properly formatted Coordinate string
        System.out.println("toString");
        Coordinate instance = new Coordinate(0,0);
        String expResult = "A:1";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
