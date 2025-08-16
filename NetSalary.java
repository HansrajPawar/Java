/*
Q3. Write a Java program to calculate the net salary of an employee.
Input: basic salary, HRA %, DA %, and tax %.


*/



import java.util.Scanner ;

public class NetSalary{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		float netSalary ;

		System.out.print("Enter basic salary :- ") ;
		float bs = sc.nextFloat();

		System.out.print("Enter HRA in % :- ") ;
		float hra = sc.nextFloat();


		System.out.print("Enter DA in % :- ") ;
		float da = sc.nextFloat();

		System.out.print("Enter Tax in % :- ") ;
		float tax = sc.nextFloat();

		netSalary = bs + (bs*(hra/100)) + (bs*(da/100)) - (bs*(tax/100)) ;
		
				
		
		System.out.println("\nNet Salary :- " + netSalary);
	}

}