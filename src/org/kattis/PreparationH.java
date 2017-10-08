package org.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class PreparationH {
	
	private static class Pair {
		
		private int start, end;
		
		public Pair(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		private boolean overlaps(int startX, int endX) {
			return (start < this.end && startX > this.start);
		}
		
		private int getLength() {
			return end - start;
		}
	}
	
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int artists = Integer.parseInt(br.readLine());
			ArrayList<Pair> mainArray = new ArrayList<Pair>();
			HashMap<Pair, ArrayList<Pair>> map = new HashMap<Pair, ArrayList<Pair>>();
			for (int i = 0; i < artists; i++) {
				String[] line = br.readLine().split("0");
				int start = Integer.parseInt(line[0]);
				int end = Integer.parseInt(line[1]);
				Pair pair = new Pair(start, end);
				if (!map.containsKey(pair)) {
					map.put(pair, new ArrayList<Pair>());
				}
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
