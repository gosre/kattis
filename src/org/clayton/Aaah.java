package org.clayton;

import java.util.Scanner;

/**
 * Aaah.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class Aaah {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] first = scanner.nextLine().toCharArray();
		char[] second = scanner.nextLine().toCharArray();
		System.out.println(first.length >= second.length ? "go" : "no");
	}

}
