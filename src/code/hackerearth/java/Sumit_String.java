package code.hackerearth.java;

import java.util.Scanner;

public class Sumit_String {

	public static void main(String args[]) throws Exception {
		String name = null;
		int i = 0;
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		for (; i < tc; i++) {
			name = scn.next();
			checkSumitString(name);
		}
		scn.close();

	}

	private static void checkSumitString(String str) {
		char[] charArray = str.toCharArray();
		int j = 0;
		int flag = 0;
		for (; j < charArray.length - 1; j++) {
			System.out.println((int) charArray[j]);
			System.out.println((int) charArray[j + 1]);
			if (flag == 0 && (int) charArray[j] + 1 == (int) charArray[j + 1]
					|| charArray[j] - 1 == (int) charArray[j + 1])
				flag = 0;
			else {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
