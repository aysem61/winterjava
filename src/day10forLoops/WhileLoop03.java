package day10forLoops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		/*Get an integer from user and calculate  the factorial 
		 * 
		 * for example : user--> 5!=120
		 * 
		 */
		
		factoriel();
		
	}

	private static void factoriel() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println(" Enter an integer ");
		
		int d=s.nextInt();
		
		int i=1;
		
		int result=1;
		
		
		while (i<=d) {
			
			result=result*i;
			
			//System.out.println(d*i+" sonuc "); burasi  normal caprma islemi icin 
			
			i++;
		}
		
		
		System.out.println(result);
	}

}
