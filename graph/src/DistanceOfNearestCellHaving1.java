import java.util.LinkedList;
import java.util.Queue;

class RowColDistNode{
    int first;
    int second;
    int third;
    RowColDistNode(int first, int second, int third){
        this.first = first; this.second = second; this.third = third;
    }
}

//https://www.geeksforgeeks.org/problems/distance-of-nearest-cell-having-1-1587115620/1
//https://www.youtube.com/watch?v=edXdVwkYHF8&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=13
//https://leetcode.com/problems/01-matrix/
public class DistanceOfNearestCellHaving1 {
    // Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int dist[][] = new int[n][m];
        Queue<RowColDistNode> q = new LinkedList<RowColDistNode>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1){ // for leetcode change 1 to 0
                    q.add(new RowColDistNode(i, j, 0));
                    vis[i][j] = 1;
                }else{
                    vis[i][j] = 0;
                }
            }
        }

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        // n * m * 4
        while (!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            int steps = q.peek().third;
            q.remove();
            dist[row][col] = steps;
            for (int i = 0; i < 4; i++) {
                int nRow = row + delRow[i];
                int nCol = col + delCol[i];

                if (nRow>=0 && nRow<n && nCol>=0 && nCol<m && vis[nRow][nCol]==0){
                    vis[nRow][nCol] = 1;
                    q.add(new RowColDistNode(nRow, nCol, steps+1));
                }
            }
        }
        return dist;
    }
}
