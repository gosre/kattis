package org.kattis;

import java.io.File;
import java.util.Scanner;

/**
 * TowerofPowers.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class TowerofPowers {

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File(Constants.DESKTOP_TEST_DATA + "towerofpower.txt");
		try {
			Scanner scanner = new Scanner(file);
			int caseNumber = 1;
			while (scanner.hasNextLine()) {
				int m = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < m; i++) {
					String line = scanner.nextLine();
					String[] split = line.split("\\^");				
				}
				//PRINT test case results
				caseNumber++;
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
