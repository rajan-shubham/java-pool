package backTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // this is how we are replacing the r,c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if (emptyLeft == false) {
                break;
            }
        }

        if (emptyLeft == true) {
            return true;
            // soduko is solved
        }

        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


    static boolean isSafe(int[][] board, int row, int col, int num) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[row][i] == num) {
                return false;
            }
        }

        // check the col
        for (int[] nums : board) {
            // check if the number is in the col
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }




    /*
    leetcode Q. 37> https://leetcode.com/problems/sudoku-solver/submissions/

    (KUNAL KUSHWAHA)
    class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        // Find the first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) {
                break;
            }
        }

        // No empty cell found, puzzle solved
        if (emptyLeft) {
            return true;
        }

        // Try placing digits 1-9
        for (int number = 1; number <= 9; number++) {
            char numChar = (char)(number + '0');
            if (isSafe(board, row, col, numChar)) {
                board[row][col] = numChar;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char num) {
        // Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}


(BY LEETCODE TOPPER)
import java.util.ArrayList;
import java.util.List;
class Solution {
    private int[] line = new int[9];
    private int[] column = new int[9];
    private int[][] block = new int[3][3];
    private boolean valid = false;
    private List<int[]> spaces = new ArrayList<int[]>();

    public void solveSudoku(char[][] board) {
        // Preprocess the board to set initial state
        preprocess(board);

        // Iterate until the board is solved or no more modifications can be made
        while (!valid) {
            boolean modified = false;
            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 9; ++j) {
                    if (board[i][j] == '.') {
                        int mask = ~(line[i] | column[j] | block[i / 3][j / 3]) & 0x1ff;
                        if ((mask & (mask - 1)) == 0) {
                            // If only one possibility, fill the cell
                            int digit = Integer.bitCount(mask - 1);
                            flip(i, j, digit);
                            board[i][j] = (char) (digit + '0' + 1);
                            modified = true;
                        }
                    }
                }
            }
            // If no modifications made, break out of loop
            if (!modified) {
                break;
            }
        }

        // Populate list of empty cells for DFS
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    spaces.add(new int[]{i, j});
                }
            }
        }

        // Start depth-first search to find solution
        dfs(board, 0);
    }

    private void preprocess(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '0' - 1;
                    flip(i, j, digit);
                }
            }
        }
    }

    private void dfs(char[][] board, int pos) {
        if (pos == spaces.size()) {
            valid = true;
            return;
        }

        int[] space = spaces.get(pos);
        int i = space[0], j = space[1];
        int mask = ~(line[i] | column[j] | block[i / 3][j / 3]) & 0x1ff;
        for (; mask != 0 && !valid; mask &= (mask - 1)) {
            int digitMask = mask & (-mask);
            int digit = Integer.bitCount(digitMask - 1);
            flip(i, j, digit);
            board[i][j] = (char) (digit + '0' + 1);
            dfs(board, pos + 1);
            flip(i, j, digit);
        }
    }

    private void flip(int i, int j, int digit) {
        line[i] ^= (1 << digit);
        column[j] ^= (1 << digit);
        block[i / 3][j / 3] ^= (1 << digit);
    }
}
     */
}