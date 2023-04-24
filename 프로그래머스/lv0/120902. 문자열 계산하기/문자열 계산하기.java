class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int length = my_string.length();
        if (5 <= length && length <= 100) {
            my_string += " ";
            String[] arr = my_string.split("");
            boolean isPlus = true;
            boolean isMinus = false;
            boolean isCal = true;
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                switch (s) {
                    case " ": {
                        if (!isCal) {
                            isCal = true;
                            break;
                        }
                        isCal = false;
                        int tmp = Integer.parseInt(sb.toString());
                        if (isPlus) {
                            answer += tmp;
                            isPlus = false;
                        }
                        if (isMinus) {
                            answer -= tmp;
                            isMinus = false;
                        }
                        sb = new StringBuilder();
                        break;
                    }
                    case "+": {
                        isPlus = true;
                        break;
                    }
                    case "-": {
                        isMinus = true;
                        break;
                    }
                    default:
                        sb.append(s);
                        break;
                }
            }
        }
        return answer;
    }
}