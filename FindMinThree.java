//Q6. Write a java program to find a minimum between three numbers. 


import java.util.Scanner ;

public class FindMinThree{
	
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number 1 :- ");
		int num1 = sc.nextInt();

		System.out.print("Enter Number 2 :- ");
		int num2 = sc.nextInt();

		System.out.print("Enter Number 3 :- ");
		int num3 = sc.nextInt();



		int min  = num1 < num2 ? ( num1 < num3 ? num1 : num3 ) : num2 < num3 ? num2 : num3 ;
		
		System.out.println("Min Number :- "+min); 
		
	}


}