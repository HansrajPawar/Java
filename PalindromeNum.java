//Q10. Write a java program to check whether number is palindrome or not.


import java.util.Scanner ;

public class PalindromeNum{
	
	static int RevNum(int n){

		int rev = 0 ; int rem ;
		while(n > 0){
			rem = n % 10;
			rev = rem + rev*10;
			n /= 10;
		}
		return rev;

	}

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Number :- ");
		int num = sc.nextInt();

		String result = RevNum(num) == num ? "\nYes , It is Palindrome  Number.\n" : "\nNo , It is Not Palindrome  Number.\n";
	
		
		System.out.println(result);
	}	

}