package Array;

import java.util.Scanner;

public class implementation {
    public static void main(String[] args) {
        int []arr = new int[10];
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
        }

        System.out.println("Printing the elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } 
    }
}
