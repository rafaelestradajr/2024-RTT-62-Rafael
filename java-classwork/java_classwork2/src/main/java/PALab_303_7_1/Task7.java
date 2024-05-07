package PALab_303_7_1;

public class Task7 {
    public static void main(String[] args) {
        // Create an array of 5 elements
        int[] myArray = {10, 20, 30, 40, 50};

        // Loop through the array and print the value of each element, excluding the middle element
        System.out.println("Array elements (excluding middle element):");
        for (int i = 0; i < myArray.length; i++) {
            // Check if the current index is not the middle element (index 2)
            if (i != 2) {
                System.out.println(STR."Index \{i}: \{myArray[i]}");
            }
        }
    }
}

