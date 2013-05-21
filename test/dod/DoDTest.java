/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Jasan
 */
public class DoDTest {

    public DoDTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class DoD.
     */
    @Test
   // public void testMain() {
   //     System.out.println("main");
   //     String[] args = null;
   //     DoD.main(args);
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
   // }

    public void testStartWorldName() {
        // TODO Check The Locations have right descriptions.
        World world = new World();

        System.out.println("* UtilsJUnit4Test: WorldTest1 - check Locations");

        assertEquals("by a babbling brook", world.locations.get(0).desc);
    }
    public void testMap(){
        World testMap = new World();
        Player testPiece = new Player(testMap.locations.get(0));
        
        ArrayList<Location> fringe = null, visited = null;
        boolean incompleteTest = true;
        
        fringe.add(0, testMap.locations.get(0));
        
        while (incompleteTest){
            if (){
                
            }
            if (fringe.get(0) == null){
                incompleteTest = false;
            }
        }
    }
}
