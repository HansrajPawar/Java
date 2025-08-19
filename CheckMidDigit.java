/*

Q55. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.

Example:
Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater


*/

import java.util.Scanner ;

public class CheckMidDigit 
{
	public static void main(String x[]) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter Three Digit Number :- ");
		int num = sc.nextInt();

		int lstDigit = num % 10 ;
		
		int midDigit = (num / 10) % 10 ;
		
		int fstDigit = num/100;
		
		String result = midDigit >= (lstDigit+fstDigit) ? "Middle digit is greater than or equal to the sum of the first and last " : "Middle digit is not greater than the sum of the first and last " ; 
			
		System.out.println(result);

	}

}
