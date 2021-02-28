package day06nestedifternaryswitchStringmethods;

import java.util.Scanner;

public class Ternary04 {

	/*
	 * Ask user to enter an integer. If the integer is negative return
	 * "This integer is negative" If the integer is not negative return its square.
	 * Use ternary...
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer...");
		int a = scan.nextInt();

		System.out.println(a < 0 ? "This integer is negative" : a * a);

		/*
		 * /* Ask user to enter an integer If the integer is not negative then check if
		 * it is less than 10 then return "The integer is digit" If the integer is
		 * negative return "Negatives cannot be a digit" Use nested ternary...
		 */

		System.out.println("Please enter an integer");
		int b = scan.nextInt();

		String result = (b >= 0) ? (b < 10 ? "The integer is digit" : "The integer is not digit")
				: ("Negatives cannot be a digit");
		System.out.println(result);
	}

}
