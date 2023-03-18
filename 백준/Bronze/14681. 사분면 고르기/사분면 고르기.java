import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > 0) {
            c = b > 0 ? 1 : 4;
        } else {
            c = b > 0 ? 2 : 3;
        }
        System.out.println(c);
    }
}