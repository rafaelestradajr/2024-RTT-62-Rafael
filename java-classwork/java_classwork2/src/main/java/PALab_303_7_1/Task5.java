package PALab_303_7_1;

public class Task5 {
    public static void main(String[] args) {
        // Create an integer array with a length of 5
        int[] myArray = new int[5];

        // Loop through the array and assign the value of the loop control variable to the corresponding index
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }

        /* Print the array elements */
        System.out.println("Array elements:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(STR."Index \{i}: \{myArray[i]}");
        }
    }
}

