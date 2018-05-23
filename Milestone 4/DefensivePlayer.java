//This is Michael Knezevic and this is my own work.
public class DefensivePlayer extends NFLPlayer {

	//Create Defensive Player
    DefensivePlayer(String name, String lastName, String offense, String defense) {
        super(name, lastName, offense, defense);
    }

    //Overriding toString because it is linked to the java package
    @Override
    public String toString() {
        return name + " " + lastName + " is Defensive";
    }

}