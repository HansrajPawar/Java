//Q4. Write a java program to enter two angles of a triangle and find the third angle. 


import java.util.Scanner ;

public class FindThirdAngle{

	public static void main(String x[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Angle 1 :- ");
		float a1 = sc.nextFloat();

		System.out.print("Enter Angle 2 :- ");
		float a2 = sc.nextFloat();
		
		float a3 = 180 - (a1+a2) ;	
		System.out.printf("Angle 3 :- %f",a3);

	}

}