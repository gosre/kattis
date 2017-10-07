package org.clayton;

import java.util.Scanner;

/**
 * Pet.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class Pet {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contestant = -1;
		int score = -1;
		for (int i = 0; i < 5; i++) {
			String[] in = scanner.nextLine().split(" ");
			int total = 0;
			for (int i2 = 0; i2 < in.length; i2++) {
				total += Integer.parseInt(in[i2], 10);
			}
			if (total > score) {
				score = total;
				contestant = i + 1;
			}
		}
		System.out.println(contestant + " " + score);
		scanner.close();
	}

}
