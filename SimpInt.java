// Q7. Write a java program to calculate the simple intrest. 
// SI = P × R × T

import java.util.Scanner ;

public class SimpInt{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);	

		System.out.print("Principal :- ");
		double p = sc.nextDouble();

		System.out.print("Rate :- ");
		double r = sc.nextDouble();
		
		System.out.print("Time :- ");
		double t = sc.nextDouble();

		double si = p*r*t/100;

		System.out.printf("Simple Intrest :- %f",si);


	}
}