import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int length = array.length;
        if (length > 0 && length < 100 && length % 2 == 1) {
            Arrays.sort(array);
            int index = length / 2;
            answer = array[index];
        }
        return answer;
    }
}