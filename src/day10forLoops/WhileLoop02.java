package day10forLoops;

import java.util.Scanner;

public class WhileLoop02 {
	
	static int a=0;
	
	static String kelime="deneme ilk ";
	
	boolean isCorrect=false;
	
	double d=343.4;
	
	String can=" he he derle sana ";
	
	
	public  WhileLoop02(String a,double h){
		
		this.can=a;
		this.d=h;
		
	}
	

	 static void main(String[] args) {
		
		WhileLoop02 nesne1=new WhileLoop02("can",3.4);
		
		System.out.println(nesne1.kelime);

		multiplicationTable();
	}

	 static void multiplicationTable() {
		/*
		 * Type java code by using while loop, 
		 * Write a program that prompts the user to input a positive integer.
		 * 
		 * It should then print the multiplication table of that number.
		 * 
		 * 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		 * 
		 */
		
		a=3;

		Scanner s=new Scanner(System.in);
		
		
		System.out.println(" Enter a number to see multiplication table ");
		
		
		double d=s.nextDouble();
		
		double i=1;
		
		
		while(i<11) {
			
			System.out.println(d+"x"+i+"="+(d*i));
			i++;
		}
		
	}

}
