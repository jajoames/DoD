/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        System.out.println("You are " + player.location.desc);
        while (!cmd.equalsIgnoreCase("quit")) {
            System.out.println("What next?");
            try {
                cmd = stdin.readLine();
            } catch (java.io.IOException e) {
                System.out.println(e);
            }
            player.location = movePlayer(player.location, cmd.charAt(0));
            if (cmd.charAt(0) == 'q' || cmd.charAt(0) == 'Q'){
                cmd = "quit";
            }
        }
        System.out.println("Goodbye!");

    }

    public static Location movePlayer(Location current, char a) {
        Location newLoc = current;
        switch (a) {
            case 'n' | 'N':
                if (current.north != null) {
                    newLoc = current.north;
                    System.out.println("You are " + newLoc.desc);
                } else {
                    System.out.println("There is no exit to the north.");
                }
                break;
            case 'e' | 'E':
                if (current.east != null) {
                    newLoc = current.east;
                    System.out.println("You are " + newLoc.desc);
                } else {
                    System.out.println("There is no exit to the east.");
                }
                break;
            case 's' | 'S':
                if (current.south != null) {
                    newLoc = current.south;
                    System.out.println("You are " + newLoc.desc);
                } else {
                    System.out.println("There is no exit to the south.");
                }
                break;
            case 'w' | 'W':
                if (current.west != null) {
                    newLoc = current.west;
                    System.out.println("You are " + newLoc.desc);
                } else {
                    System.out.println("There is no exit to the west.");
                }
                break;
            case 'l' | 'L':
                System.out.println("You are " + newLoc.desc);
                break;
            case 'q' | 'Q':
                System.out.println("You have failed your quest.");
                break;
            default:
                System.out.println("Your choice has not bee recodnised.");
        }
        return newLoc;
    }
}
