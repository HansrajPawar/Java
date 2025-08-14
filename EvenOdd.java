//Q31. Write a Java program to check whether a number is even or odd. 

import java.util.Scanner ;

public class EvenOdd{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :- ");
		int num = sc.nextInt();	

		String result = (num%2 == 0) ? "\nIt is Even Number \n" : "\nIt is Odd Number \n" ;

		System.out.println(result);
	}
}