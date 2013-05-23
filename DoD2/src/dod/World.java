/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author tdahl01
 */
public class World {

    ArrayList<Location> locations;

    World() {
        Location bb = new Location("by a babbling brook", 0);
        Location mm = new Location("up in some misty mountains", 1);
        Location dc = new Location("in the cave of Gwent the dragon", 2);
        Location sf = new Location("in a sunny field", 3);
        Location go = new Location("by a great oak", 4);
        Location ms = new Location("in some murky marshes", 5);
        Location tr = new Location("in some deserted tower ruins", 6);
        Location hc = new Location("on top of some high cliffs", 7);
        Location lb = new Location("on a lonely beach", 8);

        bb.setExits(sf, mm, null, null);
        mm.setExits(go, dc, null, bb);
        dc.setExits(null, null, null, mm);
        sf.setExits(tr, go, bb, null);
        go.setExits(hc, ms, mm, sf);
        ms.setExits(lb, null, null, go);
        tr.setExits(null, null, sf, null);
        hc.setExits(null, lb, go, null);
        lb.setExits(null, null, ms, hc);

        Location[] ls = new Location[]{bb, mm, dc, sf, go, ms, tr, hc, lb};
        locations = new ArrayList(Arrays.asList(ls));
    }

    public static void describe(int i) {
        switch (i) {
            case 0:
                System.out.println("You are by the babbling brook.");
                System.out.println("This is where you have started your quest.");
                System.out.println("Weary of the long journey you have, you fill your water bottle in the stream.");
                System.out.println("There is a path going north, or a path going east.");
                break;
            case 1:
                System.out.println("You are up the misty mountains.");
                System.out.println("You can't see far and the fog is rolling in.");
                System.out.println("There is a path to the west, a road to the north");
                System.out.println("and a dark shadow up the mountain to the east.");
                break;
            case 2:
                System.out.println("You are inside of the dragons cave.");
                System.out.println("In the shadows you think you see movement and you hear an echoing roar.");
                System.out.println("Now you must decide if you RUN or FIGHT.");
                System.out.println("The only escape from the cave is to the west.");
                break;
            case 3:
                System.out.println("You are in a sunny field.");
                System.out.println("It is warm here but you feel exposed.");
                System.out.println("There is a path going from the south to the north,");
                System.out.println("and a road going to the east.");
                break;
            case 4:
                System.out.println("You are by the crossroads of the Great Oak.");
                System.out.println("This tree has always marked the centre of the world.");
                System.out.println("From here the roads travel north to south");
                System.out.println("and east to west.");
                break;
            case 5:
                System.out.println("You are wading through the murky marshes.");
                System.out.println("In your struggle you drop everything that you hold.");
                System.out.println("To the east you can make out the silhouette of a tree");
                System.out.println("and to the north is the smell of the sea.");
                break;
            case 6:
                System.out.println("You are in the decayed ruins of a tower.");
                System.out.println("It is dark in here, and you climb a stairs slowly.");
                System.out.println("In the darkness you can glimpse the shining blade of a sword.");
                System.out.println("There is only one path going south.");
                break;
            case 7:
                System.out.println("You are climbing a high cliff.");
                System.out.println("On the branch of a struggling twiggy tree hangs a lamp.");
                System.out.println("Gulls are flying beneath you to the east");
                System.out.println("and there is a road not far from you leading south.");
                break;
            case 8:
                System.out.println("You are reflecting on a lonely beach.");
                System.out.println("This far from where you started your journey, you rest.");
                System.out.println("There is a chalkface to the east with many footholes");
                System.out.println("or a little winding path to the south.");
                break;
        }
    }
}
