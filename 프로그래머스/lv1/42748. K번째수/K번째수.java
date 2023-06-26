import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] tmp = Arrays.stream(array, i - 1, j).toArray();
            Arrays.sort(tmp);
            answer[cnt++] = tmp[k - 1];
        }
        return answer;
    }
}