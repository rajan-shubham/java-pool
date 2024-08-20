import java.util.Stack;
class ValidParenMinAdd {
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
}
