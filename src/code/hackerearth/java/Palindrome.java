package code.hackerearth.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Palindrome {
	public static void main(String args[]) throws Exception {
		String name = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		for (int i = 0; i < tc; i++) {
			try {
				name = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			name = scn.next();
			checkPalindrome(name);
		}

	}

	public static void checkPalindrome(String str) {
		String pal = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			pal = pal + str.charAt(i);
			System.out.println();
		}

		// char[] carr = str.toCharArray();
		// for (int j = 0; j < carr.length; j++) {
		// System.out.println((int) carr[j] + 1);
		// }
		if (pal.length() % 2 == 0 && str.equals(pal) || pal.length() == 0)
			System.out.println("YES EVEN");
		else if (pal.length() % 2 == 1 && str.equals(pal) || pal.length() == 1)
			System.out.println("YES ODD");
		else
			System.out.println("NO");

	}

}