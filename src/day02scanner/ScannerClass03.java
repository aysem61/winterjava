package day02scanner;

import java.util.Scanner;

public class ScannerClass03 {

	static String isim = "iskender";

	private int yas = 12;

	public boolean dogruMu = false;

	public static void main(String[] args) {

		/*
		 * Type a program which calculates the area and
		 * 
		 * the perimeter of a rectangle whose length and with are entered by user. Hint
		 * 1: Area of a rectangle is width x length Hint 2: Perimeter of a rectangle is
		 * 2x (widt h + length)
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please,enter the length of the rectangle");
		double length = scan.nextDouble();

		System.out.println("Please,enter the width of the rectangle");
		double width = scan.nextDouble();

		System.out.println("Area:" + width * length);
		System.out.println("Perimeter:" + 2 * (width + length));

	}

}
