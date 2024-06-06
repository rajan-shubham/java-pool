package recurrence;

public class TwosPowerSeq {
    public static void main(String[] args) {
        int n = 3;
//        int twosToPowN = seqOfTwosPow(n);
//        System.out.println(twosToPowN);

//        System.out.println(tailRtwoPow(3, 1 ));

        System.out.println(tailRtwoPow(5, 1));
    }

    // Sn = 2Sn-1 , n >= 2 is recurrence relation with initial condition S1 = 2
    static int seqOfTwosPow(int n){
        if(n == 1){
            System.out.println(2);
            return 2;
        }
        int prodTwo = 2 * seqOfTwosPow(n-1);
        System.out.println(prodTwo);
        return prodTwo;
    }

    static int tailRtwoPow(int n, int acc){
        if(n == 1){
            return acc * 2;
        }
        return tailRtwoPow(n - 1, (2 * acc));
    }

    static int tailRtwoPow2(int n, int acc){
        System.out.println(acc);
        if(n == 1){
            return acc * 2;
        }
        return tailRtwoPow2(n - 1, (2 * acc));
    }

    /*
    static int tailRtwoPow2(int n, int acc) {
        // Print the current value of acc
        System.out.println(acc);

        // Base case: when n is 1, return the final result
        if (n == 1) {
            return acc * 2;
        }

        // Recursive case: call the function with n-1 and the updated acc
        return tailRtwoPow2(n - 1, acc * 2);
    }
    */
}
