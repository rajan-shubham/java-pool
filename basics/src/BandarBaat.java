// https://www.codechef.com/problems/CAKEHALF

import java.util.*;
import java.lang.*;
import java.io.*;

class BandarBaat
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int chor = 0;
                while(a != b){
                    if(a > b){
                        chor = chor + (int) Math.ceil(a/2.0);
                        a = (int) Math.floor(a/2.0);
                    }else{
                        chor = chor + (int) Math.ceil(b/2.0);
                        b = (int) Math.floor(b/2.0);
                    }
                }
                System.out.println(chor);
        }
	}
}
