package PALab_303_4_1;

public class Program3 {
    public static void main(String[] args) {
        // Declare and initialize the variable x
        int x = 15;

        // Check the value of x using if-else-if statements
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }

        // Change the value of x to 50
        x = 50;

        // Re-check the value of x using if-else-if statements
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
    }
}

