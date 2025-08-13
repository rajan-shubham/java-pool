import java.util.LinkedList;
import java.util.Queue;
//https://www.geeksforgeeks.org/problems/find-the-number-of-islands/1
class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
public class NoOfConnectedComponentsIslands {
    private void bfs(int ro, int co, int[][] vis, char[][] grid){
        vis[ro][co] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(ro, co));
        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            //traverse in the neighbours and mark them if its a land
            for(int delRow = -1; delRow<=1; delRow++){
                for (int delCol = -1; delCol <= 1; delCol++) {
                    int nRow = row + delRow;
                    int nCol = col + delCol;
                    if (nRow >= 0 && nRow<n && nCol >= 0 && nCol<m && grid[nRow][nCol] == 'L' && vis[nRow][nCol] == 0){
                        vis[nRow][nCol] = 1;
                        q.add(new Pair(nRow, nCol));
                    }
                }
            }
        }
    }

    //Function to find the number of islands.
    public int numIslands(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;
        for(int row = 0; row<n; row++){
            for(int col = 0; col<m; col++){
                if (vis[row][col] == 0 && grid[row][col] == 'L'){
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return count;
    }
}
