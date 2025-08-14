//Q32. Write a Java program to check whether a triangle is valid or not.

import java.util.Scanner ;

public class IsTriangleValid{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Angle 1  :- ");
		int a1 = sc.nextInt();

		System.out.print("Enter a Angle 2  :- ");
		int a2 = sc.nextInt();	

		System.out.print("Enter a Angle 3 :- ");
		int a3 = sc.nextInt();	

		String result = (a1+a2+a3 == 180) ? "\nGiven Triangle is valid \n" : "\nGiven Triangle is not valid \n" ;

		System.out.println(result);
	}
}