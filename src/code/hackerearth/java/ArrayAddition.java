package code.hackerearth.java;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		int size = 0;

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size: ");
		size = scn.nextInt();
		int[] a = new int[size];
		int[] b = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + i);
			a[i] = scn.nextInt();
		}
		for (int j = 0; j < size; j++) {
			System.out.println("Enter " + j);
			b[j] = scn.nextInt();
		}

		arrayAddtion(a, b, size);
	}

	private static void arrayAddtion(int[] one, int[] two, int length) {

		int[] c = new int[length];
		for (int k = 0; k < length; k++) {
			c[k] = one[k] + two[k];
			System.out.println(c[k]);
		}
	}
}
