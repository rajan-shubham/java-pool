import java.util.*;
import java.lang.*;

//https://www.codechef.com/problems/STREAK?tab=statement
class Codechef {
    public static void FindMaxStreak (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            int maxStreak = 0;
            int count = 0;
            for(int i = 0; i<n; i++){
                arr[i] = in.nextInt();
                if(arr[i] > 0){
                    count++;
                }else{
                    maxStreak = Math.max(maxStreak, count);
                    count = 0;
                }
            }
            System.out.println(Math.max(maxStreak, count));
        }
    }
}
