class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int length = numbers.length;
        if (2 <= length && length <= 100) {
            int max = 0;
            int max2 = 0;
            for (int i = 0 ; i < length ; i++) {
                int num = numbers[i];
                if (max < num) {
                    max2 = max;
                    max = num;
                } else {
                    if (max2 < num) {
                        max2 = num;
                    }
                }
            }
            answer = max * max2;
        }
        return answer;
    }
}