import java.util.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Collections;
//https://www.codechef.com/problems/RESELL?tab=statement
public class MaxProfitFromResaleInArrItems {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            int k = in.nextInt();
            Integer[] arr = new Integer[n];
            for(int i = 0; i<n; i++){
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());

            int profit = 0;
            int currSum = 0;
            for(int i = 0; i<k; i++){
                if(arr[i] > 5){
                    currSum += arr[i] -5;
                }
            }
            profit = Math.max(profit, currSum);
            for(int i = k; i<n; i++){
                if(arr[i] > 10){
                    currSum += arr[i] -10;
                }
            }
            profit = Math.max(profit, currSum);

            System.out.println(profit);
        }
    }
}
