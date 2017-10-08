package org.kattis;

import java.util.Scanner;

/**
 * Oddities.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class Oddities {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine(), 10);
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(scanner.nextLine(), 10);
			System.out.println(num + " is " + (num % 2 == 0 ? "even" : "odd"));
		}
		scanner.close();
	}

}
