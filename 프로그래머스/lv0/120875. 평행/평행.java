class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int w1 = dots[0][0] - dots[1][0];
        int h1 = dots[0][1] - dots[1][1];
        int w2 = dots[2][0] - dots[3][0];
        int h2 = dots[2][1] - dots[3][1];
        if ((double) h1 / w1 == (double) h2 / w2) {
            return 1;
        }
        w1 = dots[0][0] - dots[2][0];
        h1 = dots[0][1] - dots[2][1];
        w2 = dots[1][0] - dots[3][0];
        h2 = dots[1][1] - dots[3][1];
        if ((double) h1 / w1 == (double) h2 / w2) {
            return 1;
        }
        w1 = dots[0][0] - dots[3][0];
        h1 = dots[0][1] - dots[3][1];
        w2 = dots[1][0] - dots[2][0];
        h2 = dots[1][1] - dots[2][1];
        if ((double) h1 / w1 == (double) h2 / w2) {
            return 1;
        }
        return answer;
    }
}