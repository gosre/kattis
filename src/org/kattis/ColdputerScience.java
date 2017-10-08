package org.kattis;

import java.util.Scanner;

/**
 * ColdputerScience.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class ColdputerScience {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		String[] numbers = scanner.nextLine().split(" ");
		int negative = 0;
		for (int i = 0; i < numbers.length; i++) {
			int temp = Integer.parseInt(numbers[i]);
			if (temp < 0)
				negative++;
		}
		System.out.println(negative);
		scanner.close();
	}

}
