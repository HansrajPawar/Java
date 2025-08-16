/*

Q2. Write a Java program that takes an alphabet character 
and toggles its case using ASCII values and operators.
Example: a → A, Z → z.

*/

import java.util.Scanner;

public class TogglesNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alphabet Character :- ");
        char ch = sc.next().charAt(0);

       	int ascii = (int) ch;

        if (ch >= 'a' && ch <= 'z') {
                      ascii -= 32;
        } else if (ch >= 'A' && ch <= 'Z') {
                        ascii += 32;
        } else {
            System.out.println("Not an alphabet character!");
            return;
        }

	System.out.println("Toggled Character :- "+ (char) ascii);


        }
}
