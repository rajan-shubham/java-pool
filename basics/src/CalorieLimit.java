import java.util.*;
import java.lang.*;
import java.io.*;
// https://www.codechef.com/problems/CALLIM
class CalorieLimit{
	public static void main (String[] args) throws java.lang.Exception{
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int sum = 0, count = 0;
            int[] arr = new int[n];
            for(int i = 0; i<n; i++) {
                arr[i] = in.nextInt();
                if((sum) < k){
                    sum = sum + arr[i];
                    count ++;
                }
            }
            System.out.println(sum <= k ? count : count-1);
        }
	}
}
