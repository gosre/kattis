package org.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ants.java
 * @author Clayton Williams
 * @date Oct 29, 2016
 *
 */
public class Ants {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
			int cases = Integer.parseInt(bi.readLine(), 10);
			for (int i = 0; i < cases; i++) {
				String[] split = bi.readLine().split(" ");
				int poleLength = Integer.parseInt(split[0], 10);
				int ants = Integer.parseInt(split[1], 10);
				List<Integer> positions = new ArrayList<Integer>();
				while (ants > 0) {
					String[] splitPos = bi.readLine().split(" ");
					for (int j = 0; j < splitPos.length; j++) {
						positions.add(Integer.parseInt(splitPos[j]));
						ants--;
					}
				}
				Collections.sort(positions);
				
				double middle = poleLength / 2;
				int closestIndex = 0;
				for (int ai = 1; ai < positions.size(); ai++) {
					double first = Math.abs(positions.get(closestIndex) - middle);
					double second = Math.abs(positions.get(ai) - middle);
					if (second < first)
						closestIndex = ai;
				}
				
				int shortest = poleLength - positions.get(closestIndex);
				int first = positions.get(0);
				int second = poleLength - positions.get(positions.size() - 1);
				int greatest = (first < second ? (poleLength - first) : (second));
				System.out.println(shortest + " " + greatest);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
