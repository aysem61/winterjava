package day11whileloopdowhile;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter a number
		 If the number user entered is less than 10 print �Won!� on the console
		 Otherwise, ask user to enter a number again.
		 */
		
		
		// do while loop using generally in a game;
		
		Scanner scan=new Scanner(System.in);
		int num=0;
		
		do {
			System.out.println("Enter an integer");
			
			 num=scan.nextInt();
			 
		}while(num>9);
			
			System.out.println("won!");
			
			scan.close();
		
	}

			
}
