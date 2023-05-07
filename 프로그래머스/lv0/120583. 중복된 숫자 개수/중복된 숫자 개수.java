class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int length = array.length;
        if (1 <= length && length <= 100
           && 0 <= n && n <= 1000) {
            for (int num : array) {
                if (num == n) {
                    answer++;
                }
            }
        }
        return answer;
    }
}