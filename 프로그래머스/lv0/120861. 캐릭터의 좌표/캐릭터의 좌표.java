class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int length = keyinput.length;
        if (0 <= length && length <= 50) {
            int garo = (board[0] - 1) / 2;
            int sero = (board[1] - 1) / 2;
            for (String key : keyinput) {
                switch(key) {
                    case "up":
                        if (answer[1] < sero) {
                            answer[1] += 1;
                        }
                        break;
                    case "down":
                        if (answer[1] > (sero * -1)) {
                            answer[1] -= 1;
                        }
                        break;
                    case "left":
                        if (answer[0] > (garo * -1)) {
                            answer[0] -= 1;
                        }
                        break;
                    case "right":
                        if (answer[0] < garo) {
                            answer[0] += 1;
                        }
                        break;
                }
            }
        }
        return answer;
    }
}