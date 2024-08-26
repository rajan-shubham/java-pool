import java.util.*;
import java.lang.*;
import java.io.*;

class LadderLengthCC
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            double base = in.nextInt();
            double ls = in.nextInt();
            double min = Math.sqrt(Math.abs(base*base - ls*ls));
            double max = Math.sqrt(base*base + ls*ls);
            System.out.println(min + " " + max);
        }
    }
}

// https://www.codechef.com/problems/SNAPE?tab=submissions