/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

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

    public void testWorldLocations() {
        // TODO Check The Locations have right descriptions.
        World world = new World();

        System.out.println("* UtilsJUnit4Test: WorldTest1 - check Locations");

        assertEquals("by a babbling brook", world.locations.get(0).desc);
    }
}
