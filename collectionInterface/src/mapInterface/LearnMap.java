package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        // Red Black Tree : sorting based on keys
        Map<String, Integer> numbers = new TreeMap<>(); // put, containsKey, remove : O(log N)
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);

        System.out.println(numbers); //{Five=5, Four=4, One=1, Three=3, Two=2}


        /*
        Map<String, Integer> numbers = new HashMap<>(); // put, containsKey, remove : O(1)
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);

        numbers.remove("Three");

//        numbers.put("Two", 23); // override the value of key="Two"

        *//*if (!numbers.containsKey("Two")){
            numbers.put("Two",23);
        }
        numbers.putIfAbsent("Two",23);*//*

        System.out.println(numbers);
        System.out.println(numbers.containsValue(5));
        System.out.println(numbers.isEmpty());

*/
        /*for(Map.Entry<String, Integer> e: numbers.entrySet()){
//            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key: numbers.keySet()) System.out.print(key + " <--> ");
        for(Integer value: numbers.values()) System.out.print(value + " <--> ");
*/
    }
}
