import java.util.*;
//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/?envType=daily-question&envId=2026-01-02
public class ReturnRepeatedElementIn2Darr {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums)
        {
            if(!s.add(i))
                return i;
        }
        return nums[nums.length-1];

        /*
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return 1;
        */

        /*
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] == nums[i]) return nums[i];
        }
        return 1;
        */
    }
}
