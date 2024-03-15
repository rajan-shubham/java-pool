public class PowerofTwo {
    public static void main(String[] args) {
        int n = 1024; // note: fix for n = 0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
