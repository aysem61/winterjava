package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class Q02 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ilkYontem();
		
		System.out.println(" ikinci yontem ");
		
		String password = "";

		do {

			System.out.println("Enter your password");

			password = scan.nextLine();

			if (!(password.equals("password"))) {

				System.out.println("false");

			}

		} while (!(password.equals("password")));

		System.out.println("true");

	}

	
	private static void ilkYontem() {
		
		System.out.println("Enter second method ... your password");

		String password = scan.nextLine();

		
		while(!(password.equals("password"))) {

			System.out.println("false");

			System.out.println("Enter your password");

			password = scan.nextLine();	// infinite sonsuz dongu ye girmemek icin ve user den yeni sifre istemek icin 

		}



		System.out.println("true");
	}

}
