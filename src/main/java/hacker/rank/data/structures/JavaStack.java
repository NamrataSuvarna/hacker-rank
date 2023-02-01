package hacker.rank.data.structures;

import java.util.Scanner;

public class JavaStack {

	private static boolean isBalanced(String input) {
		char[] parantheses = input.toCharArray();
		int braces = 0, brackets = 0, squareBrackets = 0;
		for (int i = 0; i < parantheses.length; i++) {
			switch (parantheses[i]) {
			case '{':
				braces++;
				continue;
			case '}':
				if (braces <= 0) {
					return false;
				}
				braces--;
				continue;
			case '(':
				brackets++;
				continue;
			case ')':
				if (brackets <= 0) {
					return false;
				}
				brackets--;
				continue;
			case '[':
				squareBrackets++;
				continue;
			case ']':
				if (squareBrackets <= 0) {
					return false;
				}
				squareBrackets--;
				continue;
			}
		}
		return braces == 0 && brackets == 0 && squareBrackets == 0;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = scanner.next();
			System.out.println(isBalanced(input));
		}
	}

}