import java.util.*;
import java.lang.*;
import java.io.*;

public class SteelStrength {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int x = in.nextInt();
            double y = in.nextDouble();
            int z = in.nextInt();

            if(x > 50 && y < 0.7 && z > 5600){
                System.out.println(10);
            }else if(x > 50 && y < 0.7 && z <= 5600){
                System.out.println(9);
            }else if(x <= 50 && y < 0.7 && z > 5600){
                System.out.println(8);
            }else if(x > 50 && y >= 0.7 && z > 5600){
                System.out.println(7);
            }else if(x > 50 || y < 0.7 || z > 5600){
                System.out.println(6);
            }else {
                System.out.println(5);
            }
        }
    }
}
