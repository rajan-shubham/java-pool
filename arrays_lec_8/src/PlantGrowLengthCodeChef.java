import java.util.*;
import java.lang.*;

public class PlantGrowLengthCodeChef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = in.nextInt();
            }
            int ans = 0;
            int min = 101;
            for(int i = 0; i<n-1; i++){
                min = Math.min(arr[i], arr[i+1]);
                if(min > ans){
                    ans = min;
                }
            }
            System.out.println(ans);
        }
    }
}
