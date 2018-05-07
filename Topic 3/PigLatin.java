//This is Michael Knezevic and this is my own work
import java.io.*;
public class PigLatin {
  public static void main(String[] args)throws Exception {
	File file = new File("src/file");
	BufferedReader br = new BufferedReader(new FileReader(file));
	String toast;
	while ((toast = br.readLine()) != null) {
		String original = toast;
	      String[] vowel = {"i", "a", "e", "o", "u"};
	      int found = toast.length();
	      for(int i = 0; i < vowel.length; i++) {
	    	  if (toast.indexOf(vowel[i]) <= found && toast.indexOf(vowel[i]) >= 0) {
	              found = toast.indexOf(vowel[i]);
	            }
	      }
	      String pigify;
	      if (found == 0) {
	        pigify = toast + "ay\n";
	      } else {
	        pigify = toast.substring(found) + toast.substring(0, found) + "ay\n";
	      }
	      System.out.print("Original: " + original + " - Pigify: " + pigify.toUpperCase());
	      }
	     }
  }
