import java.util.*;
import java.lang.*;
import java.io.*;

class DiwaliDiscountTernary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(b >= a ? 0 : a-b);
	}
}
