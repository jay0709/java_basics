/**
 * 
 */
package code.hackerearth.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jayabrata
 *
 */
public class SearchVowels {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		long length = longestVowel(s);
		System.out.println(length);
	}

	static int longestVowel(String str) {
		int count = 0, res = 0;
		char[] s = str.toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (isVowel(s[i]))
				count++;
			else {
				res = Math.max(res, count);
				count = 0;
			}

		}
		return res;
	}

	static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
}
