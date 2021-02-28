package day02scanner;

import java.util.Scanner;

public class ScannerClass01 {

	public static void main(String[] args) {
		int a = 12;
		int b = 13;

		System.out.println(a + b);

		System.out.println(a * b);

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first integer");

		int num1 = scan.nextInt();

		System.out.println("Please enter the second integer");
		int num2 = scan.nextInt();
		System.out.println("Sum:" + num1 + num2);
		System.out.println("Product:" + num1 * num2);

		/*
		 * 1)Type a program which calculates the area and the perimeter of a circle
		 * whose radius is entered by user. (Use float) Hint 1: Take pi number as
		 * 3.14159 Hint 2: Area of a circle is 3.14159 x radius x radius Hint 3:
		 * Perimeter of a circle is 2 x 3.14159 x radius Hint 4: To get float, use
		 * nextFloat() Pinned by Suleyman Alptekin 6:18 2)Type a program which
		 * calculates the perimeter of a triangle whose Side lengths are entered by
		 * user. (Use byte) Hint 1: Perimeter of a triangle is a + b + c Hint 4: To get
		 * byte, use nextByte() Pinned by Suleyman Alptekin 6:18 3)Type a program which
		 * converts the mile to kilometer. Mile value will be entered by user. (Use
		 * double) Hint 1: km = mile x 1.6 Hint 2: To get double, use nextDouble()
		 * :eyes: 1
		 * 
		 * Pinned by Suleyman Alptekin 6:18 4)Type a program which converts the hours to
		 * seconds. Hours value will be entered by user. (Use long) Hint 1: second =
		 * hour x 60 x 60 Hint 2: To get long, use nextLong()
		 * 
		 * 
		 */
	}
}