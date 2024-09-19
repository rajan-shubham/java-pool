import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.codechef.com/problems/CHOLY?tab=statement
public class ChessOlympiad {
        public static void main (String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);

            double won = sc.nextDouble();
            double draw = sc.nextDouble();
            double loss = sc.nextDouble();

            double totalGames = won + draw + loss;
            double remaining = 4 - totalGames;
            double totalthis = won + (draw * 0.5);
            double totalOther = loss + (draw * 0.5);

            if(totalGames < 4) {
                if((remaining + totalthis) > totalOther) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                if(totalthis > totalOther) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
