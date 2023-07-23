package CollectionsPractice;

import java.util.*;

public class PartOfCollection {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Rohan");
        list.add("Megha");

        // Verify if list contains a specific element or not
        System.out.println(list.contains("Suraj"));
        System.out.println(list.contains("Megha"));

        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Arsenal");
        hashmap.put(2, "ManU");
        hashmap.put(3, "ManCity");
        // Verify if map contains a specific key/value or not
        System.out.println(hashmap.containsKey(4));
        System.out.println(hashmap.containsKey(1));
        System.out.println(hashmap.containsValue("Real Madrid"));
        System.out.println(hashmap.containsValue("Arsenal"));

    }
}
