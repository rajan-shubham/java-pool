package javaStackQueue;

// https://leetcode.com/problems/minimum-string-length-after-removing-substrings/?envType=daily-question&envId=2024-10-07

class MinStrLen {
    public int minLength(String s) {
        String ab = "AB", cd = "CD";
        for(int i = 0; i<s.length(); i++){
            if(s.contains(ab)){
                s = s.replace(ab, "");
                i = 0;
            } else if(s.contains(cd)){
                s = s.replace(cd, "");
                i = 0;
            }
        }
        return s.length();
    }

  public int minLength(String s) {
        char[] stack = new char[s.length()+1];
        int last = -1;
        for (char c : s.toCharArray()) {
            if (last > -1 && (c == 'B' && stack[last] == 'A' || 
                                     c == 'D' && stack[last] == 'C')) 
            {
                last--;
            } else {
                last++;
                stack[last] = c;
            }
        }
        return last+1;
    }
}
