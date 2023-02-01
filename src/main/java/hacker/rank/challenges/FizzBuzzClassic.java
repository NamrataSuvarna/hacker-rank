package hacker.rank.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzzClassic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(bufferedReader.readLine());
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
				continue;
			}
			if (i % 3 == 0) {
				System.out.println("Fizz");
				continue;
			}
			if (i % 5 == 0) {
				System.out.println("Buzz");
				continue;
			}
			System.out.println(i);
		}
	}

}