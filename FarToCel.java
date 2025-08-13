 //Write a java program to enter temperature in Fahrenheit and convert to Celsius.
//	Formula :- cel = (fah - 32) * 5 / 9;


import java.util.Scanner ;

public class FarToCel{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Temperature in Fahrenheit :- ");
		float tempFar = sc.nextFloat();
		
		float tempCel =  (tempFar - 32) * 5 / 9;
		
		System.out.printf("\nTemperature in Celsius :-  %f ",tempCel);

	}
}