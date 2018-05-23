//This is Michael Knezevic and this is my own work.
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		//Creating player list
		NFLPlayerManager players = new NFLPlayerManager();
		
		//adding default players
		players.addOffensivePlayer("Nick", "Foles", "Quarterback", "does not have a defensive position");
		players.addDefensivePlayer("Telvin", "Smith", "does not have offensive position.", "Linebacker");
		players.addDefensivePlayer("Patrick", "Chung", "does not have offensive position.", "Defensive backer");
		players.addOffensivePlayer("Danny", "Amendola", "Wide Recieverd", "Does not have a defensive position");
		players.addOffensivePlayer("Alshon", "Jeffery", "Wide Recieverd", "Does not have a defensive position");
		players.addOffensivePlayer("Tom", "Brady", "Quarterback", "Does not have a defensive position");

		//creating menu loop
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			System.out.println("1. Enter a new Offensive Player.");
			System.out.println("2. Enter a new Defensive Player.");
			System.out.println("3. Remove a player.");
			System.out.println("4. Change a player.");
			System.out.println("5. Print Players.");
			System.out.println("6. Quit.");
			int x = Integer.parseInt(scan.nextLine());
			switch(x){
			case 1://Creating an offensive player
				System.out.println("Enter the first name:");
				String fname = scan.nextLine();
				System.out.println("Enter the last name:");
				String lname = scan.nextLine();
				System.out.println("Enter the player's offensive position: ");
				String offense = scan.nextLine();
				System.out.println("Enter the player's defensive position: ");
				String defense = scan.nextLine();
				players.addOffensivePlayer(fname, lname, offense, defense);
				break;
			case 2://Creating a defensive player
				System.out.println("Enter the first name:");
				String fname1 = scan.nextLine();
				System.out.println("Enter the last name:");
				String lname1 = scan.nextLine();
				System.out.println("Enter the player's offensive position: ");
				String offense1 = scan.nextLine();
				System.out.println("Enter the player's defensive position: ");
				String defense1 = scan.nextLine();
				players.addDefensivePlayer(fname1, lname1, offense1, defense1);
				break;
			case 3://Removing a player
				System.out.println(players);
				System.out.println("Which player would you like to remove?");
				int i = scan.nextInt();
				scan.nextLine();
				players.removePlayer(i);
				break;
			case 4://Changing a player
				System.out.println(players);
				System.out.println("Which player would you like to change?");
				int z = scan.nextInt();
				scan.nextLine();
				players.changePlayer(z, scan);
				break;
			case 5://Print out a list of players
				System.out.println(players);
				break;
			case 6://Quitting out of the program.
				flag = false;
				break;
			default:
				break;
			}
		}
		scan.close();
	}
}