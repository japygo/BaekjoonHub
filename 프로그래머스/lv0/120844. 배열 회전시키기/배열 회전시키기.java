class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        if (length >= 3 && length <= 20) {
            if ("right".equals(direction)) {
                for (int i = 0 ; i < length ; i++) {
                    if (i == 0) {
                        answer[i] = numbers[length - 1];
                    } else {
                        answer[i] = numbers[i - 1];
                    }
                }
            } else if ("left".equals(direction)) {
                for (int i = 0 ; i < length ; i++) {
                    if (i == length - 1) {
                        answer[i] = numbers[0];
                    } else {
                        answer[i] = numbers[i + 1];
                    }
                }
            }
        }
        return answer;
    }
}