//Q1. Write a java program to enter length in centimeter and convert into meter and kilometer.

import java.util.Scanner;

public class CentToKm{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length in centimeter :- ");
		float cm = sc.nextFloat();
		float m = cm/100 ;
		float km = cm/1000;
		System.out.printf("\nEnter Length in meter :- %f \n",m);
		System.out.printf("\nEnter Length in meter :- %f \n",km);
		
	}	

}