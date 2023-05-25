import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            if (a == b && b == c) {
                result.append("Equilateral");
            } else {
                if ((a >= b && a >= c && a < b + c) || (b >= c && b >= a && b < c + a) || (c >= a && c >= b && c < a + b)) {
                    if (a != b && b != c && c != a) {
                        result.append("Scalene");
                    } else {
                        result.append("Isosceles");
                    }
                } else {
                    result.append("Invalid");
                }
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}