//Write a Java program and compute the sum of an integer's digits.



import java.util.Scanner ;

public class SumDigit{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :- ");
		int n = sc.nextInt();
		int sum = 0 ; int rem ;
		while(n > 0){
			rem = n % 10;
			sum += rem;
			n /= 10;
			
		}
		System.out.println("Sum of Number ( "+sum + " ) :-" +sum);
	}	

}