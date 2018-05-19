//This is Michael Knezevic and this is my own work!
import java.io.*;
import java.util.Scanner;
public class twoDimensionArray {
  public static void main(String[] args)throws IOException {
	File file = new File("file.txt");
	BufferedReader br = new BufferedReader(new FileReader(file));
	String toast = "";
	String pie = "";
	char applebacon [][];
	applebacon = new char[20] [45];
	int x = 0;
	Scanner scanner = new Scanner(file);
	
	while ((toast = br.readLine()) != null) {
		int y = 0;
		for(char c : toast.toCharArray()) {
           applebacon[x][y++] = c;
		}
		x++;
	}
	//create a double for loop here
	for(int row = 0; row < 20; row++) {
		for(int col = 0; col < 45; col++) {
			if(applebacon[row][col] == ' ')
				applebacon[row][col] = '@';
			System.out.println(applebacon[row][col]);
		}
	}
	for(int col = 0; col < 45; col++) {
		for(int row = 0; row < 20; row++) {
			pie += applebacon[row][col];
		
		}
	}
	System.out.println("Original: "+toast+" In Column Major Order: " +pie);
	br.close();
  }
}
