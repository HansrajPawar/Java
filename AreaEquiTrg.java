// Q5. Write a java program to calculate area of an equilateral triangle.

import java.util.Scanner ;

public class AreaEquiTrg{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the side of Equilateral Triangle :- ");
		double side = sc.nextDouble();
		
		double Area = (Math.sqrt(3)/4) * side * side ;
		
		System.out.printf("Area of Equilateral Triangle :-  %f", Area);

	}
}