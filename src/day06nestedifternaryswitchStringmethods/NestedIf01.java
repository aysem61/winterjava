package day06nestedifternaryswitchStringmethods;

import java.util.Scanner;

public class NestedIf01{
	
	
	/*Type java code by using nested if() statement. Write a program to check if a
	 * year is leap year or not. If the year is divisible by 100 then it must be
	 * divisible by 400. If a year is not divisible by 100 then it must be divisible
	 * by 4.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
	    System.out.println("Please enter a year");
		
	    int year=s.nextInt();
	    
	    if(year%100==0) {
	    	
	    	if(year%400==0) {
	    		System.out.println(year+"  your  year is a leap year ");
	    	}else {
	    		System.out.println(year+" your year is not a leap year ");
	    	}
	    	
	    }else {
	    	if(year%4==0) {
	    		System.out.println(" your year is leap year");
	    	}else {
	    		System.out.println(" your year is not a leap year ");
	    	}
	    }
		
		
		
	}
	
	
	
	
	
	
}