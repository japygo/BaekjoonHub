import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < 20; i++) {
            String[] a = scanner.nextLine().split(" ");
            double b = Double.parseDouble(a[1]);
            double c = 0;
            switch (a[2]) {
                case "A+":
                    c = 4.5;
                    break;
                case "A0":
                    c = 4.0;
                    break;
                case "B+":
                    c = 3.5;
                    break;
                case "B0":
                    c = 3.0;
                    break;
                case "C+":
                    c = 2.5;
                    break;
                case "C0":
                    c = 2.0;
                    break;
                case "D+":
                    c = 1.5;
                    break;
                case "D0":
                    c = 1.0;
                    break;
                case "F":
                    c = 0.0;
                    break;
                case "P":
                    continue;
            }
            sum += b * c;
            sum2 += b;
        }
        System.out.printf("%.6f", sum / sum2);
    }
}