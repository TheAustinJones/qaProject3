/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.board;

import edu.pitt.battleshipgame.common.MoveResult;
import edu.pitt.battleshipgame.common.ships.Carrier;
import edu.pitt.battleshipgame.common.ships.Destroyer;
import edu.pitt.battleshipgame.common.ships.Ship;
import edu.pitt.battleshipgame.common.ships.Ship.ShipType;
import edu.pitt.battleshipgame.common.ships.Submarine;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import static org.mockito.Mockito.*; // why are there errors here????????

/**
 *
 * @author Owner
 */
public class BoardTest {
    
    /*public BoardTest() {
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
    }*/

    // ctrl f6 to run tests
    
    /**
     * Test of getName method, of class Board.
     */
    @Test
    public void testGetName() { // tests if the name returned is the correct name
        System.out.println("getName");
        Board instance = new Board("testName");
        String expResult = "testName";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /*public Board buildBoardTest() {
        Board instance = new Board("test");
        /*for (int i = 1; i <= TEST_SIZE; i++) {
            instance.add(i);
        } /
        
        return instance;
    }*/
    
    /**
     * Test of applyHitMarker method, of class Board.
     */
    @Test
    public void testApplyHitMarker() { // checks if a hit marker is applied
        System.out.println("applyHitMarker");
        Coordinate c = new Coordinate(0, 0);
        Board instance2 = new Board("test");
        instance2.applyHitMarker(c);
        String expResult = " + A  B  C  D  E  F  G  H  I  J \n" +
            " 1 X                            \n" +
            " 2                              \n" +
            " 3                              \n" +
            " 4                              \n" +
            " 5                              \n" +
            " 6                              \n" +
            " 7                              \n" +
            " 8                              \n" +
            " 9                              \n" +
            "10                              \n" +
            "";
        //System.out.println(instance2.toString());
        assertEquals(expResult, instance2.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of applyMissMarker method, of class Board.
     */
    @Test
    public void testApplyMissMarker() { // checks if a miss marker is applied
        System.out.println("applyMissMarker");
        Coordinate c = new Coordinate(0, 0);
        Board instance2 = new Board("test");
        instance2.applyMissMarker(c);
        String expResult = " + A  B  C  D  E  F  G  H  I  J \n" +
            " 1 O                            \n" +
            " 2                              \n" +
            " 3                              \n" +
            " 4                              \n" +
            " 5                              \n" +
            " 6                              \n" +
            " 7                              \n" +
            " 8                              \n" +
            " 9                              \n" +
            "10                              \n" +
            "";
        //System.out.println(instance.toString());
        assertEquals(expResult, instance2.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addShip method, of class Board.
     */
    @Test
    public void testAddShip() { // tests that you can add ships
        System.out.println("addShip");
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        Board instance1 = new Board("test");
        Board instance2 = new Board("test");
        Ship ship = new Destroyer(c1, c2, instance1);
        instance1.addShip(ship);
        instance2.shipList.add(ship);
        assertEquals(instance2.shipList, instance1.shipList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of canAttack method, of class Board.
     */
    @Test
    public void testCanAttack() { // tests true return, attacking an empty space
        System.out.println("canAttack");
        Coordinate c = new Coordinate(0,1);
        Board instance = new Board("test");
        boolean expResult = true;
        boolean result = instance.canAttack(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of canAttack method, of class Board.
     */
    @Test
    public void testCanAttack2() { // tests false return, attacking a spot that has already been attacked
        System.out.println("canAttack");
        
        Coordinate c = new Coordinate(0,1);
        Board instance = new Board("test");
        instance.moves[c.getRow()][c.getCol()] = true;
        boolean expResult = false;
        boolean result = instance.canAttack(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of doAttack method, of class Board.
     */
    @Test
    public void testDoAttack() { // tests missing a ship
        System.out.println("doAttack");
        Coordinate c = new Coordinate(0,1);
        Board instance = new Board("test");
        MoveResult expResult = new MoveResult(false,null);
        MoveResult result = instance.doAttack(c);
        //System.out.println(expResult.toString() + "    " + result.toString());
        //assertTrue(((Object)result).equals(((Object)expResult)));
        //assertThat(result, samePropertyValuesAs((Object)expResult));
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doAttack method, of class Board.
     */
    @Test
    public void testDoAttack2() { // tests if you can hit a ship and not sink it
        System.out.println("doAttack2");
        Coordinate c = new Coordinate(0,1);
        Board instance = new Board("test");
        //Ship mockShip = Mockito.mock(Ship.class);
        
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        //Board instance2 = new Board("test");
        Ship ship = new Destroyer(c1, c2, instance);
        ship.hitCount = 0;
        instance.addShip(ship);
        
        MoveResult expResult = new MoveResult(true,null);
        MoveResult result = instance.doAttack(c);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of doAttack method, of class Board.
     */
    @Test
    public void testDoAttack3() { // tests if you can sink a ship
        System.out.println("doAttack3");
        Coordinate c = new Coordinate(0,1);
        Board instance = new Board("test");
        //Ship mockShip = Mockito.mock(Ship.class);
        
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        //Board instance2 = new Board("test");
        Ship ship = new Destroyer(c1, c2, instance);
        ship.hitCount = 1;
        instance.addShip(ship);
        
        MoveResult expResult = new MoveResult(true, ShipType.DESTROYER);
        MoveResult result = instance.doAttack(c);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of makeMove method, of class Board.
     */
    @Test
    public void testMakeMove() { // tests if you can miss a ship (I don't think this method is used)
        System.out.println("makeMove");
        Coordinate c = new Coordinate(0,1);
        Board instance = new Board("test");
        Ship expResult = null;
        Ship result = instance.makeMove(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of makeMove method, of class Board.
     */
    @Test
    public void testMakeMove2() { // tests if you can strike a ship (I don't think this method is used)
        System.out.println("makeMove2");
        Coordinate c = new Coordinate(0,1);
        Board instance = new Board("test");
        //Ship expResult = null;
        
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        Ship expResult = new Destroyer(c1, c2, instance);
        //ship.hitCount = 1;
        instance.addShip(expResult);
        
        Ship result = instance.makeMove(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of canShipFit method, of class Board.
     */
    @Test
    public void testCanShipFit() { // tests if a ship can fit on an empty board
        System.out.println("canShipFit");
        Board instance = new Board("test");
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        Ship ship = new Destroyer(c1, c2, instance);
        
        boolean expResult = true;
        boolean result = instance.canShipFit(ship);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of canShipFit method, of class Board.
     */
    @Test
    public void testCanShipFit2() { // tests if 2 of the same ship can be placed on the board
        System.out.println("canShipFit2");
        Board instance = new Board("test");
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        Ship ship = new Destroyer(c1, c2, instance);
        instance.addShip(ship);
        
        Coordinate c3 = new Coordinate(1,4);
        Coordinate c4 = new Coordinate(1,5);
        Ship ship2 = new Destroyer(c3, c4, instance);
        
        boolean expResult = false;
        boolean result = instance.canShipFit(ship2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of canShipFit method, of class Board.
     */
    @Test
    public void testCanShipFit3() { // tests if ships can be placed on top of each other
        System.out.println("canShipFit2");
        Board instance = new Board("test");
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        Ship ship = new Destroyer(c1, c2, instance);
        instance.addShip(ship);
        
        Coordinate c3 = new Coordinate(0,1);
        Coordinate c4 = new Coordinate(0,3);
        Ship ship2 = new Submarine(c3, c4, instance);
        
        boolean expResult = false;
        boolean result = instance.canShipFit(ship2);
        assertEquals(expResult, result);
    }

    /**
     * Test of getShipList method, of class Board.
     */
    @Test
    public void testGetShipList() { // tests if getShipList returns the correct list
        System.out.println("getShipList");
        Board instance = new Board("test");
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        Ship ship = new Destroyer(c1, c2, instance);
        instance.addShip(ship);
        //System.out.println(instance.shipList.toString());
        LinkedList<Ship> expResult = new LinkedList<Ship>();
        expResult.add(ship);
        //List<Ship> expResult = null;
        List<Ship> result = instance.getShipList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areAllShipsSunk method, of class Board.
     */
    @Test
    public void testAreAllShipsSunk() { // one ship is not sunk, should return false
        System.out.println("areAllShipsSunk");
        Board instance = new Board("test");
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        Ship ship = new Destroyer(c1, c2, instance);
        instance.addShip(ship);
        
        
        boolean expResult = false;
        boolean result = instance.areAllShipsSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of areAllShipsSunk method, of class Board.
     */
    @Test
    public void testAreAllShipsSunk2() { // all ships are sunk, should return true
        System.out.println("areAllShipsSunk2");
        Board instance = new Board("test");
        Coordinate c1 = new Coordinate(0,1);
        Coordinate c2 = new Coordinate(0,2);
        Ship ship = new Destroyer(c1, c2, instance);
        ship.hitCount = 2;
        instance.addShip(ship);
        
        
        boolean expResult = true;
        boolean result = instance.areAllShipsSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Board.
     */
    @Test
    public void testToString_0args() { // same as test below (false arg toString) 
        //System.out.println("toString");
        boolean showShips = false;
        Board instance = new Board("test");
        String expResult = " + A  B  C  D  E  F  G  H  I  J \n" +
            " 1                              \n" +
            " 2                              \n" +
            " 3                              \n" +
            " 4                              \n" +
            " 5                              \n" +
            " 6                              \n" +
            " 7                              \n" +
            " 8                              \n" +
            " 9                              \n" +
            "10                              \n" +
            "";
        String result = instance.toString(showShips);
        //System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Board.
     */
    @Test
    public void testToString_boolean() { // empty board with false show ships toString test
        //System.out.println("toString");
        boolean showShips = false;
        Board instance = new Board("test");
        String expResult = " + A  B  C  D  E  F  G  H  I  J \n" +
            " 1                              \n" +
            " 2                              \n" +
            " 3                              \n" +
            " 4                              \n" +
            " 5                              \n" +
            " 6                              \n" +
            " 7                              \n" +
            " 8                              \n" +
            " 9                              \n" +
            "10                              \n" +
            "";
        String result = instance.toString(showShips);
        //System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Board.
     */
    @Test
    public void testToString_boolean2() { // board with carrier with true show ships toString test
        System.out.println("toString");
        boolean showShips = true;
        Board instance = new Board("test");
        Coordinate c1 = new Coordinate(0,0);
        Coordinate c2 = new Coordinate(4,0);
        Ship ship = new Carrier(c1, c2, instance);
        instance.addShip(ship);
        
        String expResult = " + A  B  C  D  E  F  G  H  I  J \n" +
            " 1 C                            \n" +
            " 2 C                            \n" +
            " 3 C                            \n" +
            " 4 C                            \n" +
            " 5 C                            \n" +
            " 6                              \n" +
            " 7                              \n" +
            " 8                              \n" +
            " 9                              \n" +
            "10                              \n" +
            "";
        String result = instance.toString(showShips);
        //System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getShipFromCoordinates method, of class Board.
     */
    @Test
    public void testGetShipFromCoordinates() { // tests that we get back the ship we put in
        System.out.println("getShipFromCoordinates");
        Board instance = new Board("test");
        Coordinate c1 = new Coordinate(0,0);
        Coordinate c2 = new Coordinate(4,0);
        Ship expResult = new Carrier(c1, c2, instance);
        instance.addShip(expResult);
        Ship result = instance.getShipFromCoordinates(c1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
