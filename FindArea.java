//Q 4. Write a java program to enter length and breadth of a rectangle and find its area.

import java.util.Scanner;

public class FindArea{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length :- " );
		int ln = sc.nextInt();

		System.out.print("Enter Breadth :- ");
		int bd = sc.nextInt();

		System.out.println("Area of Rectangle = "+ln*bd);
	}

}