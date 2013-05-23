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

    @Test
    /**
     * Test the map for holes TODO Fix this test
     */
    public void testMap() {
        final World testMap = new World();
        Player testPiece = new Player(testMap.locations.get(0));
        int locFound = 0, expFound = 9, locPaths = 0, expPaths = 20; // there are 10 paths, but the program
                                                                     // will recognised that they are multi-directional

        ArrayList<String> fringe = new ArrayList<String>();
        ArrayList<String> visited = new ArrayList<String>();
        ArrayList<String> found = new ArrayList<String>();
        boolean incompleteTest = true;

        while (incompleteTest) {
            System.out.println("Entered Loop - " + (visited.size()+1));
            //Set test for initial loop
            if (fringe.isEmpty()) {
                fringe.add(0, (testPiece.location.desc).toString());
                found.add((testPiece.location.desc).toString());
                locFound++;
            }

            for (Location i : testMap.locations) {
                if (fringe.get(0).compareTo(i.desc) == 0) {
                    testPiece.location = i;
                }
            }
            //Set loop location
            fringe.remove(0);
            visited.add((testPiece.location.desc).toString());

            //Test North Location
            if (testPiece.location.north != null) {
                locPaths++;
                boolean add2Fringe = true;
                for (String i : found) {
                    if ((testPiece.location.north.desc).compareTo(i) == 0) {
                        add2Fringe = false;
                    }
                }
                for (String i : fringe) {
                    if ((testPiece.location.north.desc).compareTo(i) == 0) {
                        add2Fringe = false;
                    }
                }
                if (add2Fringe) {
                    locFound++;
                    fringe.add(0, (testPiece.location.north.desc).toString());
                    found.add(0, (testPiece.location.north.desc).toString());
                }
            }

            //Test East Location
            if (testPiece.location.east != null) {
                locPaths++;
                boolean add2Fringe = true;
                for (String i : found) {
                    if ((testPiece.location.east.desc).compareTo(i) == 0) {
                        add2Fringe = false;
                    }
                }
                for (String i : fringe) {
                    if ((testPiece.location.east.desc).compareTo(i) == 0) {
                        add2Fringe = false;
                    }
                }
                if (add2Fringe) {
                    locFound++;
                    fringe.add(0, (testPiece.location.east.desc).toString());
                    found.add(0, (testPiece.location.east.desc).toString());
                }
            }

            //Test South Location
            if (testPiece.location.south != null) {
                locPaths++;
                boolean add2Fringe = true;
                for (String i : found) {
                    if ((testPiece.location.south.desc).compareTo(i) == 0) {
                        add2Fringe = false;
                    }
                }
                for (String i : fringe) {
                    if ((testPiece.location.south.desc).compareTo(i) == 0) {
                        add2Fringe = false;
                    }
                }
                if (add2Fringe) {
                    locFound++;
                    fringe.add(0, (testPiece.location.south.desc).toString());
                    found.add(0, (testPiece.location.south.desc).toString());
                }
            }

            //Test West Location
            if (testPiece.location.west != null) {
                locPaths++;
                boolean add2Fringe = true;
                for (String i : found) {
                    if ((testPiece.location.west.desc).compareTo(i) == 0) {
                        add2Fringe = false;
                    }
                }
                for (String i : fringe) {
                    if ((testPiece.location.west.desc).compareTo(i) == 0) {
                        add2Fringe = false;
                    }
                }
                if (add2Fringe) {
                    locFound++;
                    fringe.add(0, (testPiece.location.west.desc).toString());
                    found.add(0, (testPiece.location.west.desc).toString());
                }
            }
            
            if (fringe.isEmpty()) {
                incompleteTest = false;
            }
        }//end of while loop

        System.out.println("Locations expected: " + expFound + " - Locations Found: " + locFound);
        assertEquals(expFound, locFound);
        System.out.println("Borders expected: " + expPaths + " - Borders Found: " + locPaths);
        assertEquals(expPaths, locPaths);
    }
}
