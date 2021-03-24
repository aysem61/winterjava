package day27exceptions;

import java.util.Scanner;

public class Exc03 {

	/*
	 * Display an array to user Ask the user to select any element by using order
	 * number Print the selected element on the console Your code should not be
	 * blocked for any order number
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" select any element by using order number  from given an array  {a,c,e,k}");

		int orderNum = scan.nextInt();

		String str[] = { "a", "c", "e", "k" };
		System.out.println(getElement(str, orderNum));
		
		scan.close();

	}

	public static String getElement(String str[], int orderNum) { // Exeption handling ...hatalara karsi programi koruma altina alma 

		String el = "";

		try {
			
			el = str[orderNum - 1]; // subtruckting order number
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(" you entered a non- existing order number ...");
		}

		return el;

	}

}
