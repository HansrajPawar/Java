//Q40. Write a java program to input any character and check whether it is alphabet, digit or special character.

import java.util.Scanner ;
public class CheckCharDigi{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character :- ");
		char ch = sc.next().charAt(0);

		String result = (ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')? "\nIt is charcter \n" : (ch >= '0' && ch <= 9) ? "\nIt is Digit\n" : "It is Special Character";
		System.out.println(result);
	}
}