class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int length = num_list.length;
        if (length >= 1 && length <= 100) {
            int odd = 0;
            int even = 0;
            for (int i = 0 ; i < length ; i++) {
                if (num_list[i] % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }
            }
            answer[0] = even;
            answer[1] = odd;
        }
        return answer;
    }
}