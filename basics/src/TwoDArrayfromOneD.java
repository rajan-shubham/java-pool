import java.util.Arrays;

public class TwoDArrayfromOneD {
    // https://leetcode.com/problems/convert-1d-array-into-2d-array/?envType=daily-question&envId=2024-09-01
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = construct2DArray(original, m, n);
        System.out.println(Arrays.toString(result));
    }

        public static int[][] construct2DArray(int[] original, int m, int n) {
            int[][] result = new int[m][n];
            if(m*n != original.length) return new int[0][0];

            int index = 0;
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    result[i][j] = original[index++];
                }
            }

            return result;
        }
    }

// for 2 ms runtime
// class Solution {
//     public int[][] construct2DArray(int[] original, int m, int n) {
//         if(m*n != original.length){
//             return new int[0][0];
//         }
//         int[][] arr = new int[m][];

//         for(int i=0; i<m; i++){
//            arr[i] = Arrays.copyOfRange(original, i*n, i*n+n);
//         }
//         return arr;
//     }
// }
