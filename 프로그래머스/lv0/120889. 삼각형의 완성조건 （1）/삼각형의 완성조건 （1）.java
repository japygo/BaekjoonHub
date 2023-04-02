class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        for (int side : sides) {
            if (max < side) {
                max = side;
            }
        }
        int sum = 0;
        boolean isMax = true;
        for (int side : sides) {
            if (max == side) {
                if (!isMax) {
                    sum += side;
                }
                isMax = false;
            } else {
                sum += side;
            }
        }
        if (max < sum) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}