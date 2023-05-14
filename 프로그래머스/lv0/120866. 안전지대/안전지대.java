class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int length = board.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i - 1 >= 0) {
                    if (j - 1 >= 0 && board[i-1][j-1] == 1) {
                        continue;
                    }
                    if (board[i-1][j] == 1) {
                        continue;
                    }
                    if (j + 1 < length && board[i-1][j+1] == 1) {
                        continue;
                    }
                }
                if (j - 1 >= 0 && board[i][j-1] == 1) {
                    continue;
                }
                if (board[i][j] == 1) {
                    continue;
                }
                if (j + 1 < length && board[i][j+1] == 1) {
                    continue;
                }
                if (i + 1 < length) {
                    if (j - 1 >= 0 && board[i+1][j-1] == 1) {
                        continue;
                    }
                    if (board[i+1][j] == 1) {
                        continue;
                    }
                    if (j + 1 < length && board[i+1][j+1] == 1) {
                        continue;
                    }
                }
                answer++;
            }
        }
        return answer;
    }
}