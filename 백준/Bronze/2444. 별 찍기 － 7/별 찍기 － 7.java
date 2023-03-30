import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        int line = a * 2 - 1;
        for (int i = 1; i <= line; i++) {
            if (i <= a) {
                result.append(" ".repeat(a - i)).append("*".repeat(2 * i - 1));
            }
            if (i > a) {
                result.append(" ".repeat(i - a)).append("*".repeat(line - 2 * (i - a)));
            }
            if (i != line) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}