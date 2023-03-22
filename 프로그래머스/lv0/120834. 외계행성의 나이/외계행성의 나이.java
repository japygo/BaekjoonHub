class Solution {
    public String solution(int age) {
        String answer = "";
        if (age <= 1000) {
            String strAge = String.valueOf(age);
            for (int i = 0 ; i < strAge.length() ; i++) {
                char ch = strAge.charAt(i);
                switch(ch) {
                    case '0':
                        answer += "a";
                        break;
                    case '1':
                        answer += "b";
                        break;
                    case '2':
                        answer += "c";
                        break;
                    case '3':
                        answer += "d";
                        break;
                    case '4':
                        answer += "e";
                        break;
                    case '5':
                        answer += "f";
                        break;
                    case '6':
                        answer += "g";
                        break;
                    case '7':
                        answer += "h";
                        break;
                    case '8':
                        answer += "i";
                        break;
                    case '9':
                        answer += "j";
                        break;
                }
            }
        }
        return answer;
    }
}