package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {

	public static void main(String[] args) {
		/*
		 * Type a program which asks user to enter his/her first name and last name,
		 * 
		 * then print it on the console.
		 * 
		 */

		OrderOfOperations01 ye = new OrderOfOperations01();

		Scanner scan = new Scanner(System.in);
		System.out.println("enter your first name and last name");

		String fullName = scan.nextLine();

		System.out.println("Your full name is" + fullName);

		System.out.println("Enter your kid's first name");

		String kidFirstName = scan.next();

		System.out.println("Kid first name is " + kidFirstName);

		// if you wanna get a String data from user,you can use next()method as well
		// but next() is used to get just the first word.
		// Foe example user entered "ALI CAN

		ScannerClass03 ab = new ScannerClass03();

		System.out.println(ab.isim + " 03 den gelen deger ");

	}
}
