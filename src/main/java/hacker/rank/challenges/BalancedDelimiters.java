package hacker.rank.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class BalancedDelimiters {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String delimiterString = bufferedReader.readLine();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < delimiterString.length(); i++) {
			if (Arrays.asList('(', '{', '[').contains(delimiterString.charAt(i))) {
				stack.push(delimiterString.charAt(i));
				continue;
			}
			if (')' == delimiterString.charAt(i) && stack.peek() == '(') {
				stack.pop();
				continue;
			}
			if ('}' == delimiterString.charAt(i) && stack.peek() == '{') {
				stack.pop();
				continue;
			}
			if (']' == delimiterString.charAt(i) && stack.peek() == '[') {
				stack.pop();
				continue;
			}
			break;
		}
		System.out.println(stack.empty() ? "True" : "False");
	}

}