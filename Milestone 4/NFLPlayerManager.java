//This is Michael Knezevic and this is my own work.
import java.util.ArrayList;

//Creating a container
public class NFLPlayerManager {
	ArrayList<NFLPlayer> list;

	//Creating ArrayList
	public NFLPlayerManager() {
		list = new ArrayList<NFLPlayer>();
	}

	//Adding Offensive players to my ArrayList
	public void addOffensivePlayer(String fname, String lname, String offense, String defense) {
		list.add(new OffensivePlayer(fname, lname, offense, defense));
	}

	//Adding Defensive players to my ArrayList
	public void addDefensivePlayer(String fname, String lname, String offense, String defense) {
		list.add(new DefensivePlayer(fname, lname, offense, defense));
	}

	//Overriding toString because it is linked to the java package.
	@Override
	public String toString() {
		String hold = "";
		for (int i = 0; i < list.size(); i++) {
			NFLPlayer p = list.get(i);
			hold += p.toString() + "\n";
		}
			return hold;
		}
}