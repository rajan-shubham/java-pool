package avBackTrack;
//https://leetcode.com/problems/palindrome-partitioning/
import java.util.ArrayList;

public class PalindromePartition {
    static ArrayList<ArrayList<String>> ans = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(partition("aaba"));
        System.out.println(partition("aab"));
    }

    // aditya verma TC: O(N * 2^(n-1))
    static ArrayList<ArrayList<String>> partition(String s){
        ans = new ArrayList<>(); // Reset ans for each call
        ArrayList<String> temp = new ArrayList<>();
        helper(s, temp, 0);
        return ans;
    }
    private static void helper(String s, ArrayList<String> temp, int index){
        if(index == s.length()){
            ans.add(new ArrayList<>(temp)); // deep copy
            return;
        }
        String palinStr = "";
        for (int i = index; i < s.length(); i++) {
            palinStr = palinStr + s.charAt(i);
            if(isPalindrome(palinStr)){
                temp.add(palinStr);
                helper(s, temp, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    private static boolean isPalindrome(String str){
        int st=0, end=str.length()-1;
        while (st<end){
            if (str.charAt(st)!=str.charAt(end))return false;
            st++;
            end--;
        }
        return true;
    }
}

/* somehow optimize 15ms runtime
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backTrack(result, new ArrayList<String>(), s, 0);
        return result;
    }

    private void backTrack(List<List<String>> result, List<String> curr, String s, int start) {
        if(start == s.length()) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int end=start;end<s.length();end++) {
            if(isPalindrome(s, start, end)) {
                curr.add(s.substring(start, end + 1));
                backTrack(result, curr, s, end + 1);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
 */

/* optimize 0ms runtime
import java.util.AbstractList;

class Solution {
    private StringBuilder givenStr;
    private int givenStrLength;
    private List<List<String>> result;
    private List<String> subsResult;

    public List<List<String>> partition(String s) {

        givenStr = new StringBuilder(s);
        givenStrLength = s.length();
        subsResult = new ArrayList<String>();

        return new AbstractList<List<String>>() {
            @Override
            public int size() {
                init();
                return result.size();
            }

            @Override
            public List<String> get(int index) {
                init();
                return result.get(index);
            }

            private void init() {
                if (result != null)
                    return;
                result = new ArrayList<List<String>>();
                dfs(0);
            }
        };

    }

    private void dfs(int startIndex) {
        if (startIndex == givenStrLength) {
            result.add(new ArrayList<String>(subsResult));
            return;
        }

        for (int i = startIndex; i < givenStrLength; i++) {
            if (!isPalindrome(givenStr, startIndex, i))
                continue;
            subsResult.add(givenStr.substring(startIndex, i + 1));
            dfs(i + 1);
            subsResult.remove(subsResult.size() - 1);
        }

    }

    private boolean isPalindrome(StringBuilder s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

}
 */
