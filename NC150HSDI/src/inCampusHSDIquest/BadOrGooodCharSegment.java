package inCampusHSDIquest;

public class BadOrGooodCharSegment {
    /*
    You are given a string S, made of lowercase english letters.
    A letter is called good if all its occurrences form a contiguous segment.
    In this example, all occurrences of the letter "a" form a contiguous segment at the end of the string.
    Similarly, all occurrences of letter "c" form a contiguous segment in the middle of the string.
    Therefore letter "a" is good and letter "c" is also good. On the other hand, occurrences of letter "b" form two contiguous segments.
    Therefore letter "b" is not good. Write a function solution that given a string S returns a string made of all good letters from string S in alphabetical order .
    So given the string from the example the function should return "ac" because a,c are only good letters from the string S S="bbbccbbbaa"
     */
    public String solution(String S) {
        // Track which characters are currently "bad"
        boolean[] isBad = new boolean[26];
        // Track which characters we have already seen at least once
        boolean[] seen = new boolean[26];

        int n = S.length();
        for (int i = 0; i < n; i++) {
            char currentChar = S.charAt(i);
            int index = currentChar - 'a';

            // If we see a character again that we already "finished" previously
            if (seen[index]) {
                // Check if it's the same as the previous character (still in same segment)
                if (S.charAt(i - 1) != currentChar) {
                    isBad[index] = true;
                }
            }

            seen[index] = true;
        }

        // Build the result string with characters that are seen but NOT bad
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (seen[i] && !isBad[i]) {
                result.append((char) ('a' + i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        BadOrGooodCharSegment sol = new BadOrGooodCharSegment();

        // Example from prompt
        System.out.println(sol.solution("bbbccbbbaa")); // Output: "ac"

        // Additional tests
        System.out.println(sol.solution("aaabbbccc"));  // Output: "abc"
        System.out.println(sol.solution("aba"));        // Output: "" (a is interrupted by b)
    }
}
