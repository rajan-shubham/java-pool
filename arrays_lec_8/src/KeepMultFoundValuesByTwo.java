public class KeepMultFoundValuesByTwo {
//    https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/?envType=daily-question&envId=2025-11-19
    public int findFinalValue(int[] nums, int k) {
        /*
        int bits = 0;
        for (int num : nums) {
            if (num % k != 0) continue;
            int n = num / k;
            if ((n & (n - 1)) == 0)
                bits |= n;
        }
        bits++;
        return k * (bits & -bits);
        */
        /*
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : nums) hs.add(i);

        while(hs.contains(k)) k = 2 * k;

        return k;
        */

        boolean x = true;
        while(x){
            x = found(nums, k);
            k = 2 * k;
        }
        return k/2;
    }

    private static boolean found(int[] nums, int k){
        for(int num : nums){
            if(num == k) return true;
        }
        return false;
    }
}