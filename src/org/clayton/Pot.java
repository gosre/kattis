package org.clayton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pot {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int addends = Integer.parseInt(br.readLine(), 10);
			int total = 0;
			for (int i = 0; i < addends; i++) {
				int unformatted = Integer.parseInt(br.readLine(), 10);
				int power = 0;
				if (unformatted >= 10) {
					power = unformatted % 10;
					unformatted = (int) Math.floor(unformatted / 10);
				}
				total += Math.pow(unformatted, power);
			}
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write("" + total);
			
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
