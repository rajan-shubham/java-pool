package knapSack01;

public class KnapSack01 {
    public static void main(String[] args) {
        int[] wt = {2, 3, 4, 5};
        int[] val = {1, 2, 5, 6};
        int w = 9;
        int n = wt.length;

        int maxProfit = knapSackRec(wt, val, w, n);
        System.out.println(maxProfit);
    }

    public static int knapSackRec(int[] wt, int[] val, int w, int n){
        // Base case: if no items left or capacity is 0
        if(n == 0 || w == 0){
            return 0;
        }

        // If the weight of the nth item is less than or equal to the remaining capacity
        if (wt[n-1] <= w){
            // Return the maximum of including the nth item or excluding it
            return Math.max(val[n-1] + knapSackRec(wt, val, (w - wt[n-1]), n-1), knapSackRec(wt,val, w, n - 1));
        }
        // If the weight of the nth item is more than the remaining capacity, exclude it
        return knapSackRec(wt, val, w, n-1);
    }
}
