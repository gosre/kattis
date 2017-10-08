package org.clayton;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoStones {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int stones = Integer.parseInt(br.readLine(), 10);
			System.out.println(stones % 2 == 0 ? "Bob" : "Alice");		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}

}
