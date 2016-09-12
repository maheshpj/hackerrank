package com.hackerrank.code;

import java.util.Scanner;

public class ArrayLeftRotation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int shift = in.nextInt();

		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < count; i++, shift++) {
			System.out.println(arr[shift]);
			if (shift == arr.length - 1)
				shift = -1;
		}
		in.close();
	}
}
