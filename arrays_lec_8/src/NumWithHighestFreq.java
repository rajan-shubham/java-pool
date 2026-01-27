import java.util.*;
import java.lang.*;


class NumWithHighestFreq {
//    https://www.codechef.com/problems/CANDYTYPE?tab=statement
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] freq = new int[n+1];
            for(int i = 0; i<n; i++){
                arr[i] = in.nextInt();
                freq[arr[i]]++;
            }
            int max = 0;
            int index = 0;
            for(int i = 1; i<n+1; i++){
                if(max < freq[i]){
                    max = freq[i];
                    index = i;
                }
            }
            System.out.println(index);
        }
    }
}
