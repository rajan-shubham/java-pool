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
        MazeRunner newRat = new MazeRunner();
        System.out.println(newRat.findPath(mat, mat.length));
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

    // by aditya verma java easy to understand TC : O(4^n^2) or (3^n^2)
    class Choice {
        char dname; // Direction name
        int dx, dy;

        Choice(char dname, int dx, int dy) {
            this.dname = dname;
            this.dx = dx;
            this.dy = dy;
        }
    }

    private boolean isSolved(int x, int y, int n) {
        return x == n - 1 && y == n - 1;
    }

    private boolean isValid(int x, int y, int n, int[][] arr) {
        return x >= 0 && x < n && y >= 0 && y < n && arr[x][y] == 1;
    }

    private void solve(int x, int y, int n, List<String> res, StringBuilder path, int[][] arr, List<Choice> choices) {
        if (isSolved(x, y, n)) {
            res.add(path.toString());
            return;
        }

        for (Choice choice : choices) {
            int newX = x + choice.dx;
            int newY = y + choice.dy;
            if (isValid(newX, newY, n, arr)) {
                // Mark the current cell as visited in arr
                arr[x][y] = 0;
                path.append(choice.dname);
                solve(newX, newY, n, res, path, arr, choices);
                // Restore the original value in arr
                arr[x][y] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }
    }

    public ArrayList<String> findPath(int[][] arr, int n) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder path = new StringBuilder();

        List<Choice> choices = Arrays.asList(
                new Choice('U', -1, 0),
                new Choice('D', 1, 0),
                new Choice('L', 0, -1),
                new Choice('R', 0, 1)
        );

        if (arr[0][0] == 1) {
            solve(0, 0, n, res, path, arr, choices);
        }

        return res;
    }

    /* by aditya verma c++
    struct Choice {
    char dname; // Direction name
    int dx, dy;
};

bool isSolved(int x, int y, int n) {
    return x == n - 1 && y == n - 1;
}

bool isValid(int x, int y, int n, const vector<vector<int>> &arr) {
    return x >= 0 && x < n && y >= 0 && y < n && arr[x][y] == 1;
}

void solve(int x, int y, const int n, vector<string> &res, string &path, vector<vector<int>> &arr, const vector<Choice> &choices) {
    if (isSolved(x, y, n)) {
        res.push_back(path);
        return;
    }

    for (const auto &choice : choices) {
        int newX = x + choice.dx;
        int newY = y + choice.dy;
        if (isValid(newX, newY, n, arr)) {
            // Mark the current cell as visited in arr
            arr[x][y] = 0;
            path.push_back(choice.dname);
            solve(newX, newY, n, res, path, arr, choices);
            // Restore the original value in arr
            arr[x][y] = 1;
            path.pop_back();
        }
    }
}

class Solution {
public:
    vector<string> findPath(vector<vector<int>> &arr, int n) {
        vector<string> res;
        string path = "";
        vector<Choice> choices = {{'U', -1, 0}, {'D', 1, 0}, {'L', 0, -1}, {'R', 0, 1}};

        if (arr[0][0] == 1) {
            solve(0, 0, n, res, path, arr, choices);
        }

        return res;
    }
};
     */
}
