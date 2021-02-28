package day11whileloopdowhile;

import java.util.Scanner;

public class DoWhile0202Tekrar {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter a number
		 If the number user entered is less than 10 print “Won!” on the console
		 Otherwise, ask user to enter a number again.
		 */
		
		
		// do while loop using generally in a game;
		
		
		Scanner s=new Scanner(System.in);
		
		int num=0;
		
		do {
		System.out.println("Please enter a number");
		
		num=s.nextInt();
			
		}while(num>10);
		
		System.out.println(" your won ");

	}

}
