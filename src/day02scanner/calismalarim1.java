package day02scanner;

import java.util.Scanner;

public class calismalarim1 {

	public static void main(String[] args) {

		int num1 = 5;
		System.out.println("Before increment :" + num1);// 5
		// AFTER INCREMENT
		// 1.wAY:
		num1 = num1 + 2;
		System.out.println("After  increment:" + num1);// 7

		// 2.Way:
		num1 += 3;
		System.out.println("After increment:" + num1);// 10

		// 3.Way:
		num1++;
		System.out.println("After inrement:" + num1);// 11

		// AFTER MULTIPLICATION INCREMENT
		num1 = num1 * 2;
		System.out.println("After multiplication increment :" + num1);// 22

		num1 *= 2;
		System.out.println("After multiplication increment : " + num1);// 44

		// AFTER DECREMENT
		// 1.Way:
		num1 = num1 - 2;
		System.out.println("After decrement: " + num1);// 42

		// 2.Way:
		num1 -= 10;
		System.out.println("After decrement:" + num1);// 32

		// 3.Way:
		num1--;
		System.out.println("After decrement: " + num1);// 31
		// DIVISION
		num1 = num1 / 2;
		System.out.println("After division decrement:" + num1);// 15

		num1 /= 3;
		System.out.println("After division decrement;" + num1);// 5

		// FIRST NAME - LAST NAME
		Scanner scan = new Scanner(System.in);

		System.out.println("enter your first name and last name");

		String fullName = scan.nextLine();
		System.out.println("Your full name is " + fullName);

		System.out.println("Your kid's first name");
		String kidFirstName = scan.next();
		System.out.println("Kid first name is " + kidFirstName);

	}
}