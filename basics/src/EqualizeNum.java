import java.util.*;
import java.lang.*;
import java.io.*;

class EqualizeNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int d = Math.abs(b - a);
            System.out.println(d%2 == 0 ? "Yes" : "No");
        }
	}
}

