package GLAB_303_11_5;

import java.util.TreeSet;
public class TreesetExampletwo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println(STR."TreeSet: \{numbers}");
// Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println(STR."Is 5 removed? \{value1}");
// Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println(STR."Are all elements removed? \{value2}");
    }
}
