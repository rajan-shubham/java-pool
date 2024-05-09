public class Lcm {
    public static void main(String[] args) {
        System.out.println(lcm(2,7));
    }
//    LCM (a, b):- Minimum (+ve) number that is divisible by both a and b.
//    a * b = hcf(a,b) * lcm(a,b)
    static int lcm(int a, int b){
        return (a * b)/gcd(a,b);
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
