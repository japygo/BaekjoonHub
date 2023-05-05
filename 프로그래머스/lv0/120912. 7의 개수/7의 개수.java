class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int length = array.length;
        if (1 <= length && length <= 100) {
            for (int num : array) {
                for (String n : String.valueOf(num).split("")) {
                    if (n.equals("7")) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}