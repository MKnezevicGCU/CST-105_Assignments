//This is Michael Knezevic and this is my own work
import java.util.ArrayList;

class NFLPlayerManager2 {
	ArrayList<Players> list;
    //This is my NFLPlayerManager2 constructor
	public NFLPlayerManager2() {
		list = new ArrayList<Players>();
	}
    //This is my createPlayer method
	public void addPlayer(String fname, String lname, String offense, String defense) {
		list.add(new Players(fname, lname, offense, defense));
	}
    //@Override toString() method because it is linked to the java package.
	@Override
	public String toString() {
		String hold = "";
		for (Players p : list) {
			hold += p.toString() + "\n";
		}
		return hold;
	}

}
//Created a class players to hold variables.
class Players {
	String name;
	String lastName;
	String offense;
	String defense;
    //Players constructor
	Players(String name, String lastName, String offense, String defense) {
		this.name = name;
		this.lastName = lastName;
		this.offense = offense;
		this.defense = defense;

	}
    //@Override toString() method because it is linked to the java packages
	@Override
	public String toString() {
		return name + " " + lastName + " : " + "His offensive position : " + offense + " " + "His defensive position : " + defense + " ";

	}
}
