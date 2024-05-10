package Slides_303_9_Inheritance;

public class sba1Practice {

    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMOPQRSTUVWXYZ";

        //part 1 create a for loop to print each character of the string s on its own line
        //you can use the s. charAt(pos) function
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)); // Print each character on its own line
        }







        //part 2
        // Given the following Strings convert them to integer values Integer.valueOf()



        String ten = "10";
        String hundred = "100";

// Convert the String "ten" to an integer
        int tenInteger = Integer.valueOf(ten);

// Convert the String "hundred" to an integer
        int hundredInteger = Integer.valueOf(hundred);

// Print the integer values
        System.out.println("tenInteger = " + tenInteger);
        System.out.println("hundredInteger = " + hundredInteger);





        //part 3
        //given an integer array find the sum of all the integers in the array



        int[] array = {2, 4, 5, 6, 7, 8, 10};
        int sum = 0; // Initialize sum variable to store the sum of the integers

// Iterate through each element of the array and add it to the sum
        for (int num : array) {
            sum += num;
        }

        System.out.println("The sum of all integers in the array is: " + sum);


        //part 4
        // given the array of string convert them to numbers and print the sum





        String[] stringArray = {"2", "4", "5", "6", "7", "8", "10"};
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        int sum1 = 0;
        for (int j : intArray) {
            sum1 += j;
        }

                // Print the sum
                System.out.println("The sum of the numbers is: " + sum1);
            }
        }



