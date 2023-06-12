import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String s = stringTokenizer.nextToken();
        String[] arr = s.split("");
        int length = arr.length;
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= length; i++) {
            for (int j = i + 1; j <= length; j++) {
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}