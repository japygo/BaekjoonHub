import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if (!s.startsWith("(") || !s.endsWith(")")) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.add(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        answer = stack.isEmpty();
        return answer;
    }
}