class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int length1 = str1.length();
        int length2 = str2.length();
        if (1 <= length1 && length1 <= 100
           && 1 <= length2 && length2 <= 100) {
            if (str1.contains(str2)) {
                answer = 1;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}