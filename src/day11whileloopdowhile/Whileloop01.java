package day11whileloopdowhile;

import java.util.Scanner;

public class Whileloop01 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop, 
		 * Write a program that prompts the user to input an integer. 
		 * It should then find sum of the digits of that number. 123
		 * ==> 1+2+3 = 6
		 */

		addDigits();
		
		adddigit();

	}

	private static void adddigit() {
		
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		int sum=0;
		
		if(num<0) {
			System.out.println("Enter a number");
			sum=sum*-1;
		}
		while(num%d=0) {
			
			sum=sum+1;
			System.out.println("sum");
		}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void addDigits() {

		Scanner s = new Scanner(System.in);

		System.out.println(" enter a number please ");

		int num = s.nextInt();

		if (num < 0) {

			num = num * -1;// negatif sayilarin mutlak degerini bulmak icin -1 ile carpildi

		}

		// pozitif sayilarin mutlak degerini bulmak icin  while loop 
		
		int sum = 0; // rakamlarin degerleinin toplandigi container 

		while (num != 0) {
			
			sum+=num%10; // rakamlarin birler basamagi degerini bulma 
			
			num/=10; // geri kalan sayi bolme 
			

		}
		System.out.println(sum+" rakamlarin mutlak toplami ");
		s.close();

	}

	
}
