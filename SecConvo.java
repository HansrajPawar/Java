//Q2. Write a Java program to convert seconds to hours, minutes and seconds. 

import java.util.Scanner ;

public class SecConvo{
	public static void main(String x[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Seconds :- ");
		long seconds = sc.nextInt();
		
		long hours = seconds / 3600;
		long minutes = (seconds % 3600)/60;
		long second = (seconds % 3600)%60;
		System.out.println("Hours : "+hours+"\nMinutes : "+minutes+"\nSeconds : "+second);



		
	}	
}