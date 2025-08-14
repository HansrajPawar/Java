//Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 


import java.util.Scanner ;

public class TriangleType{
	public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Side 1  :- ");
		int Side1 = sc.nextInt();

		System.out.print("Enter a Side 2  :- ");
		int Side2 = sc.nextInt();	

		System.out.print("Enter a Side 3 :- ");
		int Side3 = sc.nextInt();	

		String result = (Side1 == Side2 && Side2 == Side3 ) 
				? "\nEquilateral Triangle\n" :
				 ((Side1 == Side2 || Side2 == Side3 || Side1 == Side3 ) ?
					 "\nIsoscale Triangle\n" : 
						"\nScalene Triangle\n");
		System.out.println(result);
	}
}