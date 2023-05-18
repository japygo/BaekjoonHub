import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            int q = 0;
            int d = 0;
            int n = 0;
            int p = 0;
            while (b != 0) {
                if (b >= 25) {
                    q = b / 25;
                    b -= q * 25;
                } else if (b >= 10) {
                    d = b / 10;
                    b -= d * 10;
                } else if (b >= 5) {
                    n = b / 5;
                    b -= n * 5;
                } else {
                    p = b;
                    b -= p;
                }
            }
            result.append(q).append(" ").append(d).append(" ").append(n).append(" ").append(p);
            if (i < a - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}