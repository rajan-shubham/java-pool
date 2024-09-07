import java.util.*;
import java.lang.*;
import java.io.*;
public class DiffDenominationBreak {
    public static void main (String[] args) throws java.lang.Exception {
        //https://www.codechef.com/problems/FLOW005
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            int count = 0;

            // Array of denominations
            int[] denominations = {100, 50, 10, 5, 2, 1};

            // Loop through each denomination
            for(int denom : denominations) {
                count += n / denom;  // Add the number of notes/coins
                n = n % denom;       // Update `n` to the remaining amount
            }

            System.out.println(count);  // Output the result for each test case

            // while(n != 0){
            //     if(n >= 100){
            //         count = count + n/100;
            //         n = n%100;
            //     }else if(n >= 50){
            //         count = count + n/50;
            //         n = n%50;
            //     }else if(n >= 10){
            //         count = count + n/10;
            //         n = n%10;
            //     }else if(n >= 5){
            //         count = count + n/5;
            //         n = n%5;
            //     }else if(n >= 2){
            //         count = count + n/2;
            //         n = n%2;
            //     }else{
            //         count = count + n;
            //     }
            // }
            // System.out.println(count);
        }
    }
    /*
    input
    3
    1200
    500
    242

    output
    12 5 7
     */
}
