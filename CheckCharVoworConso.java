//Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.



import java.util.Scanner ;

public class CheckCharVoworConso{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character :- ");
		char ch = sc.next().charAt(0);

		String result = (ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')? 
		((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		? "It is Vowel Charcter" : "It is Consonant Charcter "):"\ncharacter is not alphabetic .\n";
		System.out.println(result);
	}
}