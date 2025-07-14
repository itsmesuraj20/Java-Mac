import java.util.ArrayList;

public class findduplicate {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,3,4,3};
        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i = 0;i<arr.length;i++)
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j] && !newArr.contains(arr[i])){
                    newArr.add(arr[i]);
                }
            }
        }
        System.out.println(newArr);
    }
}
