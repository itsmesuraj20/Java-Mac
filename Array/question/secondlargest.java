package Array.question;

import java.util.*;

public class secondlargest {
    public static void main(String[] args) {
        // Second Largest Element in the array
        int arr[] = { 3,3,3,3 };
        if (arr.length == 0) {
            System.out.println("Array is empty cant proceed");
        } else if (arr.length == 1) {
            System.out.println("Cant Proceed because array has 1 element , needed 2 ");
        } else {
            System.out.println(
                    "Second Largest element in the array with brute force solution : " + secondlargestBruteForce(arr));
            System.out
                    .println("Second Largest element in the array with better solution : " + secondlargestBetter(arr));
            System.out.println(
                    "Second Largest element in the array with optimal solution:  " + secondlargestOptimal(arr));
        }
    }

    public static int secondlargestBruteForce(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int largestSofar = arr[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largestSofar) {
                return arr[i];
            }
        }

        return -1;

        // TC - O(nlog + O(n) = O(n));
        // SC - O(1);
    }

    public static int secondlargestBetter(int[] arr) {
        int largestSofar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestSofar) {
                largestSofar = arr[i];
            }
        }

        int secondlargestSofar = Integer.MIN_VALUE;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != largestSofar && arr[j] > secondlargestSofar) {
                secondlargestSofar = arr[j];
            }
        }

        return secondlargestSofar;
    }

    public static int secondlargestOptimal(int[] arr) {
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                // int arr[] = {-1,-2,0,1};
                secondlargest = largest;
                largest = arr[i];

            }
        }
        return secondlargest;
    }
}
