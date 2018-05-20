//This is Michael Knezevic and this is my own work.
public class mainClassConstructors {
	  public static void main(String[] args) {
		  
		  Player tomBrady = new Player();
		  Player nickFoles = new Player();
		  Player telvinSmith = new Player();
		  

		  
		  tomBrady.setName("Tom");
		  tomBrady.setLastName("Brady");
		  tomBrady.setOffense("Quarterback");
		  tomBrady.setDefense("Is not a defensive player.");
		  tomBrady.setPlayerNumber(12);
		  tomBrady.setAge(40);
		  tomBrady.settouchDown(32);
		  tomBrady.setinterception(8);
		  tomBrady.setWeight(225);
		  tomBrady.setHeight(76);
		  
		  System.out.println(tomBrady.getfullName());
	      System.out.println(tomBrady.toString());	 
	      System.out.println(tomBrady.getWeight() + " pounds.");
	      System.out.println("Players age is: " + tomBrady.getAge());
	      System.out.println(tomBrady.getHeight() + " in inches.");
	      System.out.println(tomBrady.getPlayerNumber() + " is the players jersey number." );
	      System.out.println(tomBrady.getOffense() + " position.");
	      System.out.println(tomBrady.getDefense());
	      System.out.println("Touch downs : " + tomBrady.gettouchDown());
	      System.out.println("Interceptions :" + tomBrady.getinterception());
          System.out.println("First name :" + tomBrady.getName());
          System.out.println("Last name :" + tomBrady.getLastName());
          System.out.println("The Players ID number is: " + tomBrady.getplayerID());
      }
}


