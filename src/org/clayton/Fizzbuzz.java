package org.clayton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Fizzbuzz {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int x = input[0], y = input[1], n = input[2];
			for (int i = 1; i <= n; i++) {
				StringBuilder sb = new StringBuilder();
				if (i % x == 0)
					sb.append("Fizz");
				
				if (i % y == 0)
					sb.append("Buzz");
				
				if (sb.length() == 0)
					sb.append(i);
				
				bw.write(sb.toString());
				bw.newLine();
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
