import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[][] board = new String[n][];
        for (int i = 0; i < n; i++) {
            board[i] = scanner.next().split("");
        }
        int min = Integer.MAX_VALUE;
        for (int i = 8; i <= n; i++) {
            for (int j = 8; j <= m; j++) {
                int cntW = countColor("W", i, j, board);
                if (min > cntW) {
                    min = cntW;
                }
                int cntB = countColor("B", i, j, board);
                if (min > cntB) {
                    min = cntB;
                }
            }
        }
        System.out.println(min);
    }

    public static int countColor(String start, int i, int j, String[][] board) {
        int cnt = 0;
        int row = 0;
        for (int k = i - 8; k < i; k++) {
            int col = 0;
            for (int l = j - 8; l < j; l++) {
                String color = board[k][l];
                if ((row + col) % 2 == 0) {
                    if (!start.equals(color)) {
                        cnt++;
                    }
                } else {
                    if (start.equals(color)) {
                        cnt++;
                    }
                }
                col++;
            }
            row++;
        }
        return cnt;
    }
}