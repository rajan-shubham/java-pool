import java.util.*;
import java.lang.*;

//https://www.codechef.com/problems/MAKETRIANGLE?tab=statement
class MakeTriangle {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int newx = x+y;
            int newy = y+z;
            int newz = x+z;
            if(newx > z && newy > x && newz > y){
                System.out.println(0);
            }else{
                int max = Math.max(Math.max(x, y), z);
                int min = Math.min(Math.min(newx, newy), newz);
                System.out.println(max - min + 1);
            }
        }
    }
}

