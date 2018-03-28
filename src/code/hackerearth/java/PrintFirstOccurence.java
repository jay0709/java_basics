/**
 * 
 */
package code.hackerearth.java;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Jayabrata
 *
 */
public class PrintFirstOccurence {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int inputs = scn.nextInt();
		int i = 0;
		for (; i < inputs; i++) {
			String one = scn.next();
			if (one.length() > 0)
				printFirstOccurence(one);
		}
		scn.close();
	}

	private static void printFirstOccurence(String one) {
		String two = "";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < one.length(); i++) {
			if (hm.containsKey(one.charAt(i)))
				hm.put(one.charAt(i), hm.get(one.charAt(i)) + 1);
			else
				hm.put(one.charAt(i), 1);
		}
		for (Character key : hm.keySet())
			two = two + key;
		System.out.println(two);
	}

}
