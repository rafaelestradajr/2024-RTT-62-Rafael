package PALab_303_12_1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.*;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            try{
                int x = new Integer(sc.nextInt());
                int y = new Integer(sc.nextInt());
                System.out.println(""+(x/y));
            }catch (InputMismatchException e){
                System.out.println("java.util.InputMismatchException");
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }
}