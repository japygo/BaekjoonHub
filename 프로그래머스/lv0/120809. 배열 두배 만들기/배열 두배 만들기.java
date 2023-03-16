class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        if (numbers.length >= 1 && numbers.length <= 1000) {
            for (int i = 0 ; i < numbers.length ; i++) {
                int number = numbers[i];
                if (number >= -10000 && number <= 10000) {
                    answer[i] = number * 2;
                }
            }
        }
        return answer;
    }
}