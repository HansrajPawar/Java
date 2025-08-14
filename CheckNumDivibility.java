//Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 


import java.util.Scanner ;

public class CheckNumDivibility{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :- ");
		int num = sc.nextInt();	

		String result = (num%5 == 0) ? "\nNumber is divisible by 5 \n" : (num%11 == 0) ? "\nNumber is divisible by 11\n" : "\nNumber is not divisible by 5 and 11\n" ;

		System.out.println(result);
	}
}