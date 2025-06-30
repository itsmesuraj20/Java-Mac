package Recursion;

public class practiceRecursion {
    public static void main(String[] args) {
        countSum(5);
        System.out.println();
    }

    public static void countSum(int n){
        if(n == 0)
        return ;

        
        System.out.println(n + " ");
        countSum(n - 1);
    }
}
