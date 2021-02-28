package practice01;

import java.util.Scanner;

public class P_Q4 {

	public static void main(String[] args) {

		/*
		 * Type the program which asks the user to enter 10 character code to be able to
		 * create a new account. This code should start with a capital letter. If the
		 * codes is valid, it prints "You can create a new account" Otherwise, it prints
		 * "Please enter a valid code"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("PLEASE ENETER THE CHARACTER");
		String psw = scan.next().toUpperCase();

		if (psw.length() >= 10) {
			System.out.println("You can create a new account");
		} else {
			System.out.println("Please enter a valid code");
		}

		/*
		 * Write a code using ternary: Create int variable : price Create string
		 * variable : decision If the price = $10 Print “it's cheap” If price is 10-$20
		 * print “it's ok” Otherwise “it's expensive”. ORNEK: INPUT : price= 12 OUTPUT :
		 * it's ok INPUT : price= 10 OUTPUT : it's cheap INPUT : price= 23 OUTPUT : it's
		 * expensive
		 */

		System.out.println("please ente your price ");

		int price = scan.nextInt();

		String decision = "";

		decision = price < 10 ? "its cheap" : (price >= 10 && price <= 20 ? " it is ok " : "its expensive ");

		System.out.println(decision + " so so");

	}

}
