/* 

Q51. Problem: 
Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not.
Example Input:
m = 25, n = 12

*/

import java.util.Scanner ;

public class AbsDiff
{
	public static void main(String x[]) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter Number 1 :- ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Number 2 :- ");
		int num2 = sc.nextInt();
		
		int diff = Math.abs(num1-num2) ;
		
		String result = diff > 10 ? "Absolute difference is greater than 10" : "Absolute difference is not greater than 10" ;

		System.out.print(result);
	}

}