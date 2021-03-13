package day17lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists03 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();

		list1.add("A");
		list1.add("K");
		list1.add("N");
		list1.add("Y");
		list1.add("W");

		List<String> list2 = new ArrayList<>();

		list1.add("A");
		list1.add("K");
		list1.add("N");
		list1.add("Y");
		list1.add("W");

		// hOW TO CHECK if two lists are equal or not?
		// equals() returns boolean
		System.out.println(list1.equals(list2));// true

		// How to check if a list has aspecific element?
		System.out.println(list1.contains("Y"));// TRUE
		System.out.println(list1.contains("X"));// FALSE
		
		
		List<String> list3 = new ArrayList<>();
		
		list3.add("A");
		list3.add("K");
		list3.add("N");

		list1.containsAll(list3);//true
		
		System.out.println(list1.containsAll(list3));

		/*
		 * Ask user to enter a letter If the letter exists in list1 convert it to
		 * "Got it" otherwise add the element which user entered into the list1
		 */
		Scanner s = new Scanner(System.in);

		System.out.println("please enter the letter");
		String str = s.next().toUpperCase().substring(0, 1);
		
		

//		for (int i = 0; i < list1.size(); i++) {
//
//			if (list1.get(i).equals(a)) {
//
//				list1.set(i, "Got it");
//
//			} else {
//
//				list1.add(a);
//
//				if (list1.indexOf(a) == list1.size() - 1)
//					break;
//			}
//
//		}
//
//		System.out.println(list1);
		
		
		if(list1.contains(str)) {
			
            list1.set(list1.indexOf(str), "Got it");
            System.out.println(list1);
        }else {
            list1.add(str);
            System.out.println(list1);
        }
        
        s.close();	

	}

}
