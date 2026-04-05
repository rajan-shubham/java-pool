package inCampusHSDIquest;

public class OneFlipBiggestNoWith69 {
    /*
    You are given a positive Integer consisting only of digits 6 and 9. Find the maximum value that can be achieved by turning at most one digit upside down (6 becomes 9 and 9 becomes 6).

    For example, given integer 696:

    Turning the first digit upside down (6 → 9) would result in the number 996.

    Turning the second digit upside down (9→ 6) would result in the number 666.

    Turning the third digit upside down (6 → 9)

    would result in the number 699.

    The maximum balue among 696, 996, 666 and 699 is 996.
     */
    public int solution(int num) {
        // Convert integer to String to access individual digits
        String s = Integer.toString(num);
        char[] digits = s.toCharArray();

        // Greedy approach: Find the FIRST '6' and flip it to '9'
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break; // We are only allowed to flip AT MOST one digit
            }
        }

        // Convert back to integer and return
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        OneFlipBiggestNoWith69 sol = new OneFlipBiggestNoWith69();

        // Example from your prompt
        System.out.println(sol.solution(696)); // Output: 996

        // Other test cases
        System.out.println(sol.solution(9669)); // Output: 9969
        System.out.println(sol.solution(9999)); // Output: 9999 (No 6 to flip)
    }
}
