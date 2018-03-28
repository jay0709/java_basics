package code.hackerearth.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FoundMinMaxSum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		findMaxMinSum(arr, size);
		int element = scn.nextInt();
		int index = findElement(arr, element);
		System.out.println(element + " Found at index: " + index);

	}

	private static int findElement(int[] arr, int element) {
		List<Integer> array = new ArrayList<>(arr.length);
		for (int i : arr) {
			array.add(Integer.valueOf(i));
		}
		return array.indexOf(element);
	}

	private static void findMaxMinSum(int[] arr, int size) {
		int maxSum = 0, minSum = 0, sum = 0;
		for (int j = 0; j < size; j++) {
			sum = IntStream.of(arr).sum() - arr[j];
			if (maxSum < sum) {
				maxSum = sum;
				minSum = sum;
			} else if (minSum > sum)
				minSum = sum;
		}

		System.out.println(minSum + " " + maxSum);
	}

}
