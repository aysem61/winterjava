package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class Q01 {

	/*
	 * Ask user to enter an integer and type a program:
	 *  For numbers which are a
	 * multiple of 3, print Rock instead of number,
	 *  and for numbers which are a
	 * multiple of 5, print Star instead of the number.
	 *  For numbers which are a
	 * multiple by of both 3 and 5, print RockStar instead of the number. EXAMPLE:
	 * INPUT : 1 2 3 4 ..... 30 OUTPUT : 1 2 Rock 4 Star Rock 7 8 Rock Star 11 Rock
	 * 13 14 RockStar
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter an integer please ");
		
		int num=s.nextInt();
		
		for(int i=0; i<=num; i++) {
			
			if( i%3==0 && i%5==0) {
				System.out.println("Rockstar");
			}else if (i%3==0) {
				System.out.println("Rock");
			}else if (i%5==0) {
				System.out.println("Star");
			}else {
				System.out.println(i+" hic bir sey ");
			}
		}
		
		soru9();
	}

	private static void soru9() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String password = "";

		do {

		System.out.println("Enter your password");

		password = scan.nextLine();

		if(password.equals("password")) {

		System.out.println("true");

		}else {

		System.out.println("false");

		}

		}while(!(password.equals("password")));
	}

}
