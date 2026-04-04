package inCampusHSDIquest;

public class Maximize3DigitInt {
    public int solution(int N, int K) {
        // Extract digits: 512 -> [5, 1, 2]
        int h = N / 100;         // Hundreds
        int t = (N / 10) % 10;   // Tens
        int u = N % 10;          // Units

        int[] digits = {h, t, u};

        for (int i = 0; i < 3; i++) {
            int needed = 9 - digits[i];

            // Determine how much we can actually add
            int add = Math.min(needed, K);
            digits[i] += add;
            K -= add;

            if (K <= 0) break;
        }

        // Reconstruct the number: (h * 100) + (t * 10) + u
        return (digits[0] * 100) + (digits[1] * 10) + digits[2];
    }

    public static void main(String[] args) {
        Maximize3DigitInt sol = new Maximize3DigitInt();

        // Test cases from your images
        System.out.println(sol.solution(512, 10)); // Output: 972
        System.out.println(sol.solution(191, 4));  // Output: 591
        System.out.println(sol.solution(285, 20)); // Output: 999
    }
}
