package avBackTrack;

import java.util.*;
//https://leetcode.com/problems/word-break-ii/
public class WordBreak {
    public static void main(String[] args) {
        List<String> dict = new ArrayList<>();
        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");
        String s = "catsanddog";
        System.out.println(wordBreak(s, dict));
    }

    // by AdityaVerma youtube 1ms runtime
    public static List<String> wordBreak(String s, List<String> dict){
        List<String> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        Set<String> dict_set = new HashSet<>();
        for (int i = 0; i < dict.size(); i++) {
            dict_set.add(dict.get(i));
        }
        helper(s, 0, temp, dict_set, ans);
        return ans;
    }
    private static void helper(String s, int index, List<String> temp, Set<String> dict_set, List<String> ans){
        if (index == s.length()){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < temp.size(); j++) {
                sb.append(temp.get(j));
                if(j != temp.size() - 1) sb.append(" ");
            }
            ans.add(sb.toString());
            return;
        }

        StringBuilder word = new StringBuilder();
        for (int i = index; i < s.length(); i++) {
            word.append(s.charAt(i));
            if (dict_set.contains(word.toString())){
                temp.add(word.toString());
                helper(s, i+1, temp, dict_set, ans);
                temp.remove(temp.size()-1);
            }
        }
    }
}

/* optimized 0ms runtime
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        StringBuilder str = new StringBuilder(s);
        List<String> ans = new ArrayList<>();
        solve(0, str, new StringBuilder(), ans, wordDict);
        return ans;
    }

    void solve(int start, StringBuilder s, StringBuilder temp, List<String> ans, List<String> dict){
        int n = s.length();
        if(start == n){
            ans.add(temp.toString().trim());
            return;
        }

        for(int k=start; k<n; k++){
            if(dict.contains(s.substring(start, k+1))){
                int currLen = temp.length();
                temp.append(" ");
                temp.append(s.substring(start, k+1));
                solve(k+1, s, temp, ans, dict);
                temp.setLength(currLen);
            }
        }
        return;
    }
}
 */

/* same as adityaVerma but steps are less 1ms runtime
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
		Set<String> dict = new HashSet<>(wordDict);
		List<String> result = new ArrayList<>();
		solve(s,0,new StringBuilder(), dict, result);
		return result;
	}

	public void solve(String s, int start, StringBuilder path, Set<String> dict, List<String> result) {

		if(start == s.length()) {
			String temp = new String(path).trim();
			result.add(temp);
			return;
		}

		for(int end = start+1; end<=s.length(); end++) {
			String word = s.substring(start,end);
			if(dict.contains(word)) {
				int lenBefore = path.length();
				path.append(word+" ");
				solve(s,end,path,dict,result);
				path.setLength(lenBefore);
			}
		}

	}
}
 */
