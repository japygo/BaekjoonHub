class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int length = numbers.length;
        if (length >= 2 && length <= 30
           && num1 >= 0 && num2 > num1 && length > num2) {
            for (int i = 0 ; i < answer.length ; i++) {
                answer[i] = numbers[i + num1];
            }
        }
        return answer;
    }
}