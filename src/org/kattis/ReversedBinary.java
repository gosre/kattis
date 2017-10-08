package org.kattis;

import java.util.Scanner;

/**
 * ReversedBinary.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class ReversedBinary {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine(), 10);
		String binary = Integer.toBinaryString(n);
		StringBuilder sb = new StringBuilder();
		for (int i = binary.length() - 1; i >= 0; i--) {
			char c = binary.charAt(i);
			sb.append(c);
		}
		System.out.println(Integer.parseInt(sb.toString(), 2));
		
	}

}
