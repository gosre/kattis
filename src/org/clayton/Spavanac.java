package org.clayton;

import java.util.Scanner;

/**
 * Spavanac.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class Spavanac {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int hour = Integer.parseInt(input[0]);
		int minutes = Integer.parseInt(input[1]);
		minutes -= 45;
		if (minutes < 0) {
			minutes = 60 + minutes;
			hour--;
		}
		if (hour == -1)
			hour = 23;
		System.out.println(hour + " " + minutes);
	}

}
