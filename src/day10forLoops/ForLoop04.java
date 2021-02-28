package day10forLoops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		productOfInt();

	}
	/*INTERWIEV QUESTION
	 * Ask user to enter begining and ending values. Type code to calculate
	 * multiplication of the intgers from the beginning to ending values.
	 * That question can be asked like
	 * Type code to calcualte the factorial of given number
	 */

	public static void productOfInt() {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the starting integer value");
		int s=scan.nextInt();
		
		System.out.println("nter the ending integer value\")");
		int e=scan.nextInt();
		
		int product=1;
		
		for(int i=s; i<=e; i++) {
			product=product*i;
		}
		System.out.println(product);
		
		scan.close();
	}
}
