package matrixChainMulti;

public class RecursiveMCM {
    public static void main(String[] args) {
        int[] matrixs = {4, 2, 3, 1, 3};
        int minMCM = recMcm(matrixs, 1, matrixs.length - 1);
        System.out.println(minMCM);
    }

    public static int recMcm(int[] arr, int i, int j){
        // Base case: Only one matrix
        if (i >= j){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        // Try every possible split point `k` between `i` and `j`
        for (int k = i; k < j ; k++) {
            // Cost of multiplying matrices from i to k and from k+1 to j
            int tempAns = recMcm(arr, i, k) + recMcm(arr, k+1, j) + (arr[i-1] * arr[k] * arr[j]);
            if (tempAns < min){
                min = tempAns;
            }
        }
        return min;
    }
}
