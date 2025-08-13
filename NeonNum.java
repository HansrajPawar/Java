//Q9. Write a java program to check whether number is neon or not.


import java.util.Scanner ;

public class NeonNum{
	
	static int sumDig(int n){

		int sum = 0 ; int rem ;
		while(n > 0){
			rem = n % 10;
			sum += rem;
			n /= 10;
			
		}
		return sum ;

	}

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Number :- ");
		int num = sc.nextInt();

		String result = sumDig(num) == num ? "\nYes , It is Neon Number.\n" : "\nNo , It is Not Neon Number.\n";
	
		
		System.out.println(result);
	}	

}