// Chef has finally decided to complete all of his pending assignments.

// There are X assignments where each assignment takes Y minutes to complete.
// Find whether Chef would be able to complete all the assignments in Z days.

// For each test case, output on a new line, YES, if Chef would be able to complete all the assignments in Z days. Otherwise, print NO.

import java.util.*;
import java.lang.*;
import java.io.*;

class PendingAssignment
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i<t; i++){
		    int x = in.nextInt();
		    int y = in.nextInt();
		    int z = in.nextInt();
		    if((x * y) <= z * 24 * 60){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
