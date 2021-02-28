package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {

	/*
	 * Ask use to enter his/her full name Then ask user to enter his/her spouse's
	 * first name Then ask unser to enter his/her adress Then print them all on the
	 * console.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your full name");

		String fullName = scan.nextLine();

		System.out.println("Enter your first name");
		// After using nextLine(),if you use any other method
		// type "scan.nextLine():

		String spouseFirstName = scan.next();

		System.out.println("Enter your address");
		String adress = scan.next();

		System.out.println("User name:" + fullName);
		System.out.println("Spouse name:" + spouseFirstName);
		System.out.println("Adress:" + adress);

	}

}
