import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a, b, c;
        a = scanner.nextBigInteger();
        b = scanner.nextBigInteger();
        c = scanner.nextBigInteger();
        System.out.println(a.add(b).add(c));
    }
}