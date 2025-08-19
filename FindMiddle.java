/*

Q52. Problem:
Write a Java program using the conditional (ternary) operatonum3to find the middle value among three distinct integers p, q, and r.
Example Input:
num1= 10, num2= 20, num3= 15


Expected Output:
Middle Number: 15


*/

import java.util.Scanner;

public class FindMiddle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Number 3: ");
        int num3 = sc.nextInt();

       
        int max = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        
        int min = num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        int middle = (num1 + num2 + num3) - (max + min);

        System.out.println("Middle Number: " + middle);
    }
}
