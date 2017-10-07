package org.clayton;

import java.util.Scanner;

/**
 * Bijele.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class Bijele {
	
	/**
	 * The number of correct pieces
	 */
	private static final int[] CORRECT_PIECES = {1, 1, 2, 2, 2, 8};
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length; i++) {
			int n = Integer.parseInt(input[i]);
			sb.append((CORRECT_PIECES[i] - n) + (i == input.length - 1 ? "" : " "));
		}
		System.out.println(sb.toString());
		scanner.close();
	}

}
