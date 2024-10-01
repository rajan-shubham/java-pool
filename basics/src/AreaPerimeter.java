import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.codechef.com/problems/AREAPERI
class AreaPerimeter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int b = in.nextInt();
        int area = l*b;
        int peri = 2*(l+b);
        if(area > peri){
            System.out.println("Area");
            System.out.println(area);
        }else if(area < peri){
            System.out.println("Peri");
            System.out.println(peri);
        }else{
            System.out.println("Eq");
            System.out.println(area);
        }
	}
}
