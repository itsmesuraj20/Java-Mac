package Recursion and Backtracking .Recursion;

public class recursion {
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }
    // Recursive method to calculate Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case
        }
        if (n == 1) {
            return 1; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
    // Recursive method to calculate power
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case
        }
        return base * power(base, exponent - 1); // Recursive case
    }
    // Recursive method to calculate sum of digits
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Base case
        }
        return n % 10 + sumOfDigits(n / 10); // Recursive case
    }
    // Recursive method to calculate GCD
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case
        }
        return gcd(b, a % b); // Recursive case
    }
    // Recursive method to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // Using GCD to calculate LCM
    }
    // Recursive method to calculate permutations
    public static void permutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans); // Base case
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1); // Remaining string
            permutations(ros, ans + ch); // Recursive case
        }
    }
    
    // Recursive method to calculate combinations
    public static void combinations(String str, String ans, int index) {
        if (index == str.length()) {
            System.out.println(ans); // Base case
            return;
        }
        // Include the current character
        combinations(str, ans + str.charAt(index), index + 1);
        // Exclude the current character
        combinations(str, ans, index + 1); // Recursive case
    }

    // Recursive method to calculate subsets
    public static void subsets(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans); // Base case
            return;
        }
        // Include the current character
        subsets(str.substring(1), ans + str.charAt(0)); // Recursive case
        // Exclude the current character
        subsets(str.substring(1), ans); // Recursive case
    }


}
