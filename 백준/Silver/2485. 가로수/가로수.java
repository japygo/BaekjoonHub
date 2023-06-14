import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<Integer> trees = new ArrayList<>();
        List<Integer> terms = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tree = Integer.parseInt(bufferedReader.readLine());
            trees.add(tree);
            if (i > 0) {
                terms.add(tree - trees.get(i - 1));
            }
        }

        int gcd = terms.get(0);
        for (int i = 1; i < terms.size(); i++) {
            gcd = gcd(gcd, terms.get(i));
        }

        int cnt = 0;
        for (int i = 1; i < trees.size(); i++) {
            cnt += (trees.get(i) - trees.get(i - 1)) / gcd - 1;
        }
        System.out.println(cnt);
    }
    public static int gcd(int a, int b) {
        int c = a % b;
        while(c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }
}