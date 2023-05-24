import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String result = "Error";
        if (a == 60 && b == 60 && c == 60) {
            result = "Equilateral";
        } else {
            if (a + b + c == 180) {
                if (a != b && b != c && c != a) {
                    result = "Scalene";
                } else {
                    result = "Isosceles";
                }
            }
        }
        System.out.println(result);
    }
}