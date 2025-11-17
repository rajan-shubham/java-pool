package infosysPractice65;

public class RemoveDigit {

    /**
     * Removes exactly one occurrence of 'digit' from 'number' to maximize the
     * resulting decimal value.
     *
     * @param number The number as a string (e.g., "1321").
     * @param digit  The character to remove (e.g., '1').
     * @return The resulting string with the maximized value.
     */
    public String removeDigit(String number, char digit) {

        // 1. Iterate through the string up to the second-to-last character
        for (int i = 0; i < number.length() - 1; i++) {

            // 2. Check if the current character is the digit
            if (number.charAt(i) == digit) {

                // 3. If the *next* character is larger, removing the current
                //    digit is the optimal move.
                if (number.charAt(i + 1) > digit) {
                    // Build the new string by skipping the character at index i
                    return number.substring(0, i) + number.substring(i + 1);
                }
            }
        }

        // 4. If the loop finishes, it means no optimal move was found (e.g.,
        //    "54321" or "5111"). In this case, removing the *last*
        //    occurrence of the digit is the best strategy.
        int lastIndex = number.lastIndexOf(digit);

        // Build the new string by skipping the character at lastIndex
        return number.substring(0, lastIndex) + number.substring(lastIndex + 1);
    }

    /**
     * Main method for testing the solution.
     */
    public static void main(String[] args) {
        RemoveDigit solver = new RemoveDigit();

        // Test case from the prompt
        String number1 = "1321";
        char digit1 = '1';
        System.out.println("Input: number = \"" + number1 + "\", digit = '" + digit1 + "'");
        System.out.println("Output: " + solver.removeDigit(number1, digit1)); // Expected: "321"

        System.out.println("---");

        // Another common test case
        String number2 = "1231";
        char digit2 = '1';
        System.out.println("Input: number = \"" + number2 + "\", digit = '" + digit2 + "'");
        System.out.println("Output: " + solver.removeDigit(number2, digit2)); // Expected: "231"

        System.out.println("---");

        // Test case where last occurrence must be removed
        String number3 = "511";
        char digit3 = '1';
        System.out.println("Input: number = \"" + number3 + "\", digit = '" + digit3 + "'");
        System.out.println("Output: " + solver.removeDigit(number3, digit3)); // Expected: "51"
    }
}
