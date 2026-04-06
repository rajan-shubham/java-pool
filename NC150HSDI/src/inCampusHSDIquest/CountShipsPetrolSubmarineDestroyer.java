package inCampusHSDIquest;

import java.util.Arrays;

public class CountShipsPetrolSubmarineDestroyer {
    /*
    Battleships is a game played on a rectangular board. The board is given as an array of strings of size N (height) ×M (width) with information about the locations of the ships.

    The board is given as an array B whose every element is a string, and corresponds to one row of the game board. Each character of each string represents a cell of the board and is either:

    '#' character, marking a part of a ship, or

    '.' character, representing an empty cell.

    Two cells that share a side and have a value of '#' are part of the same ship. Cells (X,Y) share a side with cells (X,Y+1), (X,Y−1), (X+1,Y), and (X−1,Y).

    In the Battleships game there are three types of ships:

    Patrol Boats of size 1: A single '#' cell.

    Submarines of size 2, which come in two shapes:     * A horizontal shape: two adjacent '#' cells in the same row.

    A vertical shape: two adjacent '#' cells in the same column.

    Destroyers of size 3, which come in six shapes:     * Three adjacent '#' cells in the same row (horizontal).

    Three adjacent '#' cells in the same column (vertical).

    Four L-shaped and rotated three-cell configurations.

    Your task is to find the number of ships of each type occurring on the board.

    For example, on the board represented by B=["#.##","#.#.","#.##"]: there are two patrol boats (marked on the image below as 'P'), one submarine ('S') and two destroyers ('D').
    | # | . | # | # |
    | :---: | :---: | :---: | :---: |
    | # | . | # | . |
    | # | . | # | # |

    Write a function:

    class Solution { public int[] solution(String[] B); }
    that, given an array B consisting of N strings of length M each, returns an array R of three integers, such that:

    R[0] represents the number of Patrol Boats,

    R[1] represents the number of Submarines,

    R[2] represents the number of Destroyers.

    Examples
    Given B=["#.##","#.#.","#.##"], the function should return [2, 1, 2] as explained above.

    Given B=["#.#","##.",".##"], the function should return [1, 1, 1]. 3.  Given B=["###","#.#","###"], the function should return [0, 0, 2]. 4.  Given B=[".##","##.",".##"], the function should return [0, 0, 0] (This example seems to show an empty board or a mistake in the image crop, but the result suggests no valid ships are found). The image shows an example B where the output is [0,0,0], but the input board is completely blue/empty in the picture. Assuming the board is B=["...","...","..."] for a return of [0,0,0].
     */
    public int[] solution(String[] B) {
        int N = B.length;
        int M = B[0].length();
        boolean[][] visited = new boolean[N][M];
        int[] result = new int[3]; // [P, S, D]

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // If we find a ship part that hasn't been counted yet
                if (B[i].charAt(j) == '#' && !visited[i][j]) {
                    int shipSize = countShipCells(B, visited, i, j, N, M);

                    // Categorize based on size (1, 2, or 3)
                    if (shipSize >= 1 && shipSize <= 3) {
                        result[shipSize - 1]++;
                    }
                }
            }
        }
        return result;
    }

    private int countShipCells(String[] B, boolean[][] visited, int r, int c, int N, int M) {
        // Boundary checks and visited check
        if (r < 0 || r >= N || c < 0 || c >= M || B[r].charAt(c) == '.' || visited[r][c]) {
            return 0;
        }

        visited[r][c] = true;
        int size = 1;

        // Explore all 4 adjacent sides (Up, Down, Left, Right)
        size += countShipCells(B, visited, r + 1, c, N, M);
        size += countShipCells(B, visited, r - 1, c, N, M);
        size += countShipCells(B, visited, r, c + 1, N, M);
        size += countShipCells(B, visited, r, c - 1, N, M);

        return size;
    }

    public static void main(String[] args) {
        CountShipsPetrolSubmarineDestroyer sol = new CountShipsPetrolSubmarineDestroyer();

        // Example 1
        String[] B1 = {"#.##", "#.#.", "#.##"};
        System.out.println(Arrays.toString(sol.solution(B1))); // Expected: [2, 1, 2]

        // Example 2
        String[] B2 = {"#.#", "##.", ".##"};
        System.out.println(Arrays.toString(sol.solution(B2))); // Expected: [1, 1, 1]
    }
}
