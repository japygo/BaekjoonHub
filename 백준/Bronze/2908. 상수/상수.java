import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.next().split("");
        String[] b = scanner.next().split("");
        int numA = Integer.parseInt(reverse(a));
        int numB = Integer.parseInt(reverse(b));
        if (numA > numB) {
            System.out.println(numA);
        } else {
            System.out.println(numB);
        }
    }
    public static String reverse(String[] a) {
        String[] tmp = new String[a.length];
        for (int i = 0; i < 3; i++) {
            tmp[i] = a[2 - i];
        }
        return String.join("", tmp);
    }
}