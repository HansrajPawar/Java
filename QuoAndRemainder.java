/*

Q4. Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
 

*/



import java.util.Scanner ;

public class QuoAndRemainder{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Dividend :- ") ;
		int num1 = sc.nextInt();

		System.out.print("Enter Divisor :- ") ;
		int num2 = sc.nextInt();


		int Quotient = num1 / num2 ;
		int Remainder = num1 % num2 ;
 		
		System.out.println("Quotient = "+Quotient+", Remainder = "+Remainder);
	}

}