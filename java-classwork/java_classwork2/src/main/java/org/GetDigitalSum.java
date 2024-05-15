package org;

public class GetDigitalSum {
    public static int getDigitsSum(int largeNumber) {
        String numberAsString = String.valueOf(Math.abs(largeNumber)); // Convert to string
        int sum = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            sum += Character.getNumericValue(numberAsString.charAt(i)); // Convert char to int
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 94656; // Example number
        int sum = getDigitsSum(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
