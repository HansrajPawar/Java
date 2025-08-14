//Q37. Write a Java program to input cost price and selling price of a product and check profit or loss

import java.util.Scanner ;

public class checkProfOrLoss{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Cost Price:- ");
		int cp = sc.nextInt();	
		System.out.print("Enter a Selling Price :- ");
		int sp = sc.nextInt();	

		String result = (sp > cp ) ? "\nIt is a Profit \n" : "\nIt is a Loss \n" ;

		System.out.println(result);
	}
}