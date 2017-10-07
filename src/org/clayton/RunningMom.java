package org.clayton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * RunningMom.java
 * @author Clayton Williams
 * @date Sep 27, 2016
 */
public class RunningMom {
	
	/**
	 * The flights
	 */
	private static Map<String, ArrayList<String>> flights = new HashMap<String, ArrayList<String>>();
	
	/**
	 * The safe cities
	 */
	private static Map<String, Boolean> safe = new HashMap<String, Boolean>();
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//FileReader fileReader = new FileReader("C:/Users/cwilliams/Dropbox/workspace/Kattis/src/org/clayton/testdata/runningmom.txt");
			BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(bi.readLine(), 10);
			for (int i = 0; i < n; i++) {
				String pair = bi.readLine();
				int middle = pair.indexOf(' ');
				String from = pair.substring(0, middle);
				String to = pair.substring(middle + 1, pair.length());
				if (flights.containsKey(from))
					flights.get(from).add(to);
				else {
					ArrayList<String> list = new ArrayList<String>();
					list.add(to);
					flights.put(from, list);
				}				
			}		
			String city = null;
			while ((city = bi.readLine()) != null) {
				br.write(city + " " + (isSafe(city, city, new ArrayList<String>()) ? "safe" : "trapped"));
				br.newLine();
			}
			br.close();
			bi.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Checks if the city is safe to travel to (is there an escape)
	 * @param city
	 * @return
	 */
	private static boolean isSafe(String city, String start, ArrayList<String> visited) {
		if (safe.containsKey(city)) {
			return true;
		}
		if (visited.contains(city))
			return true;
		visited.add(city);
		if (flights.containsKey(city)) {
			for (String c : flights.get(city)) {
				if (c.equalsIgnoreCase(start) || isSafe(c, start, visited)) {
					safe.put(city, true);
					return true;
				}
			}
		}
		return false;
	}
}
