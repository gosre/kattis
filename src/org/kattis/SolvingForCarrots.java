package org.kattis;

import java.util.Scanner;

/**
 * SolvingForCarrots.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class SolvingForCarrots {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] in = scanner.nextLine().split(" ");
		int n = Integer.parseInt(in[0]);
		int huffle = Integer.parseInt(in[1]);
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
		}
		System.out.println(huffle);
		scanner.close();
	}

}
