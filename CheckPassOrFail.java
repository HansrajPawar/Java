//Q8. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.




import java.util.Scanner ;

public class CheckPassOrFail{
	
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Score :- ");
		int score  = sc.nextInt();
		
		if(score >= 40) System.out.println("Student is Passed. "); 
		else System.out.println("Student is Failed .");
		
		
	}

}