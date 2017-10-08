package org.kattis;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * TowerOfPowers2.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class TowerOfPowers2 {
	
	/**
	 * The output
	 */
	public static List<Entry> entries = new ArrayList<Entry>();
	
	/**
	 * Entry
	 * @author Clayton Williams
	 * @date Sep 27, 2016
	 */
	private static class Entry {
		
		/**
		 * The total of the input equation (or integer given)
		 */
		private long total = 0;
		
		/**
		 * The original input
		 */
		private String input;
		
		/**
		 * Entry
		 * @param input
		 * @param total
		 */
		public Entry(String input, long total) {
			this.input = input;
			this.total = total;
		}
	}
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("C:/Users/cwilliams/Dropbox/workspace/Kattis/src/org/clayton/nine/testdata/towerofpower.txt");
		try {
			Scanner scanner = new Scanner(file);
			int caseNumber = 1;
			while (scanner.hasNextLine()) {
				entries.clear();
				int m = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < m; i++) {
					String line = scanner.nextLine();
					String[] split = line.split("\\^");
					long total = 0;
					if (split.length == 1) {
						total = Integer.parseInt(split[0]);
					} else {
						for (int i2 = split.length - 1; i2 >= 0; i2--) {
							int n = Integer.parseInt(split[i2]);
							if (i2 == split.length - 1)
								total = n;
							else {
								total = (long) Math.pow(n, total);
							}
						}
					}
					entries.add(getInsertIndex(total), new Entry(line, total));
				}
				System.out.println("Case " + caseNumber + ":");
				for (Entry e : entries) {
					System.out.println(e.input);
				}
				caseNumber++;
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * Gets the last index of the given total
	 * @param total
	 * @return
	 */
	private static int getInsertIndex(long total) {
		int index = entries.size();
		boolean comparison = true;
		for (int i = 0; i < entries.size(); i++) {
			Entry e = entries.get(i);
			if (total < e.total && comparison) {
				index = i;
				comparison = false;
			}
			
			if (!comparison && total == e.total) {
				index = i;
			}
			
		}
		return index;
	}

}
