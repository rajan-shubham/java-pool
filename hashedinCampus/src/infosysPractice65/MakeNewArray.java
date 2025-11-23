package infosysPractice65;

import java.util.Scanner;

public class MakeNewArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 1; i<= n/2; i++){
            arr[i*2] = arr[i];
            if ((i*2)+1 <= n){
                arr[(i*2) + 1] = arr[i] + arr[i+1];
            }
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            max = Math.max(max, arr[i]);
        }
        System.out.println("\nmax ans from arr is: " + max);
    }
}
