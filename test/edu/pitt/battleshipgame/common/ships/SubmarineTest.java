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
public class SubmarineTest {
    
    public SubmarineTest() {
    }

    /**
     * Test of getLength method, of class Submarine.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Submarine instance = new Submarine();
        int expResult = 3;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of maxAllowed method, of class Submarine.
     */
    @Test
    public void testMaxAllowed() {
        System.out.println("maxAllowed");
        Submarine instance = new Submarine();
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class Submarine.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Submarine instance = new Submarine();
        String expResult = "Submarine";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getType method, of class Submarine.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Submarine instance = new Submarine();
        Ship.ShipType expResult = ShipType.SUBMARINE;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
