//Q3. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
//	Formula :- fah = (cel * 9 / 5) + 32;


import java.util.Scanner ;

public class CelToFar{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Temperature in Celsius:- ");
		float tempCel = sc.nextFloat();
		
		float tempFar =  (tempCel * 9 / 5) + 32;

		
		System.out.printf("\nTemperature in Fahrenheit :-  %f ",tempFar);

	}
}