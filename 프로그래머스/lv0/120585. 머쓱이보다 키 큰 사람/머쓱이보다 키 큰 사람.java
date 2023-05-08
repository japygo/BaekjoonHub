class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int length = array.length;
        if (1 <= length && length <= 100
           && 1 <= height && height <= 200) {
            for (int a : array) {
                if (height < a) {
                    answer++;
                }
            }
        }
        return answer;
    }
}