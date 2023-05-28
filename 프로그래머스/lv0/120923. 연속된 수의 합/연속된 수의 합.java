class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (int) (Math.ceil((double) total / num) - (num / 2));
        for (int i = 0; i < num; i++) {
            answer[i] = start++;
        }
        return answer;
    }
}