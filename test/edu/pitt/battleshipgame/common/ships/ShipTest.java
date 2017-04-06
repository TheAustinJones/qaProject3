/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.ships;

import edu.pitt.battleshipgame.common.board.Board;
import edu.pitt.battleshipgame.common.board.Coordinate;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class ShipTest {
    
    public ShipTest() {
    }

    /**
     * Test of SetStartEnd method, of class Ship.
     */
    @Test
    public void testSetStartEnd() {
        System.out.println("SetStartEnd");
        Coordinate s = new Coordinate(0,0);
        Coordinate e = new Coordinate(0,1);
        Ship instance = new Destroyer();
        Board b = new Board("test");
        Ship instance2 = new Destroyer(s, e, b);
        //Ship 
        instance.SetStartEnd(s, e);
        assertEquals(instance2.toString(), instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCoordinates method, of class Ship.
     */
    @Test
    public void testGetCoordinates() { // tests getting the correct coordinates horizontally
        System.out.println("getCoordinates");
        Coordinate s = new Coordinate(0,0);
        Coordinate e = new Coordinate(0,1);
        Board b = new Board("test");
        Ship instance = new Destroyer(s,e,b);
        List<Coordinate> expResult = new LinkedList<Coordinate>();
        expResult.add(s);
        expResult.add(e);
        //System.out.println(expResult.toString());
        List<Coordinate> result = instance.getCoordinates();
        //System.out.println(result.toString());
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isSunk method, of class Ship.
     */
    @Test
    public void testIsSunk() {
        System.out.println("isSunk");
        Ship instance = new ShipImpl();
        boolean expResult = false;
        boolean result = instance.isSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addBoard method, of class Ship.
     */
    @Test
    public void testAddBoard() {
        System.out.println("addBoard");
        Board board = null;
        Ship instance = new ShipImpl();
        instance.addBoard(board);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerHit method, of class Ship.
     */
    @Test
    public void testRegisterHit() {
        System.out.println("registerHit");
        Ship instance = new ShipImpl();
        instance.registerHit();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLength method, of class Ship.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Ship instance = new ShipImpl();
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of maxAllowed method, of class Ship.
     */
    @Test
    public void testMaxAllowed() {
        System.out.println("maxAllowed");
        Ship instance = new ShipImpl();
        int expResult = 0;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class Ship.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Ship instance = new ShipImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getType method, of class Ship.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Ship instance = new ShipImpl();
        Ship.ShipType expResult = null;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    public class ShipImpl extends Ship {

        public int getLength() {
            return 0;
        }

        public int maxAllowed() {
            return 0;
        }

        public String getName() {
            return "";
        }

        public ShipType getType() {
            return null;
        }
    }
    
}
