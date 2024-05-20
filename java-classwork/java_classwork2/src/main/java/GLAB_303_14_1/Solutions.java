package GLAB_303_14_1;

import java.util.Scanner;
import java.util.function.Function;

public class Solutions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Lambda expression to remove digits
        Function<String, String> removeDigits = s -> s.replaceAll("\\d", "");

        // Lambda expression to introduce
        Function<String, String> introduce = s -> STR."This is my friend \{s.replaceAll("\\d", "")}.";
        ;

        // Lambda expression to greet
        Function<String, String> greet = s -> STR."Hello, \{s.replaceAll("\\d", "")}!";

        // Print output to STDOUT
       // System.out.println(removeDigits.apply(input));
        System.out.println(introduce.apply(input));
        System.out.println(greet.apply(input));
    }
}


