package day02scanner;

import java.util.Scanner;

public class ScannerClass04 {

	/*
	 * Type a program which calculates the volume of a rectangular prism whose
	 * length, with, and height are entered by user. Hint 1: Volume of a rectangular
	 * prism is width x length x height
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("Please enter the lenght , with and height of rectangular prism");
		Scanner scan = new Scanner(System.in);

		double lenth = scan.nextDouble();

		double with = scan.nextDouble();

		double height = scan.nextDouble();

		System.out.println(lenth * with * height + " result of rectangula prism");

	}

}
