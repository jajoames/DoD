/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

import java.util.Locale;

/**
 *
 * @author tdahl01
 */
public class DoD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.io.BufferedReader stdin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        World world = new World();
        Player player = new Player(world.locations.get(0));

        String cmd = "";
        while (!cmd.equalsIgnoreCase("quit")) {
            System.out.println("You are " + player.location.desc);
            System.out.println("What next?");
            try {
                cmd = stdin.readLine();
            } catch (java.io.IOException e) {
                System.out.println(e);
            }

            cmd.toLowerCase();
            char cmdFirstChar = cmd.charAt(0);
            switch (cmdFirstChar) {
                case 'n':
                    if (player.location.north != null) {
                        player.location = player.location.north;
                    } else {
                        System.out.println("There is no exit to the north.");
                    }
                    break;
                case 'e':
                    if (player.location.east != null) {
                        player.location = player.location.east;
                    } else {
                        System.out.println("There is no exit to the east.");
                    }
                    break;
                case 's':
                    if (player.location.south != null) {
                        player.location = player.location.south;
                    } else {
                        System.out.println("There is no exit to the south.");
                    }
                    break;
                case 'w':
                    if (player.location.west != null) {
                        player.location = player.location.west;
                    } else {
                        System.out.println("There is no exit to the west.");
                    }
                    break;
                case 'l':
                    World.describe(player.location.index);
                    break;
                case 't':
                    int myLocation = player.location.index;

                    switch (myLocation) {
                        case 6:
                            if (!player.sword) {
                                player.sword = true;
                                System.out.println("You have found the sword!!!!");
                            }
                            break;
                        case 7:
                            if (!player.lamp) {
                                player.lamp = true;
                                System.out.println("You have found the lamp!!!!");
                            }
                            break;
                        default:
                            System.out.println("There is nothing to take.");
                    }
            }

            int myLocation = player.location.index;

            switch (myLocation) {
                case 5:
                    if (player.sword){
                    player.sword=false;
                    System.out.println("You've lost the sword!!!");
                    }
                    if (player.lamp){
                    player.lamp = false;
                    System.out.println("You've lost the lamp!!!");
                    }
                    break;
                case 2:
                    dragonFight(player);
                    cmd = "end";
                    break;
            }
            if (cmd.equalsIgnoreCase("quit")) {
                System.out.println("You quit.");
            }
            if (cmd.equalsIgnoreCase("end")) {
                cmd = "quit";
            }
        }
        System.out.println("Goodbye!");

    }

    private static void dragonFight(Player p1) {
        int state = -1;
        if (!p1.sword && !p1.lamp) {
            state = 0;
        }
        if (p1.sword && !p1.lamp) {
            state = 1;
        }
        if (!p1.sword && p1.lamp) {
            state = 2;
        }
        if (p1.sword && p1.lamp) {
            state = 3;
        }
        switch (state) {
            case 0:
                System.out.println("You are completely unprepared and die a horrible death!");
                break;
            case 1:
                System.out.println("The first light you see is the flame that burns you alive!");
                break;
            case 2:
                System.out.println("You see  the drogon's mouth and do not have anywhere to hide!");
                break;
            case 3:
                System.out.println("You've sunk my battleship :(");
                break;
        }
    }
}
