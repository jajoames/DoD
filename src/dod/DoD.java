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

        String cmd="";
        System.out.println("You are "+player.location.desc);
        while(!cmd.equalsIgnoreCase("quit")){
            System.out.println("What next?");
            try{
                cmd = stdin.readLine();
            }catch(java.io.IOException e){
                System.out.println(e);
            }
            cmd = String.valueOf(cmd.charAt(0));
            if(cmd.equalsIgnoreCase("n")){
                if(player.location.north!=null){
                    player.location = player.location.north;
                    System.out.println("You are "+player.location.desc);
                }else{
                    System.out.println("There is no exit to the north.");
                }
            }
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                    System.out.println("You are "+player.location.desc);
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                    System.out.println("You are "+player.location.desc);
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                    System.out.println("You are "+player.location.desc);
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }
            
            if(cmd.equalsIgnoreCase("l")){
                System.out.println("You are "+player.location.desc);
            }
            
            if(cmd.equalsIgnoreCase("q")){
                cmd = "quit";
                System.out.println("You have failed your quest.");
            }
        }
        System.out.println("Goodbye!");
        
    }
}
