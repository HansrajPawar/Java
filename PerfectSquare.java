//Q10. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

import java.util.Scanner ;

public class PerfectSquare {

	public static void main(String x[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :- ") ;
		int num = sc.nextInt();
		
		int sq = (int)Math.sqrt(num) ;
 		
		String result  = (num == sq*sq) ? "Number is Perfect Square" : "Number is not Perfect Square"	;	
		System.out.println(result) ;

	}
}
