//Q2. Write a java program to input all basic data types and print its output.
import java.util.Scanner ;

public class DataTypes{

	public static void main(String x[]){

		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Integer :- ");
		int n = sc.nextInt();
		
		System.out.println("Enter Charcter :- ");
		char ch = sc.next().charAt(0);
		
		System.out.println("Enter Float :- ");
		Float f = sc.nextFloat();

		System.out.println("Enter Double :- ");
		Double d = sc.nextDouble();
		
		System.out.println("Enter Long :- ");
		Long b = sc.nextLong();

		System.out.printf("\n\nOUTPUT\na = %d",n);
		System.out.printf("\nch = %c",ch);
		System.out.printf("\nf = %f",f);
		System.out.printf("\nd = %f",d);
		System.out.printf("\nb = %d",b);
		

	}

	
	

}