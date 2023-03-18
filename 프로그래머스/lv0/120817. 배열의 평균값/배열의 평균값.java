class Solution {
    public double solution(int[] numbers) {
        int length = numbers.length;
        double answer = 0;
        if (length >= 1 && length <= 100) {
            double total = 0;
            for (int number : numbers) {
                total += number;
            }
            answer = total / length;
        }
        return answer;
    }
}