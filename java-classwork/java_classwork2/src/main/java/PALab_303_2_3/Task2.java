package PALab_303_2_3;

public class Task2 {
    public static void main(String[] args) {
        // Declare a variable x and assign 150 to it
        int x1 = 150;

        // Print the decimal and binary values of x1 before shifting
        System.out.println(STR."Decimal value of x1 before shifting: \{x1}"); // Decimal value of x1 before shifting: 150
        System.out.println(STR."Binary string of x1 before shifting: \{Integer.toBinaryString(x1)}");   // Binary string of x1 before shifting: 10010110

        // Right shift x1 by 2 and assign the result back to x1
        x1 = x1 >> 2;

        // Print the decimal and binary values of x after shifting
        System.out.println(STR."Decimal value of x1 after shifting: \{x1}"); // Decimal value of x1 after shifting: 37
        System.out.println(STR."Binary string of x1 after shifting: \{Integer.toBinaryString(x1)}"); // Binary string of x1 after shifting: 100101

        // Anticipated values: Decimal value after shifting: 37, Binary string after shifting: 100101

        // Declare a variable x2 and assign 225 to it
        int x2 = 225;

        // Print the decimal and binary values of x2 before shifting
        System.out.println(STR."Decimal value of x2 before shifting: \{x2}"); // Decimal value of x2 before shifting: 225
        System.out.println(STR."Binary string of x2 before shifting: \{Integer.toBinaryString(x2)}");   // Binary string of x2 before shifting: 11100001

        /* Right shift x2 by 2 and assign the result back to x2 */
        x2 = x2 >> 2;

        // Print the decimal and binary values of x2 after shifting
        System.out.println(STR."Decimal value of x2 after shifting: \{x2}"); // Decimal value of x2 after shifting: 56
        System.out.println(STR."Binary string of x2 after shifting: \{Integer.toBinaryString(x2)}"); // Binary string of x2 after shifting: 111000

// Declare a variable x3 and assign 1555 to it
        int x3 = 1555;

        // Print the decimal and binary values of x3 before shifting
        System.out.println(STR."Decimal value of x3 before shifting: \{x3}"); // Decimal value of x3 before shifting: 1555
        System.out.println(STR."Binary string of x3 before shifting: \{Integer.toBinaryString(x2)}");   // Binary string of x3 before shifting: 111000

        /* Right shift x2 by 2 and assign the result back to x3 */
        x3 = x3 >> 2;

        // Print the decimal and binary values of x3 after shifting
        System.out.println(STR."Decimal value of x3 after shifting: \{x3}"); // Decimal value of x3 after shifting: 388
        System.out.println(STR."Binary string of x3 after shifting: \{Integer.toBinaryString(x3)}"); // Binary string of x3 after shifting: 110000100


        // Declare a variable x4 and assign 32456 to it
        int x4 = 32456;

        // Print the decimal and binary values of x4 before shifting
        System.out.println(STR."Decimal value of x4 before shifting: \{x4}"); // Decimal value of x4 before shifting: 32456
        System.out.println(STR."Binary string of x4 before shifting: \{Integer.toBinaryString(x4)}");   // Binary string of x4 before shifting:  111111011001000

        /* Right shift x4 by 2 and assign the result back to x4 */
        x4 = x4 >> 2;

        // Print the decimal and binary values of x4 after shifting
        System.out.println(STR."Decimal value of x4 after shifting: \{x4}"); // Decimal value of x4 after shifting: 8114
        System.out.println(STR."Binary string of x4 after shifting: \{Integer.toBinaryString(x4)}"); // Binary string of x4 after shifting:1111110110010

    }
}

