import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.codechef.com/problems/CONN?tab=statement

class Nfrom2and7{
	public static void main (String[] args) throws java.lang.Exception{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int n = in.nextInt();
            if(n < 2){
                System.out.println("NO");
            }else if(n < 7 && n%2 != 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
	}
}
