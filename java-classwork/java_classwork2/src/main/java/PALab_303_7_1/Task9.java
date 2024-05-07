package PALab_303_7_1;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        // Define the int array
        int[] array = {4, 2, 9, 13, 1, 0};

        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array
        System.out.print("Array in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Print the smallest number (first element after sorting)
        System.out.println(STR."The smallest number is \{array[0]}");

        // Print the largest number (last element after sorting)
        System.out.println(STR."The biggest number is \{array[array.length - 1]}");
    }
}

