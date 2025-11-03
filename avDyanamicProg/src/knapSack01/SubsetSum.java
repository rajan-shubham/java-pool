package knapSack01;
//https://www.youtube.com/watch?v=_gPcYovP7wc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=7
//https://www.geeksforgeeks.org/dsa/subset-sum-problem-dp-25/
public class SubsetSum {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 7, 8, 10};
//        int sum = 11;
        int[] arr = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;

        boolean hasSubsetSum = isSubsetSum(arr, sum);
        System.out.println(hasSubsetSum);
    }

    public static boolean isSubsetSum(int[] arr, int sum){
        int n = arr.length;
        boolean[][] t = new boolean[n+1][sum+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i==0) t[i][j] = false;
                if (j==0) t[i][j] = true;
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        for(boolean[] dp: t){
            for (int i = 0; i < sum + 1; i++) {
                System.out.print(dp[i] + " ");
            }
            System.out.println();
        }
        return t[n][sum];
    }
}
