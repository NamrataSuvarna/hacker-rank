package hacker.rank.data.structures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.IntStream;

class BalancedBracketsResult {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING expression as parameter.
     */

    public static String isBalanced(String expression) {
    // Write your code here
        Stack<String> stack = new Stack<>();
        Map<String, String> map = new HashMap<>();
        map.put("}", "{"); map.put(")", "("); map.put("]", "[");
        String[] brackets = expression.split("");
        for (int i = 0; i < brackets.length; i++) {
            if (map.values().contains(brackets[i])) {
                stack.push(brackets[i]);
                continue;
            }
            if (stack.isEmpty()) {
                return "NO";
            }
            if (!map.get(brackets[i]).equals(stack.peek())) {
                return "NO";
            }
            stack.pop();
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

}

public class BalancedBrackets {
    public static void main(String[] args) throws IOException {
    	System.out.println(BalancedBracketsResult.isBalanced("][(]}})("));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String expression = bufferedReader.readLine();

                String res = BalancedBracketsResult.isBalanced(expression);

                bufferedWriter.write(res);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
