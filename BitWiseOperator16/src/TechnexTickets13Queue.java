import java.util.*;
import java.lang.*;
import java.io.*;
// https://www.codechef.com/problems/P2_175

class TechnexTickets13Queue
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            if(n == 1) System.out.println(1);
            else System.out.println(n%2 == 0 ? (n/2)+1 : (n/2));
        }
	}
}
