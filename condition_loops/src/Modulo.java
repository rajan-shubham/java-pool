import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        There are only 22 type of denominations in Chefland:
//
//        Coins worth 11 rupee each
//        Notes worth 10 rupees each

        System.out.print("Enter no. of Test cases : ");
        int T = in.nextInt();
        for (int i = 0; i<T ;i++ ) {
            System.out.print("Enter the required Money : ");
            int X = in.nextInt();
            System.out.println(" minimum number of coins Chef needs to pay exactly for  " + X + " is " + (X % 10));
        }
    }
}
