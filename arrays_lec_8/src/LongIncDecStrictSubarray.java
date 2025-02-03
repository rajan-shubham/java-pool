public class LongIncDecStrictSubarray {

//    https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/?envType=daily-question&envId=2025-02-03
    // by shubham O(N) 1ms
    public int longestMonotonicSubarray(int[] nums) {
        int maxi = 0, maxd = 0;
        int countInc = 0, countDec = 0;
        if(nums.length <= 1) return 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                countInc++;
            }else{
                countInc = 0;
            }
            maxi = Math.max(maxi, countInc);
        }
        for(int i = 1; i<nums.length; i++){
            if(nums[i] < nums[i-1]){
                countDec++;
            }else{
                countDec = 0;
            }
            maxd = Math.max(maxd, countDec);
        }

        return Math.max(maxi, maxd)+1;
    }

    /* 0ms runtime
    public int longestMonotonicSubarray(int[] nums) {
        int incLength = 1;
        int decLength = 1;
        int maxLength = 1;

        for(int pos = 0; pos < nums.length - 1; pos++) {
            if(nums[pos + 1] > nums[pos]) {
                incLength++;
                decLength = 1;
            } else if(nums[pos + 1] < nums[pos]) {
                decLength++;
                incLength = 1;
            } else {
                incLength = 1;
                decLength = 1;
            }
            maxLength = Math.max(maxLength, Math.max(incLength, decLength));
        }
        return maxLength;
    }
     */
}
