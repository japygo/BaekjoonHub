import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        StringBuilder num = new StringBuilder();
        while (a != 0) {
            int c = a % b;
            if (0 <= c && c <= 9) {
                num.append(c);
            } else {
                c += 55;
                num.append((char) c);
            }
            a /= b;
        }
        System.out.println(num.reverse());
    }
}