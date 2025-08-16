/*

Q1. Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 


*/

import java.util.Scanner ;

public class SpyNum{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Num :- ") ;
		int num = sc.nextInt();

		int temp = num;
		int rem , sum = 0, prd = 1 ;
		while(temp > 0 ){
			rem = temp % 10 ;
			prd *= rem;
			sum += rem;
			temp /= 10;
		}	
		
		String result = (sum==prd) ? "Yes, Num is Spy Number"  : "No, Num is Spy Number" ;
		System.out.print(result);
	}

}