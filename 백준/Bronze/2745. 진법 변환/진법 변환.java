import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int b = scanner.nextInt();
        char[] arr = a.toCharArray();
        int num = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int c = arr[i];
            if (48 <= c && c <= 57) {
                c -= 48;
            } else if (65 <= c && c <= 90) {
                c -= 55;
            }
            num += c * Math.pow(b, arr.length - i - 1);
        }
        System.out.println(num);
    }
}