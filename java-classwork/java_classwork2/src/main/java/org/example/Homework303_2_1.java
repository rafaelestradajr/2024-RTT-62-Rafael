package org.example;

import java.text.DecimalFormat;





import static java.lang.StringTemplate.STR;

public class Homework303_2_1 {

    static final double SALES_TAX = 0.45;

    public static void main(String[] ignoredArgs) {

        //Write a program that declares two integer variables, assigns and integer to each, and adds them together.
        //Assign the sum to a variable . Print out the result

        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;

        System.out.println(STR."The sum of \{num1} and \{num2} is \{sum}");


//Write a program that declares two double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
//

        double d1 = 10.5d;
        double d2 = 20.5d;

        double dsum = d1 + d2;

        System.out.println(dsum);


/*
Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?

*/

        int s = 5;
        double t = 10.5;

        double sum2= s + t;

        System.out.println("The sum of " + s + " + " + t + " = " + sum2);

        /* Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?// */
        int a = 5;
        double b = 10.5;
        double div3;
        div3 = b / a;
        System.out.println(STR."The quotient of b divided by a is \{div3}");


        /* Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.// */

        double var1 = 25;
        double var2 = 50;
        double divResult =  (var2 / var1);
        int divResult1 = (int) divResult;


        System.out.println(STR."The division result of var1 by var2 is \{divResult}\n \"The casting of result to an integer is \{divResult1}");


        /* Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again. */

        int x = 5;
        int y = 6;
        int q = y/x;

        double y1 = (double) y/ (double)x;




        System.out.println(STR."The quotient integer value for q is \{q}");
        System.out.println(STR."The quotient integer value for q is \{y1}");




        /* Write a program that declares a named constant and uses it in a calculation. Print the result. */

        final double TAX_RATE = 0.13;
        final int PRICE;
        double total = 0;
        PRICE =10;
        double total2 = (int) (PRICE+PRICE*TAX_RATE);

        System.out.println(STR."The total tax on price is  \{total2}");

        /* Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create two more variables called subtotal and totalSale and complete an "order" for three items of the first product, four items of the second product, and two items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places/ */

        double coffee = 1.00;
        double greenTea = 2.25;
        double donuts = 1.75;


        double subtotal = (coffee * 3) + (greenTea * 4) + (donuts *2);
        double totalSale = (SALES_TAX) + (subtotal);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Subtotal   : " + df.format(subtotal));
        System.out.println("Sales Tax  : " + df.format(SALES_TAX));
        System.out.println("Total Sale : " + df.format(totalSale));






    }
}