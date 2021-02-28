package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement06 {

	/*
	 * Ask user to enter annual salary, if the salary is more than or equal to
	 * $80.000 output will be “I accept the offer”, if the salary is between $60.000
	 * and $80.000 out put will be “I negotiate to increase”, otherwise output will
	 * be “I do not accept the offer.”
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the offer..");
		double salary = scan.nextDouble();

		if (salary < 0) {
			System.out.println("Are you kiding me!..");
		} else if (salary < 60000) {
			System.out.println("I do not accept the offer.");
		} else if (salary <= 80000) {
			System.out.println("I negotiate to increase");
		} else {
			System.out.println("I accept the offer..");
		}

		deneme();
		
		scan.close();
	}

	private static void deneme() {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the offer second time ..");
		double sa = scan.nextDouble();
		
		
		if (sa>=80000) {
			System.out.println("I accept the offer ");
		}else if (sa<80000 && sa>=60000) {
			System.out.println( "Ill negotiate to increase ");
		}else {
			System.out.println(" i dont accept the offer ");
		}
		
		scan.close();
		
	}

}
