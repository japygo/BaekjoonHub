class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        if (0 < numer1 && numer1 < 1000 && 0 < numer2 && numer2 < 1000
           && 0 < denom1 && denom1 < 1000 && 0 < denom2 && denom2 < 1000) {
            int bunmo = denom1 * denom2;
            int bunja = numer1 * denom2 + numer2 * denom1;
            
            int g = gcd(bunmo, bunja);
            
            answer[0] = bunja / g;
            answer[1] = bunmo / g;
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