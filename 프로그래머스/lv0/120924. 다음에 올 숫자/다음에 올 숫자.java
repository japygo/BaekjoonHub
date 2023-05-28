class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int length = common.length;
        int d = common[1] - common[0];
        if (common[2] == common[1] + d) {
            return common[length - 1] + d;
        }
        int r = common[1] / common[0];
        if (common[2] == common[1] * r) {
            return common[length - 1] * r;
        }
        return answer;
    }
}