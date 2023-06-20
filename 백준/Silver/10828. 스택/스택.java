import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();
            int num = 0;
            if (stringTokenizer.hasMoreTokens()) {
                num = Integer.parseInt(stringTokenizer.nextToken());
            }
            switch (command) {
                case "push":
                    stack.add(num);
                    break;
                case "pop":
                    result.append(stack.isEmpty() ? -1 : stack.pop());
                    break;
                case "size":
                    result.append(stack.size());
                    break;
                case "empty":
                    result.append(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    result.append(stack.isEmpty() ? -1 : stack.peek());
                    break;
                default:
                    break;
            }
            if (i < n - 1 && !command.equals("push")) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}