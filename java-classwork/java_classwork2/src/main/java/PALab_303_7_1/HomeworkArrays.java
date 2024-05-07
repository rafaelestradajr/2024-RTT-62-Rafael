package PALab_303_7_1;

import java.util.Random;

public class HomeworkArrays {
    public static void main(String[] args) {
        // Create an int array of length 10
        int[] intArray = new int[10];

        // Initialize the array to random integers
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100); // Generating random integers between 0 and 99
        }

        // Get the smallest integer in the array
        int smallest = intArray[0];
        for (int num : intArray) {
            if (num < smallest) {
                smallest = num;
            }
        }

        // Get the largest integer in the array
        int largest = intArray[0];
        for (int num : intArray) {
            if (num > largest) {
                largest = num;
            }
        }

        // Calculate the average value in the array
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        double average = (double) sum / intArray.length;

        // Print the results
        System.out.println(STR."Smallest integer in the array: \{smallest}");
        System.out.println(STR."Largest integer in the array: \{largest}");
        System.out.println(STR."Average value in the array: \{average}");
    }
}

