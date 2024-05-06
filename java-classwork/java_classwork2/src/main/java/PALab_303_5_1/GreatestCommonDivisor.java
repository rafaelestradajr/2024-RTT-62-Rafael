package PALab_303_5_1;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two positive integers
        System.out.print("Enter the first positive integer: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int n2 = scanner.nextInt();

        // Find the greatest common divisor (GCD)
        int gcd = findGCD(n1, n2);

        // Display the result
        System.out.printf("The GCD of %d and %d is %d.%n", n1, n2, gcd);

        // Close the scanner
        scanner.close();
    }

    // Function to find the greatest common divisor (GCD) using the Euclidean algorithm
    private static int findGCD(int a, int b) {
        // Base case: if b is 0, then gcd(a, b) = a
        if (b == 0) {
            return a;
        }
        // Recursive call: gcd(a, b) = gcd(b, a % b)
        return findGCD(b, a % b);
    }
}

