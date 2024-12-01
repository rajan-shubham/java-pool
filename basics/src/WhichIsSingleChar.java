public class WhichIsSingleChar {
//    https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        char ch[]=s.toCharArray();
        int count[]=new int[26];

        for(int i=0;i<ch.length;i++)
            count[ch[i]-97]++;

        for(int i=0;i<ch.length;i++)
        {
            if(count[ch[i]-97]==1)
                return ch[i];
        }

        return '$';
    }


//    https://leetcode.com/problems/check-if-n-and-its-double-exist/description/?envType=daily-question&envId=2024-12-01
//    Check If N and Its Double Exist
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // Fixed initialization and condition for outer loop
            float t = (float) arr[i] / 2;
            int x = Search(arr, t);
            if (x != i && x != -1) {
                return true;
            }
        }
        return false;
    }

    static int Search(int[] arr, float target) {
        for (int i = 0; i < arr.length; i++) { // Fixed initialization and condition for inner loop
            if ((float) arr[i] == target) { // Fixed comparison with float target
                return i;
            }
        }
        return -1;
    }
}
