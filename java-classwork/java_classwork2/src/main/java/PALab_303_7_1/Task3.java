package PALab_303_7_1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        // Create and initialize the array of String type
        String[] colors = {"red", "green", "blue", "yellow"};

        // Print out the array length
        System.out.println("Original array length: " + colors.length);

        // Make a copy using the clone() method
        String[] copiedColors = colors.clone();

        // Verify that the original array was copied by printing the copied array
        System.out.println("Copied array: " + Arrays.toString(copiedColors));
    }
}

