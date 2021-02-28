package day15arrays;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {

		int a1[] = { 2, 9, 3, 7 };
		int a2[] = { 2, 9, 7, 3 };

		System.out.println(Arrays.equals(a1, a2));// false

		// How to check it two arrays have same elements or not?

		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));// [2, 3, 7, 9]

		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));// [2, 3, 7, 9]

		System.out.println(Arrays.equals(a1, a2));//true

	}

}
