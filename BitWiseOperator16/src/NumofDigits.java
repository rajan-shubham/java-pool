public class NumofDigits {
    public static void main(String[] args) {
        int n = 3456;
        int base = 16;

        // time comp. --> log(n);
        int ans = (int)(Math.log(n) / Math.log(base)) + 1;

        System.out.println(ans);
    }
}
