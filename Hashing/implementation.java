package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class implementation {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();

        hashmap.put(1, "Suraj");
        hashmap.put(2, "Shreyashi");
        hashmap.put(3, "Vanshika");
        hashmap.put(4, "Gungun");

        // System.out.println(hashmap);

        // System.out.println(hashmap.get(2));

        // System.out.println(hashmap.get(2711));
        // System.out.println(hashmap.containsKey(1)); //Give boolean result
        // System.out.println(hashmap.containsKey(2711));// Give the boolean result
        // System.out.println(hashmap.containsValue("Shreyashi")); //Give the boolean
        // result
        // System.out.println(hashmap.containsValue("Shreyashii"));//Gives the boolean
        // result

        Set<Integer> sets = hashmap.keySet();

        for (int i : sets) {
            System.out.println(hashmap.get(i));
        }

        Set<Map.Entry<Integer, String>> keyPairs = hashmap.entrySet(); // save the data in the order

        for (Entry<Integer, String> i : keyPairs) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
    }
}
