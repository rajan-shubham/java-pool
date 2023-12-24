// Most programmers will tell you that one of the ways to improve your performance in competitive programming is to practice a lot of problems.
// Our Chef took the above advice very seriously and decided to set a target for himself.
// Chef decides to solve at least 
// 10 problems every week for 4 weeks.
// Given the number of problems he actually solved in each week over 4 weeks as p1, p2, p3, p4.
//  --->>> output the number of weeks in which Chef met his target.

import java.util.*;
import java.lang.*;
import java.io.*;
class Tenprobperweek
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
        int count = 0;
        int[] prob =  new int[4];
        for (int i=0; i<4;i++){
            prob[i] = in.nextInt();
            if(prob[i] >= 10){
                count++;
            }
        }
        System.out.println(count);
	}
}
