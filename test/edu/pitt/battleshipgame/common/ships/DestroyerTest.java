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
public class DestroyerTest {
    
    public DestroyerTest() {
    }

    /**
     * Test of getLength method, of class Destroyer.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Destroyer instance = new Destroyer();
        int expResult = 2;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of maxAllowed method, of class Destroyer.
     */
    @Test
    public void testMaxAllowed() {
        System.out.println("maxAllowed");
        Destroyer instance = new Destroyer();
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class Destroyer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Destroyer instance = new Destroyer();
        String expResult = "Destroyer";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getType method, of class Destroyer.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Destroyer instance = new Destroyer();
        Ship.ShipType expResult = ShipType.DESTROYER;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
