package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// Ask user to enter an integer
		// If the integer is even print on the console “You won!”
        //Otherwise ask user to enter another integer
		
		deneme1();

		Scanner scan = new Scanner(System.in);

		int num = 0;

		do {
			System.out.println("Enter an integer");
			num = scan.nextInt();

		} while (num % 2 != 0);
		System.out.println("You won!");

	

	}

	private static void deneme1() {
		// Ask user to enter an integer
				
		// If the integer is even print on the console “You won!”
		        
		//Otherwise ask user to enter another integer
		
		Scanner s=new Scanner(System.in);
		
		int user=0;
		
		do {
			
			System.out.println(" Enter again another number  ");
			
			user=s.nextInt();
			 
		}while(user%2!=0);
		
		System.out.println("you  won! ");
			

		
		
		s.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
