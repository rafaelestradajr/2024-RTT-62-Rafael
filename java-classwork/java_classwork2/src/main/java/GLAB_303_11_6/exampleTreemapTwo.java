package GLAB_303_11_6;

import java.util.TreeMap;

public class exampleTreemapTwo {

    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println(STR."TreeMap: \{numbers}");

        // Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println(STR."First Key: \{firstKey}");
        // Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println(STR."Last Key: \{lastKey}");
        // Using firstEntry() method
        System.out.println(STR."First Entry: \{numbers.firstEntry()}");
        // Using the lastEntry() method
        System.out.println(STR."Last Entry: \{numbers.lastEntry()}");


    }
}