package Array.question;

public class isArrayisSorted {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        int arr[] = {1,3,2,4,5};

        boolean recordAns = true;
        for (int i = 1; i < arr.length; i++) {
            if(!(arr[i] >= arr[i-1]))
            {
               recordAns = false;
               break;
            }
        }

        if(recordAns) System.out.println("Sorted");
        else System.out.println("Not Sorted");
    }
}
