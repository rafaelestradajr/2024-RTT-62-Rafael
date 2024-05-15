package Slides_303_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExamples {
    public static void main (String [] args){
        List<String> stringList = new ArrayList<>();

        Map<String,String> stringMap = new HashMap<>();

        stringMap.put("key", "value");
        stringMap.put("key2", "value3");

        String value =stringMap.get("key");
        System.out.println(value);

        stringMap.put(null, "actual value 1234");

        for (String key : stringMap.keySet()) {
            System.out.println(STR."\{key}==\{stringMap.get(key)}");
        }

    }
}
