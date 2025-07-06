package Array.question;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element that need to find");
        int key = sc.nextInt();

        //Linear Search 
        boolean check = false;
        int index = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                check = true;
                System.out.println("Found at : "  + i);
            }
        }

      if(!check)
      System.out.println("Not Found");
    }
}
