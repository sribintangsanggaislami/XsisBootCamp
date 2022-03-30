package logic04;

import java.util.Scanner;

public class Main {
	
	static void separateNumbers(String s) {

		String subString = "";
		boolean isValid = false;
		for (int i = 1; i <= s.length() / 2; i++) {
			subString = s.substring(0, i);
			Long num = Long.parseLong(subString);
			String validString = subString;
			while (validString.length() < s.length()) {
				validString += Long.toString(++num);
			}
			if (s.equals(validString)) {
				isValid = true;
				break;
			}

		}
		System.out.println(isValid ? "YES " + subString : "NO");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q-- > 0) {
			String s = sc.next();
			separateNumbers(s);
		}
		sc.close();
	}
}
