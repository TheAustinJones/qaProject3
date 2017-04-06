/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.ships;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class BattleshipTest {
    
    public BattleshipTest() {
    }

    /**
     * Test of getLength method, of class Battleship.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Battleship instance = new Battleship();
        int expResult = 4;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of maxAllowed method, of class Battleship.
     */
    @Test
    public void testMaxAllowed() {
        System.out.println("maxAllowed");
        Battleship instance = new Battleship();
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Battleship.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Battleship instance = new Battleship();
        String expResult = "Battleship";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Battleship.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Battleship instance = new Battleship();
        Ship.ShipType expResult = Ship.ShipType.BATTLESHIP;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
