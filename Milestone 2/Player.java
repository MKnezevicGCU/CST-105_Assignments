//This is Michael Knezevic and this is my own work
public class Player {

	private String name;
	private String lastName;
	private String offense;
	private String defense;
	private String fullName;

	private int playerNumber;
	private int age;
	private int touchDown;
	private int interception;
	
	private double playerID;
	private double weight;
	private double height;
	


	public Player(String name) {
		this.name = name;
	}
	// constructor with 10 arguments.
	public Player(String name, String lastName, String offense, String defense, String fullName, int playerNumber, int age,
			int touchDown, int interception, double playerID, double weight, double height) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.touchDown = touchDown;
		this.interception = interception;
		this.offense = offense;
		this.defense = defense;
		this.playerNumber = playerNumber;
		this.playerID = playerID;
		this.weight = weight;
		this.height = height;
		this.fullName = fullName;
	}

	public Player() {

	}
    //getters and setters.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//combine 2 properties
	public String getfullName() {
		return fullName = "Full Player Name: " + name + " " + lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int gettouchDown() {
		return touchDown;
	}

	public void settouchDown(int touchDown) {
		this.touchDown = touchDown;
	}

	public int getinterception() {
		return interception;
	}

	public void setinterception(int interception) {
		this.interception = interception;
	}

	public String getOffense() {
		return offense;
	}

	public void setOffense(String offense) {
		this.offense = offense;
	}

	public String getDefense() {
		return defense;
	}

	public void setDefense(String defense) {
		this.defense = defense;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;

	}

	@Override // I am overriding the toString(); method from the class 'Object' which this
				// class (like every class) is inherited from.
	public String toString() {
		return "Playername : " + this.name + " " + this.lastName + " \nType of Player : " + this.offense + " "
				+ this.defense + " \nPlayer Number : " + this.playerNumber + " \nPlayer ID : "+ this.playerID +" \nAge : " + this.age + " \nTouch Downs : "
				+ this.touchDown + " \nInterceptions : " + this.interception + " \nWeight in lbs : " + this.weight
				+ " \nHeight in inches : " + this.height;
	}
	//2nd combine properties.
    public double getplayerID() {
    	return playerID = weight + height;
    }
}
