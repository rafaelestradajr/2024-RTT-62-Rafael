package GLAB_303_11_5;

import java.util.HashSet;
public class exampletwo {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println(STR."HashSet1: \{evenNumbers}");
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println(STR."HashSet2: \{numbers}");
// Union of two set
        numbers.addAll(evenNumbers);
        System.out.println(STR."Union is: \{numbers}");
    }
}
