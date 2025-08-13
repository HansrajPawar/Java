
// Q6. Write a java program to enter marks of five subjects and calculate total marks and percentage.

import java.util.Scanner ;

public class Marksheet {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Marks out of 100 \n");
		
		System.out.print("Subject 1 :- ");
		double s1 = sc.nextDouble();

		System.out.print("Subject 2 :- ");
		double s2 = sc.nextDouble();	
	
		System.out.print("Subject 3 :- ");
		double s3 = sc.nextDouble();

		System.out.print("Subject 4 :- ");
		double s4 = sc.nextDouble();

		System.out.print("Subject 5 :- ");
		double s5 = sc.nextDouble();

		double Total = s1+s2+s3+s4+s5;
		double Percentage = Total/5;
		System.out.println("=============================");
		System.out.println("Total Marks :- "+Total);
		System.out.println("Percentage :- "+Percentage);
		System.out.println("=============================");


	}

}