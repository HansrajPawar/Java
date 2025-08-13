//Q 5. Write a java program to enter radius of a circle and find its diameter,area and //circumference.

import java.util.Scanner;

public class FindAreaCirlce{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Diameter :- " );
		Double rd = sc.nextDouble();

		Double Area = Math.PI * 2 * rd ; 
		System.out.println("Are a of Circle = "+ Area);
	}

}