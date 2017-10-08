package org.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;

//UNFINISHED
public class TenKindsOfPeople {
	
	private static BitSet[] data;
	
	private static Integer[][] groupMappings;
	
	//paths array
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] meta = br.readLine().split(" ");
			final int rowCount = Integer.parseInt(meta[0], 10);
			final int colCount = Integer.parseInt(meta[1], 10);
			data = new BitSet[rowCount];
			groupMappings = new Integer[rowCount][colCount];
			for (int i = 0; i < rowCount; i++) {
				String colData = br.readLine();
				data[i] = BitSet.valueOf(colData.getBytes());
			}			
			final int numTests = Integer.parseInt(br.readLine(), 10);
			//calculate paths
			for (int row = 0; row < rowCount; row++) {
				for (int column = 0; column < colCount; column++) {
					//only if it hasn't already been found
					if (groupMappings[row][column] == null) {
						findPath(row, column);
						
						
					}
				}
			}
			//TODO do test cases
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void findPath(int row, int column) {
		int bit = getBit(row, column);
		
	}
	
	public static int getBit(int row, int column) {
		return data[row].get(column) ? 1 : 0;
	}
	
	public static int getHash(int row, int column) {	
		return (row << 10) | column;
	}

}
