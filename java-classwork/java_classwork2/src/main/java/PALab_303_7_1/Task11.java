package PALab_303_7_1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many favorite things they have
        System.out.print("How many favorite things do you have? ");
        int numFavorites = scanner.nextInt();

        // Create a String array of the correct size based on user input
        String[] favoriteThings = new String[numFavorites];

        // Ask the user to enter their favorite things and store them in the array
        for (int i = 0; i < numFavorites; i++) {
            System.out.print(STR."Enter favorite thing #\{i + 1}: ");
            favoriteThings[i] = scanner.next();
        }

        // Print out the contents of the array
        System.out.println("\nYour favorite things:");
        for (int i = 0; i < numFavorites; i++) {
            System.out.println(STR."Favorite thing #\{i + 1}: \{favoriteThings[i]}");
        }

        scanner.close();
    }
}

