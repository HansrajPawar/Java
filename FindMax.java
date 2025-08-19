//Q1. Write a java program to find maximum between three numbers.

import java.util.Scanner ;

public class FindMax{
	
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number 1 :- ");
		int num1 = sc.nextInt();

		System.out.print("Enter Number 2 :- ");
		int num2 = sc.nextInt();

		System.out.print("Enter Number 3 :- ");
		int num3 = sc.nextInt();


		int max  = num1 > num2 ? ( num1 > num3 ? num1 : num3 ) : num2 > num3 ? num2 : num3 ;
		
		System.out.println("Max Number :- "+max); 
		
	}


}