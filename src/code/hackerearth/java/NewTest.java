package code.hackerearth.java;

import java.util.ArrayList;
import java.util.Scanner;

public class NewTest {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length
		// 'k'
		// 'largest' must be the lexicographically largest substring of length
		// 'k'
		ArrayList<String> list = new ArrayList<String>();

		for (int a = 0; a < s.length() - (k - 1); a++)
			list.add(s.substring(a, a + k));

		for (int i = 0; i < s.length() - (k - 1); ++i) {
			for (int j = i + 1; j < s.length(); ++j) {
				if (list.get(i).compareTo(list.get(i)) > 0) {

					// swap words[i] with words[j[
					String temp = list.get(i);
					list.add(i, list.get(j));
					list.add(j, temp);
				}
			}
		}
		return smallest + "\n" + largest;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
