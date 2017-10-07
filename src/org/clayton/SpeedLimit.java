package org.clayton;

import java.util.Scanner;

/**
 * SpeedLimit.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class SpeedLimit {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			int n = Integer.parseInt(scanner.nextLine());
			if (n != -1) {
				int previousElapsed = 0;
				int miles = 0;
				for (int i = 0; i < n; i++) {
					String[] values = scanner.nextLine().split(" ");
					int speed = Integer.parseInt(values[0]);
					int elapsed = Integer.parseInt(values[1]);
					miles += (speed * (elapsed - (i == 0 ? 0 : previousElapsed)));
					previousElapsed = elapsed;
				}
				System.out.println(miles + " miles");
				
				
			} else {
				break;
			}
		}
		scanner.close();
	}

}
