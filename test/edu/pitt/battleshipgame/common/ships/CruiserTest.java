/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.ships;

import edu.pitt.battleshipgame.common.ships.Ship.ShipType;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class CruiserTest {
    
    public CruiserTest() {
    }

    /**
     * Test of getLength method, of class Cruiser.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Cruiser instance = new Cruiser();
        int expResult = 3;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of maxAllowed method, of class Cruiser.
     */
    @Test
    public void testMaxAllowed() {
        System.out.println("maxAllowed");
        Cruiser instance = new Cruiser();
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class Cruiser.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Cruiser instance = new Cruiser();
        String expResult = "Cruiser";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getType method, of class Cruiser.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Cruiser instance = new Cruiser();
        Ship.ShipType expResult = ShipType.CRUISER;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
