package day09methodoverloadingloops;

public class ForLoop01 {

	public static void main(String[] args) {
		System.out.println("....................................................................");
		printHello();
		System.out.println("*******************************************************************");
		printInt();
		System.out.println("**********************************************************************");
		printIntDesc();
	}

	/*
	 * Type code to print "Hello World!" 10 times on the console..
	 * 
	 * 
	 */
	public static void printHello() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello world!");

		}
	}
	/*
	 * Type code to print integers from 5 to 12 on to console.
	 * 
	 */

	public static void printInt() {
		
		for (int i = 5; i < 13; i++) {
			
			System.out.println(i+" aysenin ciktisi");
		}
		
		
	}
	
	/*Type code to print integers from  12 to 5 on the console
	 * 
	 */
	
	public static void printIntDesc() {
		
		for(int i=12; i>4; i--) {
			
			System.out.println(i+" ciktilar ");
			
			
		}
		
	}
	
}