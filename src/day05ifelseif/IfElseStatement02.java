package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement02 {
	
	/*Ask user to enter a charecter 
	 * 
	 * then check whether the character is alphat or not 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Please enter the character to check if it is in alphabet or not ");
		
		char ch=scan.next().charAt(0);
		
		//char ch=scan.next().toLowerCase().charAt(0); it could be also use 
		
		if( ( ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ) {
			
			System.out.println(ch+" is an alphabet !");
			
		}else {
			
			System.out.println(ch+" is not an alphabet");
		}
		
	}

}
