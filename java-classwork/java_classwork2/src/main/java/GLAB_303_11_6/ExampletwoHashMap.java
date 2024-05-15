package GLAB_303_11_6;

import java.util.HashMap;

public class ExampletwoHashMap {
    public static void main(String[] args){
        HashMap<String, String> newHashMap = new HashMap<>();

        //Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null,"Sony");
        System.out.println((STR."Original map contains: \{newHashMap}"));
        //getting size of Hashmap
        System.out.println(STR."Size of original Map is: \{newHashMap.size()}");

        //copy contains of one Hashmap to another
        HashMap<String, String> copyHashMap = new HashMap<>(newHashMap);
        System.out.println(STR."copyHashMap mappings= \{newHashMap}");
        System.out.println(STR."copyHashMap after removing null key  \{copyHashMap}");

        //removal of null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println(STR."copyHashMap null key value = \{nullKeyValue}");
        System.out.println(STR."copyHashMap after removing null key = \{copyHashMap}");
        System.out.println(STR."Size of copyHashMap is:\{copyHashMap.size()}");




    }
}
