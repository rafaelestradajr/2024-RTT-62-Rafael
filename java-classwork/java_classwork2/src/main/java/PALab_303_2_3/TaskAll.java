package PALab_303_2_3;




public class TaskAll {
    public static void main(String[] args) {
        // 1. Declare and assign values to variables x and y
        int x = 7;
        int y = 17;

        // Predicted result of bitwise AND operation: 1 (binary: 0001)
        // 2. Calculate bitwise AND of x and y, assign to z
        int z = x & y; // z = 1

        // Predicted result of bitwise OR operation: 23 (binary: 10111)
        // 3. Calculate bitwise OR of x and y, assign to z
        z = x | y; // z = 23

        // 5. Demonstrate postfix increment operator
        int num = 10;
        System.out.println(STR."Value before increment: \{num}"); // Output: 10
        num++;
        System.out.println(STR."Value after increment: \{num}"); // Output: 11

        // 6. Demonstrate three ways to increment a variable by 1
        int a = 5;
        System.out.println(STR."Initial value: \{a}"); // Output: 5\
        a = a + 1; // Increment method 1
        System.out.println(STR."After increment method 1: \{a}"); // Output: 6
        a += 1; // Increment method 2
        System.out.println(STR."After increment method 2: \{a}"); // Output: 7
        a++; // Increment method 3
        System.out.println(STR."After increment method 3: \{a}"); // Output: 8

        // 7. Demonstrate prefix and postfix increment operators
        int sum;
        int newX = 5;
        int newY = 8;

        // Prefix increment operator
        sum = ++newX + newY;
        System.out.println(STR."Sum with prefix increment: \{sum}"); // Output: 14

        // Postfix increment operator
        newX = 5;
        sum = newX++ + newY;
        System.out.println(STR."Sum with postfix increment: \{sum}"); // Output: 13
    }
}



