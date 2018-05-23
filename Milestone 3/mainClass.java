//This is Michael Knezevic and this is my own work.
public class mainClass {
	public static void main(String[] args) {
        //Creates NFLPlayerManager object
		NFLPlayerManager2 players = new NFLPlayerManager2();
        
		//Creating and adding my players to my ArrayList
		players.addPlayer("Tom", "Brady", "Quarterback", "Does not have a defensive position.");
		players.addPlayer("Nick", "Foles", "Quarterback", "Does not have a defensive position.");
		players.addPlayer("Telvin", "Smith", "Does not have offensive position.", "Linebacker");
		players.addPlayer("Patrick", "Chung", "Does not have offensive position.", "Defensive backer");
		players.addPlayer("Danny", "Amendola", "Wide Reciever.", "Does not have a defensive position.");
		players.addPlayer("Alshon", "Jeffery", "Wide Reciever.", "Does not have a defensive position.");
        
		//printing out all 6 of my players information.
		System.out.println(players);
	}
}
