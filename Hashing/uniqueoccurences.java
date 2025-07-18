package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;


public class uniqueoccurences {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        int n = arr.length;

        //Count the number of occurence
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            if (hash.containsKey(arr[j])) {
                hash.put(arr[j], hash.get(arr[j]) + 1);
            } else {
                hash.put(arr[j], 1);
            }
        }

        HashSet<Integer> freqSet = new HashSet<>();
        
        for (Entry<Integer, Integer> i : hash.entrySet()) {
            int freq = i.getValue();
            if (freqSet.contains(freq)) {
                System.out.println(false);
                return;
            } else {
                freqSet.add(freq);
            }
        }

        System.out.println(true);
    }
}
