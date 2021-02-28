package day07stringmethods;

import java.util.Scanner;

public class Substring01 {

	public static void main(String[] args) {
		/*
		 * A part of a String is called substring substring() of String class is used
		 * for getting a substring from the String We use substring() to get a part of a
		 * String by using indexes
		 */

		String s1 = "Java is Java";

		System.out.println(s1.substring(5));// is Java
		// index is inclusive
		System.out.println(s1.substring(7));// Java
		// s1.substring(0) and System.out.println (s1) returns the same String
		System.out.println(s1.substring(0));// Java is Java
		// how can i get the last character
		System.out.println(s1.substring(s1.length() - 1));// a
		System.out.println(s1.substring(11));// a
		System.out.println(s1.substring(12));// nothing
		System.out.println(s1.substring(12));// error

		/*
		 * WE have two type of error messages: 1) While we type our codes we get
		 * "red underline"this is called "Compile Time Error 2)While we type our codes
		 * we don't get any red underline but after running our codes we get messages on
		 * the console,it is "Run Time Error"
		 */
		
		/*
        Ask user to enter a String 
        If the first and the last character of the String are same
        print "Wooow!" otherwise, print "Hmmmm!" on the console
    */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a String");
		String str5=scan.nextLine();
		String first=str5.substring(0,1);
		String last=str5.substring(str5.length()-1);
		
		if(first.equals(last)) {
			System.out.println("Woow");
		}else {
			System.out.println("Hmmmmm");
		}
		
		
		String s2="Java is OOP languege";
		System.out.println(s2.substring(0,3));//Jav
		System.out.println(s2.substring(0,14));// Java is OOP la
		//how can iIget just i?
		System.out.println(s2.substring(5,6));//i
		
		
		
	}

}
