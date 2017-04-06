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
public class CarrierTest {
    
    public CarrierTest() {
    }

    /**
     * Test of getLength method, of class Carrier.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Carrier instance = new Carrier();
        int expResult = 5;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of maxAllowed method, of class Carrier.
     */
    @Test
    public void testMaxAllowed() {
        System.out.println("maxAllowed");
        Carrier instance = new Carrier();
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class Carrier.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Carrier instance = new Carrier();
        String expResult = "Carrier";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getType method, of class Carrier.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Carrier instance = new Carrier();
        Ship.ShipType expResult = ShipType.CARRIER;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
