// Q54. Take a three-digit number and print the larger digit among first and last digit using ternary operator.

// num = 123 ; 1 < 3 then 3 

public class LargerDigit 
{
	public static void main(String x[]) {
		int num = 243 ;
		
		int lstDigit = num % 10 ;
		
		int fstDigit = num/100;

		int larger = lstDigit >  fstDigit ? lstDigit : fstDigit ;
	
		System.out.println("Larger digit among first and last: " + larger);

	}

}

