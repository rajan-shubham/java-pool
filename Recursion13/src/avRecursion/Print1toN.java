public class Print1toN {
    public static void main(String[] args) {
        print1ton(8); // for printing 1 to 8
        System.out.println(factorial(10));
    }

    // print integer from 1 t n and n to 1
    public static void print1ton(int n){
        // if(n == 1) {System.out.println(n+1000 + " "); return;}// base case
        if (n == 0) return; // base case

        System.out.print(n + " "); // induction (for n to 1)

        print1ton(n-1); // hypothesis

        System.out.print(n + " "); // induction (for 1 to n)
    }

    // gives factorial of n
    public static int factorial(int n){ return n == 1 ? 1 : n * factorial(n-1); }
}