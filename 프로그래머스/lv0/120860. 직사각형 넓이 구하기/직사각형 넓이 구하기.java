class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = dots[0][0];
        int height = dots[0][1];
        for (int[] dot : dots) {
            if (width != dot[0] && height != dot[1]) {
                width -= dot[0];
                height -= dot[1];
                break;
            }
        }
        answer = Math.abs(width) * Math.abs(height);
        return answer;
    }
}