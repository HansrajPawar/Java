// Q8. Write a java program to calculate the compound intrest.
// Compound Interest = P(1 + R/100)t


import java.util.Scanner ;

public class CompInt{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);	

		System.out.print("Principal :- ");
		double p = sc.nextDouble();

		System.out.print("Rate :- ");
		double r = sc.nextDouble();
		
		System.out.print("Time :- ");
		double t = sc.nextDouble();

		double ci = p * Math.pow((1 + (r/100)),t);

		System.out.printf("Simple Intrest :- %f",ci);

	}
}