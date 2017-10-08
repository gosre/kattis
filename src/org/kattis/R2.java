package org.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class R2 {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] meta = br.readLine().split(" ");
			int r1 = Integer.parseInt(meta[0], 10);
			int s = Integer.parseInt(meta[1], 10);
			System.out.println(s + (s - r1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
