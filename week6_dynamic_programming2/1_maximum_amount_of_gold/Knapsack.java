import java.util.*;

public class Knapsack {
    private static int optimalWeight(int W, int[] w) {
        int[][] dp = new int[w.length+1][W+1];
        for(int i=w.length-1;i>=0;i--) {
          for(int j=1;j<=W;j++) {
            int notPick = dp[i+1][j];
            int pick = 0;
            if(w[i]<=j) pick = w[i] + dp[i+1][j-w[i]];
            dp[i][j] = Math.max(notPick, pick);
          }
        }
        return dp[0][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

