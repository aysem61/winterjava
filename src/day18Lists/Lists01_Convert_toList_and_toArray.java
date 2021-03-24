package day18Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists01_Convert_toList_and_toArray {
	public static void main(String[] args) {
		
		// Working with lists is easier than working with arrays
		// Because of this sometimes we want to convert arrays to lists

		Integer arr[] = { 3, 5, 7, 1, 5 };
		
		// We can use asList() from Arrays class
		
		List<Integer> list1 = Arrays.asList(arr);
		
		System.out.println(list1);

		// Use some list methods:
		
		list1.set(1, 10); //Update methodu;indeksteki verileri update ediyorsun.
		System.out.println(list1);
		System.out.println(list1.subList(2, 4));// [7, 1]

		// Note:When we use asList(), we cannot use list methods that are related to
		// length
		// list1.remove(0);
		// System.out.println(list1);// java.lang.UnsupportedOperationException
		
		// list1.add(5);
		// System.out.println(list1);// java.lang.UnsupportedOperationException
		// list1.clear();// java.lang.UnsupportedOperationException

		// Instead of using asList() we can use for loop and take elements from
		// array and add them to list

		int brr[] = { 7, 5, 3, 9, 0 };
		
		List<Integer> list2 = new ArrayList<>();
		
		for (int i = 0; i < brr.length; i++) {
			list2.add(brr[i]);
		}
		System.out.println(list2);// [7, 5, 3, 9, 0]
		list2.remove(2);
		System.out.println(list2);// [7, 5, 9, 0]
		
		// removeIf(); we will learn in lambda 
		// it removes elements according  to condition
		// it returns boolean 

		list2.removeIf(t->t%2==0);//t bir degeri temsil ediyor.t ikiye bolunurse silinir.
		
		// How can we convert lists to array?( No recommended) 
		
		Object[] arrayFromList=list2.toArray();
		
		System.out.println(Arrays.toString(arrayFromList));
		
		
		
		

	}

}
