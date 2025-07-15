package Array.question;
//In this question I m return -1 if the element of the array is same.

import java.util.Arrays;

public class secondsmallest {
    public static void main(String[] args) {
        int[] arr = { 1,2,3};

        if (arr.length < 2) {
            System.out.println("Cant possible as the minimum two element is needed");
        } else {
            System.out.println(secondSmallestBrute(arr));
            System.out.println(secondSmallestBetter(arr));
            System.out.println(secondSmallestOptimal(arr));
        }
    }

    public static int secondSmallestBrute(int[] arr) {
        Arrays.sort(arr);

        int smallestSoFar = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] > smallestSoFar) {
                return arr[i];
            }
        }
        return -1;

        // TC- O(nlogn)+O(n) = O(nlogn)
        // SC - O(1)
    }

    public static int secondSmallestBetter(int[] arr) {
        int smallestSoFar = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestSoFar) {
                smallestSoFar = arr[i];
            }
        }

        int secondSmallestSoFar = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < secondSmallestSoFar && arr[j] > smallestSoFar) {
                secondSmallestSoFar = arr[j];
            }

        }
        return secondSmallestSoFar == Integer.MAX_VALUE ? -1 : secondSmallestSoFar;

        // TC - O(n) + O(n) = O(n);
        // SC - O(1)

    }

    public static int secondSmallestOptimal(int[] arr) {
        int smallestSoFar = Integer.MAX_VALUE;
        int secondlargestSofar = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // int[] arr = {3,1,2};
            if (arr[i] < smallestSoFar) {
                secondlargestSofar = smallestSoFar;
                smallestSoFar = arr[i];
            } else if (arr[i] > smallestSoFar && arr[i] < secondlargestSofar) {
                secondlargestSofar = arr[i];
            }
        }
        return secondlargestSofar == Integer.MAX_VALUE ? -1 : secondlargestSofar;
    }
}
