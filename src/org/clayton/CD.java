package org.clayton;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;

/**
 * CD.java
 * 
 * @author Clayton Williams
 * @date Oct 29, 2016
 *
 */
public class CD {

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		try {

			while (true) {
				String[] inputs = bi.readLine().split(" ");
				int jack = Integer.parseInt(inputs[0]);
				int jill = Integer.parseInt(inputs[1]);

				if (jack == 0 && jill == 0) {
					break;
				}

				BitSet jackcds = new BitSet();
				BitSet jillcds = new BitSet();

				for (int i = 0; i < jack; i++) {
					jackcds.flip(Integer.parseInt(bi.readLine()));
				}

				for (int i = 0; i < jill; i++) {
					jillcds.flip(Integer.parseInt(bi.readLine()));
				}
				jackcds.and(jillcds);
				System.out.println(jackcds.cardinality());
			}
		} catch (Exception e) {
		}
	}

}
