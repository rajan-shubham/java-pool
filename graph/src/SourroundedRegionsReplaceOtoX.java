public class SourroundedRegionsReplaceOtoX {
//    https://www.geeksforgeeks.org/problems/replace-os-with-xs0052/1
//    https://www.youtube.com/watch?v=BtdgAys4yMk&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=14
//    https://leetcode.com/problems/surrounded-regions/submissions/1740490511/
    static void dfs(int row, int col, int vis[][], char[][] mat, int[] delRow, int delCol[]){
        vis[row][col] = 1;
        int n = mat.length;
        int m = mat[0].length;

        // check for top, right, bottom, left
        for (int i = 0; i < 4; i++) {
            int nRow = row + delRow[i];
            int nCol = col + delCol[i];
            if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && vis[nRow][nCol]==0 && mat[nRow][nCol]=='O'){
                dfs(nRow, nCol, vis, mat, delRow, delCol);
            }
        }
    }

    // time comp O(N*M)
    static char[][] fill(int n, int m, char[][] mat){
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        int[][] vis = new int[n][m];
        // traverse first row and last row
        for(int j = 0; j<m; j++){
            //first row
            if(vis[0][j]==0 && mat[0][j]=='O'){
                dfs(0, j, vis, mat, delRow, delCol);
            }
            //last row
            if(vis[n-1][j]==0 && mat[n-1][j]=='O'){
                dfs(n-1,j, vis, mat, delRow, delCol);
            }
        }
        for (int i = 0; i < n; i++) {
            //first column
            if(vis[i][0]==0 && mat[i][0]=='O'){
                dfs(i, 0, vis, mat, delRow, delCol);
            }
            //last column
            if(vis[i][m-1]==0 && mat[i][m-1]=='O'){
                dfs(i, m-1, vis, mat, delRow, delCol);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j]==0 && mat[i][j]=='O') mat[i][j]='X';
            }
        }
        return mat;
    }
}
