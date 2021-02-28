package day05ifelseif;

import java.util.Scanner;

public class IfelseStatement03 {

	public static void main(String[] args) {

		/*
		 * Ask user ta enter any name of the days, then get second ,fourth, and sixth
		 * letter of the day name and print them on the console, in the same line. For
		 * example; if the user enters “Monday” output will be “ody”
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of a day ");

		String dayName = sc.next();
		
		
		
		//equalsIgnoreCase Stringlerde ki buyuk kucuk farkini gormezden gelmek icin kullanilan bir method.
		//ali==>Ali same  ,ali==>ali  same
		
		

		if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
				|| dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
				|| dayName.equalsIgnoreCase("friday") || dayName.equalsIgnoreCase("Saturday")

				|| dayName.equalsIgnoreCase("Sunday")) {
			
		//	System.out.print("" + dayName.charAt(1) + dayName.charAt(3));
			
	   // Yukarida ki islem is yerinde  tavisye edilmez code reviewer geri gonderir.
	   // charAt() ile bir islem yapulacaksa bit tane bos string "" konulmali aksi takdirde ascii degerlerinin toplamini verir
			
			System.out.print(dayName.charAt(1));
			System.out.print(dayName.charAt(3));
			System.out.print(dayName.charAt(5));

		} else {
			System.out.println("Enter a valid day name");

		}

	}

}
