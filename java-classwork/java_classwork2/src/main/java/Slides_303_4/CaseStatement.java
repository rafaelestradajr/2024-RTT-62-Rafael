public static void main(String args[]) {
    String output;
    // grade is a value 0 - 100
    int grade = 50;
    switch (grade / 10) {
        case 10:
            output = "Wow!; ";
            break;
        case 9:
            output = "Excellent!";
            break;
        case 8:
            output = "Very Good!";
            break;
        case 7:
            output = "Good!";
            break;
        default:
            output = "Keep trying!";
            break;
    }
    System.out.println(output);
}

