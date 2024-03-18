public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;
        //System.out.println(sqrt(n));
        System.out.printf("%.3f" , BinSearchSqrt(n, precision));
    }

    // Time :- O(log(n));
    static double BinSearchSqrt(int n, int precision) {
        int start = 0;
        int end = n;

        double root = 0.0;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid * mid == n){
                return mid;
            }
            if (mid * mid > n){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }

    /*static int sqrt(int n) { // for perfect square
        int start = 2, end = n;
        int mid = 0;

        while (start <= end){
             mid = start + (end - start) / 2;
            if (mid * mid == n){
                return mid;
            }
            if (mid * mid > n) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return mid;
    }*/
}
