//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

public class RoofTopgfg {
//    https://www.geeksforgeeks.org/problems/roof-top-1587115621/1
    public static void main(String args[]) throws IOException {
//    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//    int t = Integer.parseInt(read.readLine());
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of Test cases: ");
        int t = in.nextInt();

    while (t-- > 0) {
//        String st[] = read.readLine().trim().split("\\s+");
//        int n = st.length;
//        int arr[] = new int[n];

//        for (int i = 0; i < n; i++) arr[(int)i] = Integer.parseInt(st[(int)i]);

        int arr[] = {1, 2, 2, 3, 2};
        System.out.println(new Solution().maxStep(arr));
    }
    }
}

class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int step = 0;
        int l = 0;
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i] < arr[i+1])
            {
                step++;
                l = Math.max(l,step);
                continue;
            }
            step = 0;

        }
        return l;
    }
}
