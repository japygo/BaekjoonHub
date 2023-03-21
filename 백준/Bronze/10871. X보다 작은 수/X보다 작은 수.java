import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a; i++) {
            int c = scanner.nextInt();
            if (c < b) {
                result.append(c);
                if (i != a - 1) {
                    result.append(" ");
                }
            }
        }
        System.out.println(result);
    }
}