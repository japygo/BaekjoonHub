import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (stack.isEmpty()) {
                stack.add(i);
            } else if (i != stack.peek()) {
                stack.add(i);
            }
        }
        answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}