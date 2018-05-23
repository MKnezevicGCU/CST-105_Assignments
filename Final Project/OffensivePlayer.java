//This is Michael Knezevic and this is my own work.
public class OffensivePlayer extends NFLPlayer {

	//Create an offensive player
    OffensivePlayer(String name, String lastName, String offense, String defense) {
        super(name, lastName, offense, defense);
    }

    //Overriding toString because it is in the java package.
    @Override
    public String toString() {
        return name + " " + lastName + " runs " + offense + " and " + defense +  " as an Offensive";
    }
}