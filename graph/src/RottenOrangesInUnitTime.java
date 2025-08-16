import java.util.LinkedList;
import java.util.Queue;
//https://www.geeksforgeeks.org/problems/rotten-oranges2536/1
//https://leetcode.com/problems/rotting-oranges/
//https://www.youtube.com/watch?v=yf3oUhkvqA0&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=10
class TimeTuple {
    int row;
    int col;
    int time;
    TimeTuple(int row, int col, int time){
        this.row = row; this.col = col; this.time = time;
    }
}

public class RottenOrangesInUnitTime {
    public int orangesRotting(int[][] grid){
        // size of matrix
        int n = grid.length;
        int m = grid[0].length;
        // n * m
        Queue<TimeTuple> q = new LinkedList<>();
        // n*m
        int[][] vis = new int[n][m];
        int cntFresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2){
                    q.add(new TimeTuple(i, j, 0));
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }
                if (grid[i][j] == 1) cntFresh++;
            }
        }

        int tm = 0;
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, +1, 0, -1};
        int count = 0;
        while (!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            tm = Math.max(tm, t);
            q.remove();
            for(int i = 0; i<4; i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new TimeTuple(nrow, ncol, t+1));
                    vis[nrow][ncol] = 2;
                    count++;
                }
            }
        }
        if (count != cntFresh) return -1;
        return tm;
    }
}
