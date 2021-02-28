
package day06nestedifternaryswitchStringmethods;

import java.util.Scanner;

public class SwitchStatement02 {

	public static void main(String[] args) {
		/*If the user pressed 1, 2, 3 
		 * the program will print the number that is pressed; 
          otherwise, program will print "Not allowed".
		 * 
		 */

		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the number :");
		
		int a=s.nextInt();
		
		switch(a) {
		case 1:
			System.out.println(" one");
			 break;
		case 2:
			System.out.println(" two");
			break;
		case 3:
			System.out.println(" three");
			break;
		default	:
			System.out.println(" not allowed");
		
		}
		
		
	}

}
