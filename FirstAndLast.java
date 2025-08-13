//Q7. Write a program to find first and last digit of a number without using loop in three digit.


import java.util.Scanner ;

public class FirstAndLast{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :- ");
		int num = sc.nextInt();

		int first , last ;
		
		last = num%10;

		first = (num/100);
		
		System.out.println("First :- "+first+"\nLast :- " +last);
	}	

}