package org.kattis;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * Cetiri.java
 * @author Clayton Williams
 * @date Sep 29, 2016
 */
public class Cetiri {
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String... args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] line = br.readLine().split(" ");
			int[] numbers = new int[line.length];
			for (int i = 0; i < line.length; i++) {
				numbers[i] = Integer.parseInt(line[i], 10);
			}
			numbers = insertionSort(numbers);
			int first = numbers[1] - numbers[0];
			int second = numbers[2] - numbers[1];
			String missing = "" + (first > second ? numbers[0] + (first / 2) : first == second ? numbers[2] + second : numbers[1] + (second / 2));
			OutputStream out = new BufferedOutputStream(System.out);
			out.write(missing.getBytes());
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Insertion Sort
	 * @param array
	 * @return
	 */
	private static int[] insertionSort(int[] array) {
		for (int j, i = 1; i < array.length; i++) {
			int temp = array[i];
			for (j = i - 1; j >=0 && array[j] > temp; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
		return array;
	}

}
