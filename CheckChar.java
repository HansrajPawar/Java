//Q36. Write a Java program to check whether character is alphabetic or not.



import java.util.Scanner ;

public class CheckChar{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :- ");
		char ch = sc.next().charAt(0);

		String result = (ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')? "\nCharacter is alphabetic.\n" : "\ncharacter is not alphabetic .\n";
		System.out.println(result);
	}
}