package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {
	/*
	 * User will enter his/her first name you will print the first character on the
	 * console. Use will enter his/her last name you will print the first character
	 * on the console.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first name");

		char firstNameInitial = scan.next().charAt(0);

		System.out.println("Initial of the first name is:   " + firstNameInitial);

		System.out.println("Enter your last name");
		char lastNameInitial = scan.next().charAt(0);
		System.out.println("Initial of the last name is:" + lastNameInitial);

		/*
		 * if you use mathematical operations for cahrs,Java uses the
		 * 
		 */

		System.out.println(firstNameInitial + lastNameInitial);

	}

}
