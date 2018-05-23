//This is Michael Knezevic and this is my own work.
import java.util.ArrayList;
import java.util.Scanner;
//Creating a container
public class NFLPlayerManager {
    ArrayList<NFLPlayer> list;

    //creating an ArrayList
    public NFLPlayerManager() {
        list = new ArrayList<NFLPlayer>();
    }

    //add offensive player to ArrayList
    public void addOffensivePlayer(String fname, String lname, String offense, String defense) {
        list.add(new OffensivePlayer(fname, lname, offense, defense));
    }
    
    //add defensive player to ArrayList
    public void addDefensivePlayer(String fname, String lname, String offense, String defense) {
        list.add(new DefensivePlayer(fname, lname, offense, defense));
    }
    
    //remove player from the list
    public void removePlayer(int i)
    {
        list.remove(i-1);
    }
    //Change player on the list
    public void changePlayer(int i, Scanner scan)
    {
        if(i-1 > list.size() || i-1 < 0)
        {
            System.out.println("Number out of bounds.");
            return;
        }
        System.out.println("Enter the first name:");
        String fname = scan.nextLine();
        System.out.println("Enter the last name:");
        String lname = scan.nextLine();
        System.out.println("Enter the player's offensive position: ");
        String offense = scan.nextLine();
        System.out.println("Enter the player's defensive position: ");
        String defense = scan.nextLine();
        list.get(i-1).reset(fname, lname, offense, defense);
    }

    //Overriding toString method because it is part of java package.
    @Override
    public String toString() {
        String hold = "";        
        for(int i = 0; i < list.size(); i++)
        {
            NFLPlayer p = list.get(i);
            hold += "Player #" + (i+1) + ": " + p.toString() + "\n";
        }

        
        return hold;
    }

}