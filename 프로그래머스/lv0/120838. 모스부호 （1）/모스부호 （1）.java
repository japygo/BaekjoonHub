class Solution {
    public String solution(String letter) {
        String answer = "";
        int length = letter.length();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        if (length >= 1 && length <= 1000) {
            String[] morses = letter.split(" ");
            for (int i = 0 ; i < morses.length ; i++) {
                String str = morses[i];
                for (int j = 0 ; j < morse.length ; j++) {
                    if (morse[j].equals(str)) {
                        answer += String.valueOf((char) (j + 97));
                        break;
                    }
                }
            }
            
        }
        return answer;
    }
}