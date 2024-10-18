import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.codechef.com/problems/LONGQUEUE?tab=statement

class LongQueue
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            int position = n;
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = in.nextInt();
            }
            int sushil = arr[n-1];
            for(int i = n-2; i>=0; i--){
                if(sushil >= arr[i]*2){
                    position--;
                }else{
		            break;
		        }
            }
            System.out.println(position);
        }
	}
}
