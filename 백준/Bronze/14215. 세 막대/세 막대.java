import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c) {
            while (a >= b + c) {
                a--;
            }
        } else if (b > c && b > a) {
            while (b >= c + a) {
                b--;
            }
        } else if (c > a && c > b) {
            while (c >= a + b) {
                c--;
            }
        }
        System.out.println(a + b + c);
    }
}