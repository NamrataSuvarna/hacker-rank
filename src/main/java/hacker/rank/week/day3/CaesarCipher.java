package hacker.rank.week.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class CaesarCipherResult {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
        char[] c = s.toCharArray();
        return IntStream.range(0, c.length).boxed().map(i -> String.valueOf(getMaskedChar(c[i], k))).collect(Collectors.joining());
    }

    private static char getMaskedChar(char c, int k) {
        if (!Character.isAlphabetic((int) c)) {
            return c;
        }
        if (k > 26) {
            k = k % 26;
        }
        int mc = (int) c + k;
        if (Character.isLowerCase(c) && mc > (int) 'z') {
            return (char) ((int) 'a' -1 + mc - (int) 'z');
        }
        if (Character.isUpperCase(c) && mc > (int) 'Z') {
        	return (char) ((int) 'A' -1 + mc - (int) 'Z');
        }
        return (char) mc;
    }

}

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        @SuppressWarnings("unused")
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = CaesarCipherResult.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
