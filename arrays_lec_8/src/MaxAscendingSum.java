public class MaxAscendingSum {
//    https://leetcode.com/problems/maximum-ascending-subarray-sum/?envType=daily-question&envId=2025-02-04
    // by shubham 0ms beats 100% runtime O(n)
    public int maxAscendingSum(int[] arr) {
        if(arr.length == 1) return arr[0];

        int max = 0; int current = 0;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                current += arr[i];
            }else{
                current += arr[i];
                max = Math.max(max, current);
                current = 0;
            }
        }
        current += arr[arr.length - 1];
        return Math.max(max, current);
    }

    /* another way 0ms 100% runtime
    public int add(int n1, int  n2, int[] arr){
        int res=0;
        for(int i=n1;i<=n2;i++){
            res += arr[i];
        }
        return res;
    }
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int low=0,high=0;
        int res = 0;
        for(int i=0;i<n;i++){

            if((i<n-1) && nums[i]<nums[i+1] ){

                high++;

            }
            else if((i<n-1) && nums[i]>=nums[i+1]){
                 res = Math.max(res,add(low,high,nums));
                 high++;
                low=high;
            }
            // else if((i<n-1) && nums[i]==nums[i+1]){
            //      high++;
            //     low=high;

            // }

        }
         res = Math.max(res,add(low,high,nums));
        return res;
    }
     */
}
