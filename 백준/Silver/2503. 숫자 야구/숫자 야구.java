import java.util.Scanner;

public class Main {
    static int result = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] hints = new int[N][3];
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            int strike = scanner.nextInt();
            int ball = scanner.nextInt();
            hints[i][0] = num;
            hints[i][1] = strike;
            hints[i][2] = ball;
        }
        recur(0, 100, hints, N);
        System.out.println(result);
    }

    public static void recur(int index, int number, int[][] hints, int N) {
        if (number == 1000) {
            return;
        }

        if (index == N) {
            result += 1;
            recur(0, number + 1, hints, N);
            return;
        }

        int i = number / 100;
        int j = number % 100 / 10;
        int k = number % 100 % 10;

        if (i == j || j == k || k == i ||
                i == 0 || j == 0 || k == 0) {
            recur(0, number + 1, hints, N);
            return;
        }

        int[] hint = hints[index];
        int num = hint[0];
        int strike = hint[1];
        int ball = hint[2];
        int strikeCnt = 0;
        int ballCnt = 0;

        int first = num / 100;
        int second = num % 100 / 10;
        int third = num % 100 % 10;

        if (i == first) {
            strikeCnt++;
        }
        if (j == second) {
            strikeCnt++;
        }
        if (k == third) {
            strikeCnt++;
        }
        if (i == second || i == third) {
            ballCnt++;
        }
        if (j == third || j == first) {
            ballCnt++;
        }
        if (k == first || k == second) {
            ballCnt++;
        }

        if (ball == ballCnt && strike == strikeCnt) {
            recur(index + 1, number, hints, N);
        } else {
            recur(0, number + 1, hints, N);
        }
    }
}