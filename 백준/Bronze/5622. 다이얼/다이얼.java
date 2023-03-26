import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int result = 0;
        for (int i = 0; i < a.length(); i++) {
            int b = a.charAt(i);
            if (65 <= b && b <= 67) {
                result += 3;
            } else if (b <= 70) {
                result += 4;
            } else if (b <= 73) {
                result += 5;
            } else if (b <= 76) {
                result += 6;
            } else if (b <= 79) {
                result += 7;
            } else if (b <= 83) {
                result += 8;
            } else if (b <= 86) {
                result += 9;
            } else if (b <= 90) {
                result += 10;
            }
        }
        System.out.println(result);
    }
}