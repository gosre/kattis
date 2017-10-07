package org.clayton;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CatMouse { 
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cases = Integer.parseInt(br.readLine(), 10);
			for (int i = 0; i < cases; i++) {
				String[] line = br.readLine().split(" ");
				int radius = Integer.parseInt(line[0], 10);
				int tomSpeed = Integer.parseInt(line[1], 10);
				int jerrySpeed = Integer.parseInt(line[2], 10);
				
				double circumference = 2 * Math.PI * radius;
				double halfCircumference = circumference / 2;
				
				double tom = radius / tomSpeed;
				double jerry = halfCircumference / jerrySpeed;
				
				System.out.println("circum=" + circumference + " circum/2 =" + halfCircumference + " tom=" + tom + " jerry=" + jerry);
				
				System.out.println(tom < jerry ? "YES" : "NO");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
