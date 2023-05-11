class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            int n = numbers[i];
            for (int j = 0; j < length; j++) {
                int m = numbers[j];
                if (i != j && n * m > answer) {
                    answer = n * m;
                }
            }
        }
        return answer;
    }
}