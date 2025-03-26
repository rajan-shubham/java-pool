package avRecursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
         int s = 1; // source poll 1
         int h = 2; // helper poll 2
         int d = 3; // destination poll 3

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // No. of Plate

        toh(s, d, h, n);
    }

    public static void toh(int s, int d, int h, int n){
        if (n == 1){
            System.out.println("Moving Plate " + n + " from " + s + " to " + d);
            return;
        }

        toh(s, h, d, n-1);
        System.out.println("Moving plate " + n + " from " + s + " to " + d);
        toh(h, d, s, n-1);
    }
}
