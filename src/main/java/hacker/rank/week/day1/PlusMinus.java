package hacker.rank.week.day1;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        printResult(arr, i -> i > 0);
        printResult(arr, i -> i < 0);
        printResult(arr, i -> i == 0);
    }

    private static void printResult(List<Integer> arr, Predicate<Integer> predicate) {
        System.out.println(String.format("%.6f", (float) arr.stream().filter(predicate).count() / arr.size()));
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        @SuppressWarnings("unused")
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        PlusMinusResult.plusMinus(arr);

        bufferedReader.close();
    }
}
