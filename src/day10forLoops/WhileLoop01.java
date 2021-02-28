package day10forLoops;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		WhileLoop02.multiplicationTable();
		
		System.out.println(WhileLoop02.kelime);
		
		WhileLoop02 ayse=new WhileLoop02("iyi anlamak icin ogren ",13.5);
		
		System.out.println(ayse.can+" ... "+ayse.d);
		

		forloop();
		
		while2();
	
		while3();
		
		
	}

	private static void while3() {
		/*
		 * Create a method to print integers which are divisible by 6 and 8 from 500 to
		 * 25 on the console.
		 */

		int a = 500;

		while (a > 24) {

			if (a % 6 == 0 && a % 8 == 0) {

				System.out.println(a + "  6 ve 8 e bolunen sayilar ");
			}

			a--;
		}

	}

	private static void while2() {
		
		
		/*
		 * tYPE A PROGRAM TO PRINT ODD INTEGERS FROM 4 TO 25 in the same line with a
		 * space on the console. 
		 * 1)Use for-Loop 2)Use WHILE-lOOP
		 */

		
		System.out.println();
		
		int i = 5;

		while (i < 26) {

			// if(i%2!=0)
			System.out.println(i + " while with ");

			i += 2;

		}

	}
	/*
	 * tYPE A PROGRAM TO PRINT ODD INTEGERS FROM 4 TO 25 in the same line with a
	 * space on the console. 1)Use for-Loop 2)Use WHILE-lOOP
	 */

	public static void forloop() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an odd integer");

		int s = scan.nextInt();

		for (int i = s; i>=5 && i <= 25; i++) {
			
			System.out.print(" " + i);
			
			i++;
		}

		scan.close();
	}

}
