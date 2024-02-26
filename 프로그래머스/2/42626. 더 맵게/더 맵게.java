import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (int s : scoville) {
            queue.add((long) s);
        }

        while (!queue.isEmpty()) {
            boolean isOk = true;
            for (long s : queue) {
                if (s < K) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                break;
            }
            if (queue.size() < 2) {
                answer = -1;
                break;
            }

            long first = queue.poll();
            long second = queue.poll();
            long mix = first + second * 2;
            queue.add(mix);
            answer += 1;
        }
        
        return answer;
    }
}