import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int length = numlist.length;
        if (1 <= n && n <= 10000
           && 1 <= length && length <= 100) {
            answer = Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
        }
        return answer;
    }
}