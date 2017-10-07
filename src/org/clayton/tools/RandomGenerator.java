package org.clayton.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class RandomGenerator {
	
	public static void main(String[] args) {
		try {
			for (int amount = 0; amount < 1; amount++) {
				File file = new File("C:/Users/cwilliams/Desktop/Test/" +(amount + 1) + ".test");	
				if (!file.exists()) {
					file.createNewFile();
				}
				BufferedWriter bw  = new BufferedWriter(new FileWriter("C:/Users/cwilliams/Desktop/Test/" +(amount + 1) + ".test"));
				int n = 100_000_000;
				bw.append("" + n);
				bw.newLine();
				for (int i = 0; i < n; i++) {
					long start = (long) random(0, Math.pow(10, 18));
					long end = (long) (start + (random(0, Math.pow(10, 18) - start)));
					bw.append(start + " " + end);
					bw.newLine();
				}
				bw.flush();
				bw.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method used to ease the access of the random class.
	 * @param min the minium random value.
	 * @param max the maximum random value.
	 * @return the value as an {@link Double}.
	 */
	public static final double random(double min, double max) {
		final double n = Math.abs(max - min);
		return Math.min(min, max) + (n == 0 ? 0 : new Random().nextInt((int) n));
	}

}
