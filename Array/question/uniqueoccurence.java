import java.util.ArrayList;

Hold pe rakho isko

public class uniqueoccurence {
    public static void main(String[] args) {

        int arr[] = {1,2,2,1,1,3};
        int counts[] = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) //O(n)
        {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if(arr[k]== arr[i]){
                    alreadyCounted = true;
                    break;
                }
            }

            //If not counted 
            if(!alreadyCounted){
                int count = 0;
                for (int j = 0; j < counts.length; j++) {
                    if(arr[j] == arr[i]){
                        count++;
                    }
                }
                counts[uniqueCount] = count;
                uniqueCount++;
            }
        }


        boolean ans = true;//O(n)*O(n) = O(n^2)
        for (int i = 0; i < uniqueCount; i++) {
            for (int j = i+1; j < uniqueCount; j++) {
                if(counts[i] == counts[j]){
                    ans = false;
                    break;
                }
            }
        }

        if(ans) 
        System.out.println("True");
        else
        System.out.println("false");
    }

}
