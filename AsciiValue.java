//Q1. Write a Java program to print the ASCII value of a given character.

import java.util.Scanner ;
public class AsciiValue {

	public static void main(String x[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character :- ");
		
		char ch = sc.next().charAt(0);
		System.out.printf("ASCII value of %c is %d ",ch,(int)ch);
	}

}