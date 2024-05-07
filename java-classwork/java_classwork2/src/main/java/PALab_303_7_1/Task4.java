package PALab_303_7_1;

public class Task4 {
    public static void main(String[] args) {
        // Create an integer array with 5 elements
        int[] myArray = {1, 2, 3, 4, 5};

        // Print out the value at the first index
        System.out.println(STR."Value at first index: \{myArray[0]}");

        // Print out the value at the last index using length - 1 as the index
        System.out.println(STR."Value at last index: \{myArray[myArray.length - 1]}");

        try {
            // Attempt to access an index beyond the array length
            System.out.println(STR."Value at index length: \{myArray[myArray.length]}");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(STR."Exception caught: \{e.getMessage()}");
        }

        try {
            // Attempt to assign a value to the array index 5
            myArray[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(STR."Exception caught: \{e.getMessage()}");
        }
    }
}

