import java.util.*;
import java.lang.*;
import java.io.*;
// https://www.codechef.com/problems/HDIVISR
class HighestDivisor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int div = 10;
        while(n%div != 0){
            div--;
        }
        System.out.println(div);
	}
}
