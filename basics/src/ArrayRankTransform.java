// class Solution {
//     public int[] arrayRankTransform(int[] arr) {
//         int size = arr.length;
//         int[] result = new int[size];

//         for(int i = 0; i<size; i++){
//             for(int j = 0; j<size; j++){
//                 if(arr[i]>arr[j]){
//                     result[i]++;
//                 }else {
//                     if(result[i] <= 1) {
//                         result[i] = 1;
//                     }
//                 }
//             }
//         }
//         return result;
//     }
// }

import java.util.Arrays;
import java.util.HashMap;

class ArrayRankTransform {
    public int[] arrayRankTransform(int[] arr) {
        // Step 1: Create a sorted version of the array without duplicates
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        
        // Step 2: Create a mapping from number to rank
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        
        for (int num : sorted) {
            // Only assign rank if the number is not already in the map
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        
        // Step 3: Build the result array using the rank map
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
    }
}
