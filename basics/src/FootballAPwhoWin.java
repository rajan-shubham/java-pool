import java.util.*;
import java.lang.*;
import java.io.*;
public class FootballAPwhoWin {
        public static void main (String[] args) throws java.lang.Exception {
            // your code goes here
//            https://www.codechef.com/problems/BID
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while(t --> 0){
                int n = in.nextInt();
                int attA = 0; int[] atta = new int[n];
                for(int i = 0; i<n; i++){
                    atta[i] = in.nextInt();
                    attA += atta[i];
                }

                int defA = 0; int[] defa = new int[n];
                for(int i = 0; i<n; i++){
                    defa[i] = in.nextInt();
                    defA += defa[i];
                }

                int attP = 0; int[] attp = new int[n];
                for(int i = 0; i<n; i++){
                    attp[i] = in.nextInt();
                    attP += attp[i];
                }

                int defP = 0; int[] defp = new int[n];
                for(int i = 0; i<n; i++){
                    defp[i] = in.nextInt();
                    defP += defp[i];
                }

                if(attA > attP && defA > defP){
                    System.out.println("A");
                }else if(attA < attP && defA < defP){
                    System.out.println("P");
                }else{
                    System.out.println("DRAW");
                }
            }
        }
        /*
        input:
3
3
17 9 10
2 1 6
8 16 7
6 2 0
2
100 1
10 0
0 0
5 5
1
1
2
3
4
         */
    }

