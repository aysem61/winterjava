package practice01;

import java.util.Scanner;

public class P_Q08_String_FirstThreeLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("PLEASE ENETER a name ");
		String name = scan.next().trim();

		String yeni=name.substring(0,3)+name.substring(3).replaceAll("\\w", "*");
		
		System.out.println(yeni);
		
		
		
	}

}
