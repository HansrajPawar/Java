//Q3. Write a java program to accept two integers and check whether they are equal or not.


import java.util.Scanner ;

public class CheckEquiment{
	
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number 1 :- ");
		int num1 = sc.nextInt();

		System.out.print("Enter Number 2 :- ");
		int num2 = sc.nextInt();


		String result = (num1 == num2) ? "They are equals" : "They not are equals" ;
		System.out.println(result); 
		
	}


}