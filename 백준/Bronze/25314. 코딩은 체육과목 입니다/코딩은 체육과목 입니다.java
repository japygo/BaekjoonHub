import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();

        System.out.println("long ".repeat(Math.max(0, a / 4)) + "int");
    }
}