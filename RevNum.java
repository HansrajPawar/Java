//Q6. Write a Java program to reverse a number without using loop.


import java.util.Scanner ;

public class RevNum{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :- ");
		int n = sc.nextInt();
		int rev = 0 ; int rem ;
		while(n > 0){
			rem = n % 10;
			rev = rem + rev*10;
			n /= 10;
		}
		System.out.println("Reverse :- " +rev);
	}	

}