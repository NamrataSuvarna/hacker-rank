package hacker.rank.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class FactorialOfN {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(bufferedReader.readLine());
		BigDecimal factorial = new BigDecimal(1);
		for (int i = 1; i <= n; i++) {
			factorial = factorial.multiply(new BigDecimal(i));
		}
		System.out.println(factorial.toString());
	}

}