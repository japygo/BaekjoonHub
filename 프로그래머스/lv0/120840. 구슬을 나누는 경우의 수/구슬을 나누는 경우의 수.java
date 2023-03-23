import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        if (share == 0 || balls == share) {
            return BigInteger.ONE.intValue();
        }
        if (balls >= 1 && balls <= 30
           && share >= 1 && share <= 30
           && share <= balls) {
            int tmp = balls - share;
            if (tmp > share) share = tmp;
            
            BigInteger numerator = BigInteger.ONE;
            for (int i = balls; i > balls - share; i--) {
                numerator = numerator.multiply(BigInteger.valueOf(i));
            }
        
            BigInteger denominator = BigInteger.ONE;
            for (int i = 1; i <= share; i++) {
                denominator = denominator.multiply(BigInteger.valueOf(i));
            }
        
            answer = numerator.divide(denominator).intValue();
        }
        return answer;
    }
}