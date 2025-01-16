import java.util.*;

public class DistinctElemEquilibriumPoint {
//    https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();

        // Loop to iterate over windows
        for (int i = 0; i <= arr.length - k; i++) { // Ensure the window fits
            Set<Integer> setCount = new HashSet<>();

            // Add elements of the current window to the set
            for (int j = i; j < i + k; j++) {
                setCount.add(arr[j]);
            }

            // Add the size of the set (distinct elements) to the result
            result.add(setCount.size());
        }

        return result;
    }

//    https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Now totalSum is the right sum
            if (leftSum == totalSum) {
                return i; // Found equilibrium point
            }
            leftSum += arr[i];
        }
        return -1; // No equilibrium point

        // int start = 0;
        // int end = arr.length-1;
        // int leftsum = 0, rightsum = 0;
        // leftsum += arr[start];
        // rightsum += arr[end];
        // while(start <= end){

        //     if(leftsum < rightsum){
        //         start++;
        //         leftsum += arr[start];
        //     }else if(leftsum > rightsum){
        //         end--;
        //         rightsum += arr[end];
        //     }else if(leftsum == rightsum && start == end) return start+1;

        // }
        // return -1;
    }
}
