// There is a group of 
// N friends who wish to enroll in a course together. The course has a maximum capacity of M students that can register for it. If there are 
// K other students who have already enrolled in the course, determine if it will still be possible for all the N friends to do so or not.

import java.util.*;
import java.lang.*;
import java.io.*;

class CourseRegistration
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i<t; i++){
		    int n = in.nextInt();
		    int m = in.nextInt();
		    int k = in.nextInt();
		    if((m - k) >= n){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
