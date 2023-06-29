import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            int cnt = (100 - progress) / speed;
            if ((100 - progress) % speed != 0) {
                cnt++;
            }
            if (!stack.isEmpty() && stack.peek() > cnt) {
                stack.add(stack.peek());
            } else {
                stack.add(cnt);
            }
        }
        List<Integer> list = new ArrayList<>();
        int tmp = 0;
        int cnt = 0;
        for (Integer i : stack) {
            if (tmp == i) {
                cnt++;
            } else {
                if (cnt != 0) {
                    list.add(cnt);
                }
                tmp = i;
                cnt = 1;
            }
        }
        list.add(cnt);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}