import java.util.*;

public class CountPairforTarget {

//    https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-less-than-target/1
    public static int countPairsTarget(int arr[], int target) {
        int size = arr.length;
        int count = 0;
        Arrays.sort(arr); // Sort the array

        int left = 0, right = size - 1;
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                // All pairs from `left` to `right` will satisfy the condition
                count += (right - left);
                left++;
            } else {
                right--; // Decrease `right` if the sum is greater or equal to the target
            }
        }
        return count;
    }

//    https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1
    public static List<Integer> sumClosest(int[] arr, int target) {
        // code here
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        if(n==1){
            return list;
        }
        int mindif = Integer.MAX_VALUE;
        int a = 0, b= 0;

        int i =0, j=n-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            int diff = Math.abs(target-sum);
            if(mindif > diff){
                mindif = diff;
                a= arr[i];
                b= arr[j];
            }
            if(sum <= target){
                i++;
            }else{
                j--;
            }
        }
        list.add(a);
        list.add(b);
        return list;
    }

//    https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1
    public static int countPairs(int arr[], int target) {
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

//    https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int cnt=0;
        for(int i=2;i<n;i++){
            int j=0;
            int k=i-1;
            while(j < k){
                int sum=arr[j]+arr[k];
                if(sum > arr[i]){
                    cnt+=k-j;
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return cnt;
    }

//    https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
static ArrayList<Integer> subarraySum(int[] arr, int target) {
    // code here
    int n = arr.length;
    int i = 0;
    int j = 0;
    int sum = 0;
    ArrayList<Integer> ans = new ArrayList<>();
    while(i<n){
        if(sum == target){
            ans.add(i+1);
            ans.add(j);
            return ans;
        }
        else if(sum < target && j<n){
            sum += arr[j];
            j++;
        }
        else{
            sum -= arr[i];
            i++;
        }
    }
    ans.add(-1);
    return ans;
}
}
