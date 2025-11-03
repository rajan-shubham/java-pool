package knapSack01;

public class TabulationBU01KS {

    public static void main(String[] args) {
        int[] wt = {2, 3, 4, 5};
        int[] val = {1, 2, 5, 6};
        int w = 9;
        int n = wt.length;

        int profit = knapSackRec(wt, val, w, n);
        System.out.println(profit);
    }

    public static int knapSackRec(int[] wt, int[] val, int w, int n) {
        int[][] t = new int[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (wt[i - 1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        for(int[] dp: t){
            for (int i = 0; i < w + 1; i++) {
                System.out.print(dp[i] + " ");
            }
            System.out.println();
        }
        return t[n][w];
    }
}