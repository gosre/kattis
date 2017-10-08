package org.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Modulo.java
 * @author Clayton Williams
 * @date Sep 28, 2016
 *
 */
public class Modulo {
	
	/**
	 * The unique values
	 */
	private static Map<Integer, Integer> unique = new HashMap<Integer, Integer>();
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//FileReader fi = new FileReader(Constants.TEST_DATA + "modulo.txt");
			BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < 10; i++) {
				int n = Integer.parseInt(bi.readLine());
				int r = n % 42;
				unique.put(r, 1);
			}
			System.out.println(unique.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
