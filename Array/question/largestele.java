package Array.question;

import java.util.*;
public class largestele {
    public static void main(String[] args) {
        //Largest element in array 
        //Not sorted
        int []arr = {1};
        if(arr.length == 0){
            System.out.println("Array is empty cant proceed");
        }
        else{
        System.out.println("Largest element in the array with brute force solution : " + largEleBrute(arr)); 
        System.out.println("Largest element in the array with optimal solution : " + largEleOptimal(arr));   
        }
    }

    public static int largEleBrute(int []arr){
        //TC - O(n logn) because of the sorting.
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

   
    public static int largEleOptimal(int arr[]){
        int largestSofar = arr[0];

        for(int i = 1;i<arr.length;i++){
            if(arr[i] > largestSofar){
                largestSofar = arr[i];
            }
        }

        return largestSofar;
    }
}
