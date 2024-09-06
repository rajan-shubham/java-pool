import java.util.Scanner;

public class CircularTrackLength {
    public static void main (String[] args) throws java.lang.Exception {
        // https://www.codechef.com/problems/LOOP
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int m = in.nextInt();
            int steps = Math.abs(b - a);
            if(steps <= (m - steps)){
                System.out.println(steps);
            }else{
                System.out.println(m - steps);
            }
        }
    }

    /*
    input
    4
    1 3 100
    1 98 100
    40 30 50
    2 1 2

    output
    2
    3
    10
    1
     */
}
