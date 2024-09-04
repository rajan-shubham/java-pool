package matrixChainMulti;

public class BottomUpMCM {
    public static void main(String[] args) {
        int[] matrixs = {4, 2, 3, 1, 3};
        int n = matrixs.length;

        int minCostMCM = dpMCM(matrixs, n);
        System.out.println(minCostMCM);
    }

    public static int dpMCM(int[] arr, int n) {
        // Create a 2D array to store the minimum cost of multiplying matrices from i to j
        int[][] dp = new int[n][n];

        // Initialize the dp array with 0s for the base case (single matrix)
        for (int i = 1; i < n; i++) {
            dp[i][i] = 0;
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = i+1; j < n; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int steps = arr[i - 1] * arr[k] * arr[j] + dp[i][k] + dp[k + 1][j];
                    if (steps < min) {
                        min = steps;
                    }
                }
                dp[i][j] = min;
            }
        }

        return dp[1][n - 1];
    }
}
