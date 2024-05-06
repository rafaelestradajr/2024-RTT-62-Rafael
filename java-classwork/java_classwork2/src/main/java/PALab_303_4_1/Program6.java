package PALab_303_4_1;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        // Use a switch statement to print out the corresponding weekday
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }

        // Close the scanner
        scanner.close();
    }
}

