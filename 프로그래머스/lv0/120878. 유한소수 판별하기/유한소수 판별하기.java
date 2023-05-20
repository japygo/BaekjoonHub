class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        b /= gcd(a, b);
        int c = 2;
        while (b != 1) {
            if (b % c == 0) {
                if (c != 2 && c != 5) {
                    answer = 2;
                    break;
                }
                b /= c;
                c = 2;
            } else {
                c++;
            }
        }
        return answer;
    }
    public int gcd(int a, int b) {
        int c = a % b;
        while(c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }
}