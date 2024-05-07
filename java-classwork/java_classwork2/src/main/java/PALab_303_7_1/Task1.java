package PALab_303_7_1;

public class Task1 {
    public static void main(String[] args) {
        // Create an array of integers with a length of 3
        int[] array = new int[3];

        // Assign values to the indexes
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        // Print out each array element
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }
}
