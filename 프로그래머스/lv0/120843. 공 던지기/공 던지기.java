class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int length = numbers.length;
        if (length > 2 && length < 100
           && k > 0 && k < 1000) {
            int tmp = k * 2 - 1;
            if (tmp < length) {
                answer = numbers[tmp - 1];
            } else {
                answer = numbers[tmp % length == 0 ? length - 1 : tmp % length - 1];
            }
        }
        return answer;
    }
}