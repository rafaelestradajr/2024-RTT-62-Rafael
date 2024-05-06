package PALab_303_4_1;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the score
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        // Check if the score is within the valid range
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else {
            // Determine the letter grade using if-else-if statements
            if (score >= 90 && score <= 100) {
                System.out.println("Grade: A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Grade: B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Grade: C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

