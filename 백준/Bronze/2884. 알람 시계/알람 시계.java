import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (b >= 45) {
            b -= 45;
        } else {
            b = 60 - (45 - b);
            if (a > 0) {
                a -= 1;
            } else {
                a = 23;
            }
        }
        System.out.println(a + " " + b);
    }
}