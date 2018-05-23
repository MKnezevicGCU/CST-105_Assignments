//This is Michael Knezevic and this is my own work.
public class DefensivePlayer extends NFLPlayer {

	//Creates a defensive player
    DefensivePlayer(String name, String lastName, String offense, String defense) {
        super(name, lastName, offense, defense);
    }

    //Overriding toString method because it is located in the java package.
    @Override
    public String toString() {
        return name + " " + lastName + " runs " + offense + " and " + defense + " as a Defensive Player";
    }

}