//This is Michael Knezevic and this is my own work.
public class palindromicPrime {
  public static void main(String[] args) {
	
	int count = 0;
	for (int i = 0; count < 100000; i++) {
		
		if (isPrime(i) && isPalindrome(i)) {
			System.out.printf("%10d", i);
			count++;
			if (count % 10 == 0 && i != 0) System.out.println();
			
		}
		
	}
  }
  
  public static boolean isPrime(long n) {
	  
	  if (n < 2) return false;
	  
	  for (int i = 2; i <= n / 2; i++) {
		  
		  if (n % i == 0) return false;
	  }
	  
	  return true;
  }
  
  public static long reverse(long number) {
	  
	  long reverse = 0;
	  while (number != 0) {
		  
		  reverse *= 10; // This is ignored in the first iteration of the program.
		  reverse += number % 10;
		  number /= 10;
	  }
	  
	  return reverse;
  }
  
  public static boolean isPalindrome(long number) {
	  
	  return (number == reverse(number));
  }
}