package inCampusHSDIquest;

public class MaxCountOfWordFromAstring {
    public int solution(String S, String[] L) {
        // Step 1: Count letter frequencies in S
        int[] sCounts = countLetters(S);
        int maxCopiesAcrossAll = 0;

        // Step 2: For each word in L, find its max possible copies
        for (String word : L) {
            int[] wordCounts = countLetters(word);
            int currentWordMax = Integer.MAX_VALUE;

            for (int i = 0; i < 26; i++) {
                if (wordCounts[i] > 0) {
                    // How many times can S provide the letters needed for this word?
                    currentWordMax = Math.min(currentWordMax, sCounts[i] / wordCounts[i]);
                }
            }

            // Keep track of the highest count found among all words in L
            maxCopiesAcrossAll = Math.max(maxCopiesAcrossAll, currentWordMax);
        }

        return maxCopiesAcrossAll;
    }

    // Helper to count A-Z frequencies
    private int[] countLetters(String str) {
        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'A']++;
        }
        return counts;
    }
}
