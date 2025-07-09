package Hashing;

import java.util.HashMap;

public class implementation {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();

        hashmap.put(1,"Suraj");
        hashmap.put(2, "Shreyashi");
        hashmap.put(3,"Vanshika");
        hashmap.put(4,"Gungun");

        System.out.println(hashmap);

        System.out.println(hashmap.get(2));

        System.out.println(hashmap.get(2711));
        System.out.println(hashmap.containsKey(1)); //Give boolean result
        System.out.println(hashmap.containsKey(2711));// Give the boolean result 

    }
}
