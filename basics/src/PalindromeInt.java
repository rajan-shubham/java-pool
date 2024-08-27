import java.util.*;
import java.lang.*;
import java.io.*;

public class PalindromeInt {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Entere no. of test cases : ");
        int t = in.nextInt();
        while(t --> 0){
            System.out.println("Enter the no : ");
            int n = in.nextInt();
            int check = n;
            int rev = 0;
            while(check > 0){
                rev = (10 * rev) + check%10;
                check /= 10;
            }
            System.out.println(n == rev ? "wins" : "loses");
        }
    }

    // https://www.codechef.com/problems/PALL01?tab=submissions
}
