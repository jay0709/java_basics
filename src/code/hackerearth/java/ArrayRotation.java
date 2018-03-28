package code.hackerearth.java;

import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		int size = scn.nextInt();
		int rotation = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = scn.nextInt();
		leftRotate(arr, rotation, size);
		printArray(arr, size);
	}

	static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	static void leftRotate(int arr[], int d, int n) {
		int i, j, k, temp;
		for (i = 0; i < gcd(d, n); i++) {
			/* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while (1 != 0) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
