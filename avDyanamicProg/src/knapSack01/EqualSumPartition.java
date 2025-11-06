package knapSack01;
/*
Equal Sum Partition Problem
Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is same.
Examples: arr[] = {1, 5, 11, 5}
Output: true
The array can be partitioned as {1, 5, 5} and {11}
 */

public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        System.out.println("is any Equal Sum Partition : " + isEqualSumPartition(arr));
    }

    public static boolean isEqualSumPartition(int[] arr){
        int sum = 0;
        for(int i: arr) sum += i;
        if (sum % 2 != 0) return false;
        return isSubsetSum(arr, sum/2); // else if(sum % 2 == 0) return isSubsetSum(arr, sum/2);
    }

    // is any subset possible in given array i.e. equal to sum
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

        return t[n][sum];
    }
}
