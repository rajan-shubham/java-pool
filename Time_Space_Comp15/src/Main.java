public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int ans = fibo(15);
        System.out.println(ans);
    }

    static int fibo(int n){
        // base condition
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}