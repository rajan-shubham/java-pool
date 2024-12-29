import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.codechef.com/problems/DISCOOKIE

class DistributeCookies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            int m = in.nextInt();
            if(n < m && m%n == 0){
                System.out.println(0);
            }else if(n>=m){
                System.out.println(n-m);
            }else if(n < m && m%n != 0){
                int x = m/n + 1;
                System.out.println(Math.min(m%n,(n*x) - m));
            }
        }
	}
}
