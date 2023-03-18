import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, result;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a == b && b == c) {
            result = 10000 + a * 1000;
        } else if (a == b || b == c || c == a) {
            if (a == b || c == a) {
                result = 1000 + a * 100;
            } else {
                result = 1000 + b * 100;
            }
        } else {
            if (a > b && a > c) {
                result = a * 100;
            } else if (b > a && b > c) {
                result = b * 100;
            } else {
                result = c * 100;
            }
        }

        System.out.println(result);
    }
}