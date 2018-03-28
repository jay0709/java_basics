package code.hackerearth.java;

import java.util.Scanner;

public class DNA_Pride {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String seq = "";
		int tc = scn.nextInt();
		String base = null;
		while (tc > 0) {
			int noOfBase = scn.nextInt();
			base = scn.next();
			while (noOfBase > 0) {
				for (int i = 0; i < base.length(); i++) {
					if (Character.valueOf(base.charAt(i)) == 'A') {
						noOfBase = noOfBase - 1;
						seq = seq + "T";
					} else if (Character.valueOf(base.charAt(i)) == 'T') {
						seq = seq + "A";
						noOfBase = noOfBase - 1;
					} else if (Character.valueOf(base.charAt(i)) == 'G') {
						seq = seq + "C";
						noOfBase = noOfBase - 1;
					} else if (Character.valueOf(base.charAt(i)) == 'C') {
						seq = seq + "G";
						noOfBase = noOfBase - 1;
					} else if (Character.valueOf(base.charAt(i)) == 'U') {
						System.out.println("Error RNA nucleobases found!");
						break;
					}
				}

			}
			System.out.println(seq);
			tc = tc - 1;
			seq = "";
		}
		scn.close();
	}
}
