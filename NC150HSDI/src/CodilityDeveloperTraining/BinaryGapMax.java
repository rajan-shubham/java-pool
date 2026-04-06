package CodilityDeveloperTraining;

public class BinaryGapMax {
//    https://app.codility.com/programmers/trainings/9/binary_gap/
    public int findMaxBinaryGap(int N) {
        int maxGap = 0;
        int currentGap = -1; // -1 means we haven't seen the first '1' yet

        while (N > 0) {
            if ((N & 1) == 1) { // bit is 1
                if (currentGap != -1) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                currentGap = 0; // start counting zeros
            } else { // bit is 0
                if (currentGap != -1) {
                    currentGap++;
                }
            }
            N >>= 1; // shift right
        }

        return maxGap;
    }
    /*
    public int findMaxBinaryGap(int N) {
        String binary = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for (char c : binary.toCharArray()) {
            if (c == '1') {
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                counting = true;
                currentGap = 0;
            } else if (counting) {
                currentGap++;
            }
        }

        return maxGap;
    }
     */
}
