package arrays;

public class IsAnagram {
//    https://leetcode.com/problems/valid-anagram/
    public boolean isAnagram(String s, String t) {
        int[] alphaS = new int[26];
        int[] alphaT = new int[26];

        if(s.length() != t.length()) return false;

        for(int i = 0; i<s.length(); i++){
            int sIndex = s.charAt(i) - 'a';
            int tIndex = t.charAt(i) - 'a';

            alphaS[sIndex]++;
            alphaT[tIndex]++;
        }

        for(int i = 0; i<26; i++){
            if(alphaS[i] != alphaT[i]) return false;
        }
        return true;
    }
    /*
    class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(char c:t.toCharArray()){
            count[c-'a']--;
        }
        for(int i = 0;i<26;i++){
            if(count[i] !=0)
            return false;
        }
        return true;
        }
    }
     */
}
