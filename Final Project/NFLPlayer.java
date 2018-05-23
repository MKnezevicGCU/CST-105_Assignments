//This is Michael Knezevic and this is my own work.
//abstract class that holds variables
public abstract class NFLPlayer {
    String name;
    String lastName;
    String offense;
    String defense;

    public NFLPlayer(String name, String lastName, String offense, String defense) {
        this.name = name;
        this.lastName = lastName;
        this.offense = offense;
        this.defense = defense;

    }
    //sets new information into a player
    public void reset(String fname, String lname, String offense, String defense)
    {
        this.name = fname;
        this.lastName = lname;
        this.offense = offense;
        this.defense = defense;
    }
    //gets the name of a player
    public String getName()
    {
        return name;
    }
    //sets the name of a player
    public void setName(String input)
    {
        name = input;
    }
    //abstract toString that is defined in offensive and defensive players
    @Override
    public abstract String toString();
}