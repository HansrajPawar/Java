/*

Q5. Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.
Input: 15
Output: Multiple of both 3 and 5

*/

import java.util.Scanner ;

public class Multiple3and5{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Num :- ") ;
		int num = sc.nextInt();

				
		String result = (num % 3 == 0 ) && (num % 5 ==0) ? "Yes, Number is a multiple of both 3 and 5"  : "No, Number is not a multiple of both 3 and 5" ;
		System.out.print(result);
	}

}