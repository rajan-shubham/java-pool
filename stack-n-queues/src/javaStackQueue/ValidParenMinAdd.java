package javaStackQueue;

import java.util.Stack;
class ValidParenMinAdd {
//  https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/submissions/1405902543/

    public int minAddToMakeValid(String s) {
      Stack<Character> stack = new Stack<>();
      for (char ch : s.toCharArray()) {
        if (ch == ')') {
          if (!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
          } else {
            stack.push(ch);
          }
        } else {
          stack.push(ch);
        }
      }
      return stack.size();
    }

    public int minAddToMakeValid0ms(String s) {
      int cnt1 = 0, cnt2 = 0;

      for (char c : s.toCharArray()) {
        if (c == '(') {
          cnt1++;
        } else if (c == ')') {
          if (cnt1 > 0) {
            cnt1--;
          } else {
            cnt2++;
          }
        }
      }
      return cnt1 + cnt2;
    }
}
