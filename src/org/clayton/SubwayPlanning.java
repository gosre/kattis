package org.clayton;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * SubwayPlanning.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class SubwayPlanning {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileReader fi = new FileReader(Constants.DESKTOP_TEST_DATA + "subwayplanning.txt");
			BufferedReader bi = new BufferedReader(fi);
			int dataSets = Integer.parseInt(bi.readLine());
			for (int i = 0; i < dataSets; i++) {
				String[] str = bi.readLine().split(" ");
				int n = Integer.parseInt(str[0], 10), d = Integer.parseInt(str[1], 10);
				for (int i2 = 0; i2 < n; i2++) {
					String[] pair = bi.readLine().split(" ");
					int x = Integer.parseInt(str[0], 10), y = Integer.parseInt(str[1], 10);
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
