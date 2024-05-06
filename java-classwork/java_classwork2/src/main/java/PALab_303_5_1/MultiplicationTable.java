package PALab_303_5_1;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Define the size of the multiplication table (e.g., 10x10)
        int size = 10;

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                // Calculate and print the product
                System.out.printf("%4d", i * j);
            }
            // Move to the next row
            System.out.println();
        }
    }
}

