class Solution {
    public int solution(String s) {
        int answer = 0;
        int length = s.length();
        if (1 <= length && length <= 200) {
            String[] nums = s.split(" ");
            int before = 0;
            for (String num : nums) {
                if (num.equals("Z")) {
                    answer -= before;
                } else {
                    before = Integer.parseInt(num);
                    answer += before;
                }
            }
        }
        return answer;
    }
}