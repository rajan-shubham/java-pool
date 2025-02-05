public class OneSwapStrEqualOrNot {
//    https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/description/?envType=daily-question&envId=2025-02-05
    // 0ms runtime O(n) by shubham
    public boolean areAlmostEqual(String s1, String s2) {
        int size = s1.length();
        int first = -1, second = size;

        if(s1.equals(s2)) return true;

        for(int i = 0; i<size; i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                first = i;
                break;
            }
        }
        for(int i = size - 1; i>=0; i--){
            if(s1.charAt(i)!=s2.charAt(i)){
                second = i;
                break;
            }
        }
        char[] s1Array = s1.toCharArray();
        char temp = s1Array[first];
        s1Array[first] = s1Array[second];
        s1Array[second] = temp;

        return new String(s1Array).equals(s2);
    }

    /*
    public boolean areAlmostEqual(String s1, String s2) {
        int size = s1.length();
        int first = -1, second = -1;

        if (s1.equals(s2)) return true;

        for (int i = 0; i < size; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // More than 2 mismatches
                }
            }
        }

        if (second == -1) return false; // Only 1 mismatch

        // Swap characters and check equality
        char[] s1Array = s1.toCharArray();
        char temp = s1Array[first];
        s1Array[first] = s1Array[second];
        s1Array[second] = temp;

        return new String(s1Array).equals(s2);
    }
     */
}
