public class KadanesAlgoMaxSubarray {
    /*
    Kadane's Algorithm is an efficient dynamic programming approach used to find
    the maximum sum of a contiguous subarray within a one-dimensional array of numbers.
    It solves the "Maximum Subarray Problem" in linear time, O(N).

    Explanation:
        • max_so_far: This variable stores the maximum sum found among all contiguous subarrays encountered so far.
            It is initialized to Integer.MIN_VALUE to correctly handle arrays where all elements are negative.
        • current_max: This variable keeps track of the maximum sum of the subarray ending at the current position.
            It is initialized to 0.
        • Iteration: The algorithm iterates through each element of the array.
	        • In each iteration, the current element arr[i] is added to current_max.
	        • If current_max exceeds max_so_far, max_so_far is updated.
	        • Crucially, if current_max becomes negative, it is reset to 0.
	            This is because a negative current_max would only diminish the sum of any subsequent subarray it's extended into.
	            It's more beneficial to start a new subarray from the next element.

        • Return Value: After iterating through the entire array, max_so_far holds the maximum sum of any contiguous subarray.
     */
    public static int maxSubArraySum(int[] arr) {
        // Initialize max_so_far to the smallest possible integer value
        // to handle cases where all numbers are negative.
        int max_so_far = Integer.MIN_VALUE;

        // Initialize current_max to 0, representing the sum of the current subarray.
        int current_max = 0;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to current_max
            current_max = current_max + arr[i];

            // If current_max is greater than max_so_far, update max_so_far
            if (current_max > max_so_far) {
                max_so_far = current_max;
            }

            // If current_max becomes negative, reset it to 0.
            // This is because a negative current_max will only decrease the sum
            // of any future subarray it's part of. It's better to start a new subarray.
            if (current_max < 0) {
                current_max = 0;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr1 = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum for arr1: " + maxSubArraySum(arr1)); // Expected: 7 (from [4, -1, -2, 1, 5])
        System.out.println(maxSubArray0s(arr1));

        int[] arr2 = {1, 2, 3, -2, 5};
        System.out.println("Maximum contiguous sum for arr2: " + maxSubArraySum(arr2)); // Expected: 9 (from [1, 2, 3, -2, 5])
        System.out.println(maxSubArray1s(arr2));

        int[] arr3 = {-1, -2, -3, -4};
        System.out.println("Maximum contiguous sum for arr3: " + maxSubArraySum(arr3)); // Expected: -1 (from [-1])
    }

    public static int maxSubArray0s(int[] nums) {
        int sum=0;
        int maxsum=nums[0];

        for(int i=0;i<nums.length;i++){

            sum+= nums[i];
            maxsum=Math.max(sum,maxsum);
            if(sum < 0){
                sum=0;
            }
        }
        return maxsum;
    }

    public static int maxSubArray1s(int[] nums) {
        int res = nums[0];
        int maxEnding = nums[0];
        for(int i = 1; i<nums.length; i++){
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}