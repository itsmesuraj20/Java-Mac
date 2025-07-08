package Array.question;

public class minandmaxelement {
    public static void main(String[] args) {
        int arr[] = {1,-6};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        
        for(int i = 0; i<arr.length;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.println("Maximum Value : " + max);
        System.out.println("Min : " + min);
    }
}
