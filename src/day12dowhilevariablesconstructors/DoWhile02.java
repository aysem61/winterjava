package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her first name If the initial is lower case print a
		 * message like "Make the initial upper case" If the initial is upper case print
		 * a message like "You did it right" *
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		
		String fn = "";

		do {
			fn = scan.next();
//			
//			if (fn.charAt(0) >= 'A' && fn.charAt(0) <= 'Z') {
//				
//				System.out.println("You did it right");
//				
//			} else {
//				
//				System.out.println("Make the initial upper case");
//			}
			
			System.out.println(" can dedim sana  ");
			

		} while (!(fn.charAt(0) >= 'A' && fn.charAt(0) <= 'Z'));
		
		System.out.println(" while den sonra ki son durum ");

		scan.close();

	}

}
