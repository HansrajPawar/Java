//Q34. Write a Java program to check whether a number is positive , negative or zero.


import java.util.Scanner ;

public class CheckNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :- ");
		int num = sc.nextInt();	

		String result = (num > 0) ? "\nIt is Positive Number \n" : (num == 0) ? "\nIt is Zero\n" : "\nIt is Negative Number \n" ;

		System.out.println(result);
	}
}