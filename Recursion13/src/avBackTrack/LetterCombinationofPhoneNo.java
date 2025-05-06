package avBackTrack;

import java.util.*;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/1627076457/
public class LetterCombinationofPhoneNo {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    /*
    | Aspect              | Complexity / Insight        |
    | ------------------- | --------------------------- |
    | Time Complexity     | `O(4^n * n)`                |
    | Space Complexity    | `O(n * 4^n)`                |
    | `StringBuilder` Use | ✅ Optimized string mutation |
     */
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        List<String> ans = new ArrayList<>();

        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");
        helper(0, digits, mapping, new StringBuilder(), ans);
        return ans;
    }
    private static void helper(int index, String digits, Map<Character, String> mapping, StringBuilder currentStr, List<String> ans){
        if (index == digits.length()){
            ans.add(currentStr.toString());
            return;
        }

        char ch = digits.charAt(index);
        char[] alphabets = mapping.get(ch).toCharArray();
        for(char letter : alphabets){
            currentStr.append(letter);
            helper(index+1, digits, mapping, currentStr, ans);
            currentStr.deleteCharAt(currentStr.length()-1); // backtracking step, just to add tht current char at this current place
        }
    }
}
