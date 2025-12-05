//https://leetcode.com/problems/count-partitions-with-even-sum-difference/description/?envType=daily-question&envId=2025-12-05

public class CountPartitionsWithEvenSumDiff {
    public static void main(String[] args) {
        int[] nums = {10, 10, 3, 7, 6};
        System.out.println(countPartitions(nums));
    }

    public static int countPartitions(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;

        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = total - leftSum;

            if ((leftSum % 2) == (rightSum % 2)) {
                count++;
            }
        }
        return count;
    }
}
