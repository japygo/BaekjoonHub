import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }

        while (!queue.isEmpty()) {
            int[] process = queue.poll();
            int index = process[0];
            int priority = process[1];
            boolean isHigher = false;
            for (int[] q : queue) {
                if (priority < q[1]) {
                    isHigher = true;
                    break;
                }
            }
            if (isHigher) {
                queue.add(process);
                continue;
            }
            answer += 1;
            if (index == location) {
                break;
            }
        }
        
        return answer;
    }
}