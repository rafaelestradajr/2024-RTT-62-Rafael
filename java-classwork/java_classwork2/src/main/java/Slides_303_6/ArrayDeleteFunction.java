package Slides_303_6;


import java.util.Arrays;

public class ArrayDeleteFunction{

    public static int[] deleteElementFromArray(int[] source, int deletedPosition) {
        // Check if the deletedPosition is valid
        if (deletedPosition < 0 || deletedPosition >= source.length) {
            System.out.println("Position to delete is invalid");
            int[] deleted = new int [source.length -1]; // Return the original source if position is invalid
        }

        // Create a new source with size - 1
        int[] deleted = new int[source.length - 1];


        // Copy the elements before the deleted position
        for (int pos = 0; pos < deletedPosition; pos++) {
            deleted[pos] = source[pos];
        }

        // Copy the elements after the deleted position
        for (int pos = deletedPosition + 1; pos < source.length; pos++) {
            deleted[pos - 1] = source[pos];
        }

        return deleted; // Return the new source without the deleted element
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int deletedPosition = 2;

        int[] deletedArray = deleteElementFromArray(array, deletedPosition);

        for (int value : deletedArray) {
            System.out.println(value);
            System.out.println(Arrays.toString(array));

        }
    }
}

