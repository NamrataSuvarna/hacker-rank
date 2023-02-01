package hacker.rank.week.day1;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MiniMaxSumResult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        List<Integer> sortedArray = arr.stream().sorted().collect(Collectors.toList());
        printResult(sortedArray.stream().limit(4));
        printResult(sortedArray.stream().skip(sortedArray.size() - 4));
    }

    private static void printResult(Stream<Integer> stream) {
        System.out.print(stream.mapToLong(Integer::longValue).sum());
        System.out.print(" ");
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        MiniMaxSumResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}
