package PALab_303_7_1;

public class Task2 {
    public static void main(String[] args) {
        // Integer array with given values
        int[] array = {13, 5, 7, 68, 2};

        // Get the middle element
        int middleElement = getMiddleElement(array);

        // Print the middle element
        System.out.println("Middle element: " + middleElement);
    }

    // Method to return the middle element in an array
    public static int getMiddleElement(int[] array) {
        // Check if the array length is odd
        if (array.length % 2 != 0) {
            return array[array.length / 2];
        } else {
            // If the array length is even, return the element at index length / 2 - 1
            // (since arrays are zero-indexed)
            return array[array.length / 2 - 1];
        }
    }
}

