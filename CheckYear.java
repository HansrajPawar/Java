//Q38. Write a Java program to check whether a year is leap year or not.


import java.util.Scanner ;

public class CheckYear{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Year :- ");
		long year = sc.nextLong();	

		String result = (year%4 == 0) ? "\nIt is Leap Year \n" : "\nIt is Not Leap Year\n" ;

		System.out.println(result);
	}
}