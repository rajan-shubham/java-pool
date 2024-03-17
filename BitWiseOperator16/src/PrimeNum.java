public class PrimeNum {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isPrime(n));
        for (int i = 2; i < n; i++) {
            System.out.println(i + " " + isitPrime(i)); // time comp. --> O(Sqrt(n)*n)
        }
    }

    static boolean isitPrime(int n) {
        if(n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
