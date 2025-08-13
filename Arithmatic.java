//3. Write a java program to enter two numbers and perform all arithmetic operations.

import java.util.Scanner;

public class Arithmatic {

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Num 1 :- "); 
	int num1 = sc.nextInt();

	System.out.print("Enter Num 2 :- ");
	int num2 = sc.nextInt();

	System.out.println("Addition");
	System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);

	
	System.out.println("Substraction");
	System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);


	System.out.println("Multiplication");
	System.out.printf("%d * %d = %d\n",num1,num2,num1+num2);

	System.out.println("Divide");
	System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);

	System.out.println("Remainder");
	//System.out.println(num1 +"%"+num2+"  =  "+num1%num2);
	System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);



		
	}
	
}