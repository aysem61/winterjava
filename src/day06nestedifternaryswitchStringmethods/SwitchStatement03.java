package day06nestedifternaryswitchStringmethods;

import java.util.Scanner;

public class SwitchStatement03 {

	/*
	 * Ask user ta enter one of the ‘U’, ’S’, and ‘A’. Then type a program by using
	 * “switch statement” to print “United” for ‘U’ ”States” for ’S’, and “America”
	 * for ‘A’
	 */
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("enter a character");
		char ch = scan.next().charAt(0);

		switch (ch) {
		case 'U':
		case 'u':
			System.out.println("United");
		case 'S':
		case 's':
			System.out.println("States");
		case 'A':
		case 'a':
			System.out.println("America");
			break;
		default:
			System.out.println("Enter a valid character");
		}

	//	scan.close();
		
		soru1();
		
		
	}

	
	private static void soru1() {
		
		System.out.println("bir harf giriniz ");
		
		char answer=scan.next().charAt(0);
		
		
		//if(answer=='C')
			
		switch(answer) {
		 
		case 'A':
			System.out.println(true);
			break;
			
		case 'B':
			System.out.println(true);
			break;
		case 'C':
			System.out.println(true);
			break;
		default:
			System.out.println(false+" cevabinizi tekrar giriniz ");
			
		
		}
		
		
	}
	
	

}
