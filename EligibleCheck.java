/*

Q53. Take percentage and income of a student:
If percentage >= 75 AND income < 200000, print "Eligible"
Else "Not Eligible"

*/


import java.util.Scanner ;

public class EligibleCheck
{
	public static void main(String x[]) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter percentage :- ");
		int percentage = sc.nextInt();
		
		System.out.print("Enter income :- ");
		int income = sc.nextInt();
		
		String result = percentage >= 75 && income < 200000 ? "Eligible" : "Not Eligible" ;

		System.out.print(result);
	}

}