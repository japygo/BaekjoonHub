class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int big = sides[0];
        int small = sides[1];
        if (big < small) {
            big = sides[1];
            small = sides[0];
        }
        for (int i = 1; i < big; i++) {
            if (i + small > big) {
                answer++;
            }
        }
        for (int i = big; i < big + small; i++) {
            if (big + small > i) {
                answer++;
            }
        }
        return answer;
    }
}