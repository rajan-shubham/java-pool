import java.util.Arrays;

class IndexiToTarget {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        arr = createTargetArray(nums,index);
        System.out.println(Arrays.toString(arr));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            // if(target[i] >= 0){
            //     target[i+1] = target[i];
            // }
            target[index[i]] = nums[i];
        }
        return target;
    }
}

/* The true solution is this
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        int[] targetArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            targetArray[i] = targetList.get(i);
        }

        return targetArray;
    }
}
 */
