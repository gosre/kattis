package org.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Bits.java
 * @author Clayton Williams
 * @date Oct 29, 2016
 */
public class Bits {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
			int cases = Integer.parseInt(bi.readLine(), 10);
			for (int i = 0; i < cases; i++) {
				int maxbits = 0;
				String cur = "";
				String input = bi.readLine();
				for (char c : input.toCharArray()) {
					cur += c;
					String binary = Integer.toBinaryString(Integer.parseInt(cur));
					maxbits = Math.max(maxbits, binary.replaceAll("0", "").length());
				}
				System.out.println(maxbits);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
