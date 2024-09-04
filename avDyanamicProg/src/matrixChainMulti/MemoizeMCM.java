package matrixChainMulti;

import java.util.Arrays;

public class MemoizeMCM {
    static int[][] t = new int[5][5];

    public static void main(String[] args) {
        int[] matrixs = {4, 2, 3, 1, 3};

        // Fill each row of the 2D array with -1
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int minCostMCM = memMCM(matrixs, 1, matrixs.length - 1);
        System.out.println(minCostMCM);
    }

    public static int memMCM(int[] arr, int i, int j){
        // Base case: Only one matrix
        if (i >= j){
            return 0;
        }
        if (t[i][j] != -1){
            return t[i][j];
        }
        int min = Integer.MAX_VALUE;
        // Try every possible split point `k` between `i` and `j`
        for (int k = i; k < j ; k++) {
            // Cost of multiplying matrices from i to k and from k+1 to j
            int tempAns = memMCM(arr, i, k) + memMCM(arr, k+1, j) + (arr[i-1] * arr[k] * arr[j]);
            if (tempAns < min){
                min = tempAns;
            }
        }
        return t[i][j] = min;
    }
}
