/* Q4. Write a java program to input basic salary of an employee and calculate its Gross salary according to following.


Basic Salary <= 10000 : HRA = 20%, DA = 80% 

Basic Salary <= 20000 : HRA = 25%, DA = 90% 

Basic Salary > 20000 : HRA = 30%, DA = 95%


*/


import java.util.Scanner ;

public class CalNetSal{
	
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter basic salary :- ");
		double bs = sc.nextInt();
		
		double hra , da ;

		if( bs > 20000 ) {
			hra =  bs  + bs * (30/100);
			da =   bs  + bs * (95/100);
		}

		else if( bs <= 20000 && bs >= 10000) {
			hra =  bs  + bs * (25/100);
			da =   bs  + bs * (90/100);

		}
		else {
			hra =  bs  + bs * (20/100);
			da =   bs  + bs * (80/100);
		}

		double netsal = bs+hra+da ;
		System.out.printf("Net salary :- %f",netsal);
		
	}

}