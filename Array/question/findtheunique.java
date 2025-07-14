
//Coding Ninja Question;
//Find the Unique


public class findtheunique {
    public static void main(String[] args) {
     int arr[] = {};
     
     //Edge Case - what if the array is empty
     if(arr.length == 0){
        System.out.println("Array Empty cant proceed");
        return; 
     }

    //Count the number of occurrence
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

    //If Not found 
     if(!found)
     System.out.println("No unique element found");
    }
}
