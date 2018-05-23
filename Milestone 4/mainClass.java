//This is Michael Knezevic and this is my own work.
public class mainClass {
    public static void main(String[] args) {
        
    	//Create NFLPlayerManager object
        NFLPlayerManager players = new NFLPlayerManager();
        
        //adding players to my list
        players.addOffensivePlayer("Nick", "Foles", "Quarterback", "Does not have a defensive position.");
        players.addDefensivePlayer("Telvin", "Smith", "Does not have offensive position.", "Linebacker");
        players.addDefensivePlayer("Patrick", "Chung", "Does not have offensive position.", "Defensive backer");
        players.addOffensivePlayer("Danny", "Amendola", "Wide Reciever.", "Does not have a defensive position.");
        players.addOffensivePlayer("Alshon", "Jeffery", "Wide Reciever.", "Does not have a defensive position.");
        players.addOffensivePlayer("Tom", "Brady", "Quarterback", "Does not have a defensive position.");

        //print list of players
        System.out.println(players);
    }
}