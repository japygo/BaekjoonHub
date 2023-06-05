import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        Map<Integer, String> indexMap = new HashMap<>();
        Map<String, Integer> nameMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int index = i + 1;
            String name = bufferedReader.readLine();
            indexMap.put(index, name);
            nameMap.put(name, index);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String q = bufferedReader.readLine();
            try {
                int index = Integer.parseInt(q);
                stringBuilder.append(indexMap.get(index));
            } catch (NumberFormatException e) {
                stringBuilder.append(nameMap.get(q));
            }
            if (i < m - 1) {
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}