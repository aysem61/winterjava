package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
	
		/*/*
		 * Ask user to enter an integer, if integr is even print "Even" on the console.
		 * if integer is odd print " odd" on the console.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println(" Please enter the number");
		
		int num=scan.nextInt();
		
		if(num%2==0) {
			System.out.println("Even");
			
		}else {
			System.out.println("Odd");
		}

		yasliMi();
		
	}

	private static void yasliMi() {
		
		/*Ask user to enter his/her age.
		 * If the age is between 18 and 65 then output will be "You should work",
		 * else output will be "No need to work"
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Please enter your age");
	
		int age=scan.nextInt();
		
		if(age<0) {
			System.out.println("Please enter a valid age");
		}else if(age>=18 && age<=65) {
			System.out.println("You should work");
			
		}else {
			System.out.println("No should work");
		}
		
	}

}
