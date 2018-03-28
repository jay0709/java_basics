package code.hackerearth.java;

import java.util.Scanner;

public class CheckValidPhoneNo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 0;
		int tc = scn.nextInt();
		for (; i < tc; i++) {
			String phone = scn.next();
			if (phone.matches("[0-9]+") && phone.startsWith("0") == false && phone.length() == 10) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}
		scn.close();
	}

}
