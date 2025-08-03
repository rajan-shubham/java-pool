import java.util.*;
class MakeArrElemUnique {

// https://www.geeksforgeeks.org/problems/make-array-elements-unique--170645/1
  
    public int minIncrements(int[] arr) {
        // Code here
        int N = arr.length;
        long count = 0;
        Arrays.sort(arr);
        for(int i = 1; i < N; i++)
        {
            if(arr[i] <= arr[i-1])
            {
                int val = arr[i-1] - arr[i] + 1;
                count += val;
                arr[i] += val;
            }
        }
        return (int) count;
    }
}
