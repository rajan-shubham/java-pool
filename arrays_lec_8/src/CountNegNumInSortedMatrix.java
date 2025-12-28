public class CountNegNumInSortedMatrix {
//    https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/?envType=daily-question&envId=2025-12-28
    // TC: O(N+M) and last is O(N*M)
    public int countNegatives(int[][] grid){
            int rows = grid.length;
            int cols = grid[0].length;
            int count = 0;

            for(int i = 0; i<rows; i++){
                int left = 0, right = cols-1;
                int firstNeg = cols;

                while(left <= right){
                    int mid = left + (right - left)/2;

                    if(grid[i][mid] < 0){
                        firstNeg = mid;
                        right = mid -1; // move left
                    }else{
                        left = left +1; // move right
                    }
                }

                count += cols - firstNeg;
            }

            return count;
        }
    }

/*
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] < 0) count++;
            }
        }
        return count;
    }
}
*/