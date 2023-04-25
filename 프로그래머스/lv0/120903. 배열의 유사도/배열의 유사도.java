class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int length1 = s1.length;
        int length2 = s2.length;
        if (1 <= length1 && length1 <= 100
           && 1 <= length2 && length2 <= 100) {
            for (int i=0; i < length1; i++) {
                for (int j=0; j < length2; j++) {
                    if (s1[i].equals(s2[j])) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}