public class basicdP{
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: there's one way to make 0
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[i - j];
            }
        }
        System.out.println(dp[n]); // Output the number of ways to make n
    }
}