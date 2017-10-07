package org.clayton;

import java.util.Scanner;

/**
 * Trik.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class Trik {
	
	/**
	 * The cups with the ball starting at leftmost
	 */
	private static int[] cups = new int[] {1, 0, 0};

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] characters = scanner.nextLine().toCharArray();
		for(char c : characters) {
			switch (c) {
				case 'A':
					swap(0, 1);
					break;
				case 'B':
					swap(1, 2);
					break;
				case 'C':
					swap(0, 2);
					break;
			}
		}
		for (int i = 0; i < cups.length; i++) {
			if (cups[i] == 1)
				System.out.println(i + 1);
		}
		scanner.close();
	}
	
	/**
	 * Swaps two cups
	 * @param i1
	 * @param i2
	 */
	private static void swap(int i1, int i2) {
		int temp = cups[i1];
		cups[i1] = cups[i2];
		cups[i2] = temp;
	}
	
}
