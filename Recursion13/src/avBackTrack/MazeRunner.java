package avBackTrack;

import java.util.*;
//https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
class MazeRunner {
    public static void main(String[] args) {
        int mat[][] = { {1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};
        System.out.println(ratInMaze(mat));
    }

    public static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for (int i = 0; i < maze.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < maze[i].length; j++) {
                row.add(maze[i][j]);
            }
            mat.add(row);
        }
        return findPath(mat);
    }

    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> result = new ArrayList<>();
        int n = mat.size();
        boolean[][] vis = new boolean[n][n];


        if (mat.get(0).get(0) == 0 || mat.get(n - 1).get(n - 1) == 0) return result;

        solve(mat, vis, 0, 0, result, "");
        return result;
    }

    private static void solve(ArrayList<ArrayList<Integer>> mat, boolean[][] vis, int row, int col, ArrayList<String> result, String move) {
        int n = mat.size();


        if (row == n - 1 && col == n - 1) {
            result.add(move);
            return;
        }


        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};

        vis[row][col] = true;

        for (int i = 0; i < 4; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];


            if (newRow >= 0 && newCol >= 0 && newRow < n && newCol < n
                    && mat.get(newRow).get(newCol) == 1 && !vis[newRow][newCol]) {
                solve(mat, vis, newRow, newCol, result, move + dir[i]);
            }
        }

        vis[row][col] = false;
    }
}
