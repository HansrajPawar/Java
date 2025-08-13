// Q10. Write a java program swap two number without using third variable.



public class SwapWithoutThird{

	public static void main(String x[]){
		
		int num1 = 2 ; 
		int num2 = 3 ;
		
		System.out.println("Before Swap");
		
		
		System.out.println("Num1 :- "+num1);
		System.out.println("Num2 :- "+num2);

		num1 = num2 + num1;
		num2 = num1-num2;
		num1 = num1-num2;


		System.out.println("\nAfter Swap");
		System.out.println("Num1 :- "+num1);
		System.out.println("Num2 :- "+num2);


	}
}