package knapSack01;

import java.util.Arrays;

public class MemoizeKS01 {
    // new int[n -> no. of rows + 1 (total no of objects + 1)] [w -> no of column + 1 (total capacity + 1)]
    static int[][] t = new int[5][10];

    public static void main(String[] args) {
        int[] wt = {2, 3, 4, 5};
        int[] val = {1, 2, 5, 6};
        int w = 9;
        int n = wt.length;

        // Fill each row of the 2D array with -1
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int profit = knapSackRec(wt, val, w, n);
        System.out.println(profit);
    }

    public static int knapSackRec(int[] wt, int[] val, int w, int n){
        // Base case: if no items left or capacity is 0
        if(n == 0 || w == 0){
            return 0;
        }

        // Check if value already computed
        if (t[n][w] != -1) { return t[n][w]; }

        // If the weight of the nth item is less than or equal to the remaining capacity
        if (wt[n-1] <= w){
            // Return the maximum of including the nth item or excluding it
            return t[n][w] = Math.max(val[n-1] + knapSackRec(wt, val, (w - wt[n-1]), n-1), knapSackRec(wt,val, w, n - 1));
        }
        // If the weight of the nth item is more than the remaining capacity, exclude it
        return t[n][w] = knapSackRec(wt, val, w, n-1);
    }
}
