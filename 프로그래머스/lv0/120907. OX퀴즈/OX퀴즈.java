import java.util.Arrays;
class Solution {
    public String[] solution(String[] quiz) {
        int length = quiz.length;
        String[] answer = new String[length];
        if (1 <= length && length <= 10) {
            int index = 0;
            for (String q : quiz) {
                String result = "";
                int[] nums = Arrays.stream(q.split(" \\+ | - | = ")).mapToInt(Integer::parseInt).toArray();
                if (q.contains("+")) {
                    if (nums[0] + nums[1] == nums[2]) {
                        result = "O";
                    } else {
                        result = "X";
                    }
                } else if (q.contains("-")) {
                    if (nums[0] - nums[1] == nums[2]) {
                        result = "O";
                    } else {
                        result = "X";
                    }
                }
                answer[index++] = result;
            }
        }
        return answer;
    }
}