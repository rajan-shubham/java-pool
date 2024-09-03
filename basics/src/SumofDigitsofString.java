public class SumofDigitsofString {
    // leetcode q no. --> 1945
    // https://leetcode.com/problems/sum-of-digits-of-string-after-convert/?envType=daily-question&envId=2024-09-03

    public static void main(String[] args) {
        String str = "leetcode";
        int k = 2;
        int strNoConvert = getLucky(str, k);
        System.out.println(strNoConvert);
    }

    public static int getLucky(String s, int k) {
        // Step 1: Convert the string to its corresponding numeric string
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int position = s.charAt(i) - 'a' + 1;
            // Add digits of the number directly to the sum
            sum += sumOfDigits(position);
        }

        // Step 2: Perform the summing of digits k-1 times
        while (k-- > 1) {
            sum = sumOfDigits(sum);
        }

        return sum;
    }

    // Helper function to calculate the sum of digits of a number
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
