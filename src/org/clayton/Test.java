package org.clayton;

public class Test {
	
	public static void main(String[] args) {
		int[] data = new int[] {
				0, 0, 0, 0,
				1, 1, 1, 1,
				6, 2, 4, 8,
				1, 3, 9, 7,
				6, 4, 6, 4,
				5, 5, 5, 5,
				6, 6, 6, 6,
				1, 7, 9, 3,
				6, 8, 4, 2,
				1, 9, 1, 9,
		};
		
		int base = 81;
		int exp = 2;
		int n = (base % 10) * 4 + (exp % 4);
		System.out.println(data[n]);
	}

}
