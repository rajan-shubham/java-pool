public class Hcf {
    public static void main(String[] args) {
        System.out.println(gcd(105,224));
    }
    // Euclid's Algorithm
    // HCF of a and b => minimum (+ve) value of equation {ax + by} ,where x and y are integers
    // You can form any litre of water with GCD == 1
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
