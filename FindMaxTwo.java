//Q5. Write a java program to find the minimum between two numbers. 


import java.util.Scanner ;

public class FindMaxTwo{
	
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number 1 :- ");
		int num1 = sc.nextInt();

		System.out.print("Enter Number 2 :- ");
		int num2 = sc.nextInt();



		int min  = num1 > num2 ? num1 : num2 ;		
		System.out.println("Max Number :- "+min); 
		
	}


}
