/*
Q57. Question:
If performance rating > 8, give 15% bonus; else if rating > 5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic.

*/

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter performance rating: ");
        int performanceRating = scanner.nextInt();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        double bonus = 0.0;

        if (performanceRating > 8) {
            bonus = salary * 0.15;
        } else if (performanceRating > 5) {
            bonus = salary * 0.10;
        } else {
            bonus = 0.0;
        }

        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Bonus: " + bonus);
    }
}
