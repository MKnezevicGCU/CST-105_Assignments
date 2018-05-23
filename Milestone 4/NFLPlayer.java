//This is Michael Knezevic and this is my own work.
public abstract class NFLPlayer {
	//declaring variable
    String name;
    String lastName;
    String offense;
    String defense;

    //Creating NFLPlayer
    NFLPlayer(String name, String lastName, String offense, String defense) {
        this.name = name;
        this.lastName = lastName;
        this.offense = offense;
        this.defense = defense;

    }

    //abstract toString that is defined in offensive and defensive players
    @Override
    public abstract String toString();
}