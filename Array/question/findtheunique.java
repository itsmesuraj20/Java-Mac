package Array.question;

//Coding Ninja Question;
//Find the Unique


public class findtheunique {
    public static void main(String[] args) {
     int arr[] = {};
     

     if(arr.length == 0){
        System.out.println("Array Empty cant proceed");
        return; 
     }

     boolean found = false;
     for(int i = 0;i<arr.length;i++){
        
        int c = 0 ;
        for(int j = 0;j<arr.length;j++){
            if(arr[i] == arr[j]){
                c++;
            }
        }
        if(c == 1){
            System.out.println("Found at : " + arr[i]);
            found = true;
        }
     }

     if(!found)
     System.out.println("No unique element found");
    }
}
