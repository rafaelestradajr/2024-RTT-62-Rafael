package PALab_303_7_1;

public class Task8 {
    public static void main(String[] args) {
        // Create a String array of 5 elements
        String[] myArray = {"one", "two", "three", "four", "five"};

        // Print the original array
        System.out.println("Original array:");
        printArray(myArray);

        // Swap the first element with the middle element
        int middleIndex = myArray.length / 2;
        String temp = myArray[0];
        myArray[0] = myArray[middleIndex];
        myArray[middleIndex] = temp;

        // Print the array after swapping
        System.out.println("\nArray after swapping first element with middle element:");
        printArray(myArray);
    }

    // Method to print the elements of an array
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(STR."Index \{i}: \{array[i]}");
        }
    }
}

