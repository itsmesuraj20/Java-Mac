package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Array.question.linearsearch;

public class uniqueoccurences {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4 };
        int n = arr.length;

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            if (hash.containsKey(arr[j])) {
                hash.put(arr[j], hash.get(arr[j]) + 1);
            } else {
                hash.put(arr[j], 1);
            }
        }

        HashSet<Integer> freqSet = new HashSet<>();

        //Try new Method for this question
        for (int i : freqSet) {
             int freq = i.getValue();
            if(freqSet.contains(freq)){
                System.out.println(false);
                return;
            }
            else{
                freqSet.add(freq);
            }
        }
        // for (Entry<Integer, Integer> i : hash.entrySet()) {
        //     int freq = i.getValue();
        //     if (freqSet.contains(freq)) {
        //         System.out.println(false);
        //         return;
        //     } else {
        //         freqSet.add(freq);
        //     }
        // }
        
        System.out.println(true);
    }
}
