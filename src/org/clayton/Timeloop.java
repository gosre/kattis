package org.clayton;

import java.util.Scanner;

/**
 * Timeloop.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class Timeloop {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++)
			System.out.println((i + 1) + " Abracadabra");
		scanner.close();
	}

}
