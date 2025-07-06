package Array.question;

//Coding Ninja Question;
//Find the Unique


public class findtheunique {
    public static void main(String[] args) {
        int arr[] = {2,3,1,6,2,3,6};
        
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[j] == arr[i])
                {count++;
        }
    }

            if(count == 1)
            {System.out.println("Unique Element : " + arr[i]);
            break;
}
        }
    }
    
}
