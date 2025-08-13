
//Q8. Write a program to calculate sum of first and last digit of a number without using loop.
//Input : 123
//Output : 4



import java.util.Scanner ;

public class FirstAndLastSum{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :- ");
		int num = sc.nextInt();

		int first , last ;
		
		last = num%10;

		first = (num/100);

	
		
		System.out.println("First :- "+first+"\nLast :- " +last+"\nSum :- "+(first+last));
	}	

}