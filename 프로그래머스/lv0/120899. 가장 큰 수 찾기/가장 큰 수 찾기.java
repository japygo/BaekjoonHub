class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int length = array.length;
        if (1 <= length && length <= 100) {
            answer[0] = -1;
            for (int i = 0; i < length; i++) {
                if (answer[0] < array[i]) {
                    answer[0] = array[i];
                    answer[1] = i;
                }
            }
        }
        return answer;
    }
}