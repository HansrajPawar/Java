//Q9. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
//— using nested ternary operators.

import java.util.Scanner ;

public class ScoreRemark{

	public static void main(String x[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Score out of 100 :- ") ;
		int score = sc.nextInt();
		
		String remark = score >= 90 ? "Excellent" : score >= 75 ? "Good" : score >= 50 ? "Average": "Poor" ;

		
		System.out.println(remark) ;

	}

}