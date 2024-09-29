package javaStackQueue;

import java.util.Stack;

class ValidParenthesis {
//  https://leetcode.com/problems/valid-parentheses/

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else {
        if (ch == ')') {
          if (stack.isEmpty() || stack.pop() != '(') {
            return false;
          }
        }
        if (ch == '}') {
          if (stack.isEmpty() || stack.pop() != '{') {
            return false;
          }
        }
        if (ch == ']') {
          if (stack.isEmpty() || stack.pop() != '[') {
            return false;
          }
        }
      }
    }
    return stack.isEmpty();
  }

  // 0ms runtime
  public boolean isValid2(String s) {
    char[] stack = new char[s.length()];
    int top = -1;

    for (char c : s.toCharArray()) {

      if (c == '(' || c == '{' || c == '[') {
        stack[++top] = c;
      } else {
        if (top == -1) {
          return false;
        }
        char topChar = stack[top--];
        if ((c == ')' && topChar != '(') ||
                (c == '}' && topChar != '{') ||
                (c == ']' && topChar != '[')) {
          return false;
        }
      }
    }
    return top == -1;
  }
}
