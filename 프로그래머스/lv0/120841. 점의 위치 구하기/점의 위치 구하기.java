class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int length = dot.length;
        if (length == 2) {
            int x = dot[0];
            int y = dot[1];
            if (x != 0 && y != 0
               && x >= -500 && x <= 500
               && y >= -500 && y <= 500) {
                if (x > 0 && y > 0) {
                    answer = 1;
                } else if (x < 0 && y > 0) {
                    answer = 2;
                } else if (x < 0 && y < 0) {
                    answer = 3;
                } else if (x > 0 && y < 0) {
                    answer = 4;
                }
            }
        }
        return answer;
    }
}