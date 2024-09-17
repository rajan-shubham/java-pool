import java.util.*;
import java.lang.*;
import java.io.*;
// https://www.codechef.com/problems/EQUALISE
class MakeAnBequal{
	public static void main (String[] args) throws java.lang.Exception{
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a < b){
                while(a < b){
                    a = a*2;
                }
                if(a==b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else if(b < a){
                while(b < a){
                    b = b*2;
                }
                if(a==b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("YES");
            }
        }
	}
}
/* inputs
  4
5 20 --> yes
6 6 --> yes
12 2 --> no
50 20 --> no
  */
