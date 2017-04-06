/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.ships;

import edu.pitt.battleshipgame.common.board.Board;
import edu.pitt.battleshipgame.common.board.Coordinate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class ShipFactoryTest {
    
    public ShipFactoryTest() {
    }

    /**
     * Test of newShipFromType method, of class ShipFactory.
     */
    @Test
    public void testNewShipFromType_4args() {
        System.out.println("newShipFromType");
        Ship.ShipType type = null;
        Coordinate start = null;
        Coordinate end = null;
        Board board = null;
        Ship expResult = null;
        Ship result = ShipFactory.newShipFromType(type, start, end, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of newShipFromType method, of class ShipFactory.
     */
    @Test
    public void testNewShipFromType_ShipShipType() {
        System.out.println("newShipFromType");
        Ship.ShipType t = null;
        Ship expResult = null;
        Ship result = ShipFactory.newShipFromType(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of maxAllowedFromType method, of class ShipFactory.
     */
    @Test
    public void testMaxAllowedFromType() {
        System.out.println("maxAllowedFromType");
        Ship.ShipType type = null;
        int expResult = 0;
        int result = ShipFactory.maxAllowedFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNameFromType method, of class ShipFactory.
     */
    @Test
    public void testGetNameFromType() {
        System.out.println("getNameFromType");
        Ship.ShipType type = null;
        String expResult = "";
        String result = ShipFactory.getNameFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkShipLength method, of class ShipFactory.
     */
    @Test
    public void testCheckShipLength() {
        System.out.println("checkShipLength");
        Ship.ShipType type = null;
        Coordinate start = null;
        Coordinate end = null;
        boolean expResult = false;
        boolean result = ShipFactory.checkShipLength(type, start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkForDiagonal method, of class ShipFactory.
     */
    @Test
    public void testCheckForDiagonal() {
        System.out.println("checkForDiagonal");
        Coordinate start = null;
        Coordinate end = null;
        boolean expResult = false;
        boolean result = ShipFactory.checkForDiagonal(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
