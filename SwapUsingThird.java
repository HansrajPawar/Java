// Q9. Write a java program swap two number using third variable.



public class SwapUsingThird{

	public static void main(String x[]){
		
		int num1 = 2 ; 
		int num2 = 3 ;
		
		System.out.println("Before Swap");
		
		
		System.out.println("Num1 :- "+num1);
		System.out.println("Num2 :- "+num2);

		int temp ;
		temp = num1 ;
		num1 = num2 ;
		num2 = temp;

		System.out.println("\nAfter Swap");
		System.out.println("Num1 :- "+num1);
		System.out.println("Num2 :- "+num2);


	}
}