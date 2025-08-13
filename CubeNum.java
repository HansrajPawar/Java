//Q4. Write a Java program that reads a number and display the cube.


import java.util.Scanner ;

public class CubeNum{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :- ");
		long n = sc.nextLong();
		long cube = n*n*n;
		System.out.println("Cube of Number :- "+cube);
	}	

}