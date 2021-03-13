package day17lists;

import java.util.ArrayList;
import java.util.List;

public class List04 {

	public static void main(String[] args) {

		List<Character> list1 = new ArrayList<>();

		list1.add('x');
		list1.add('y');
		list1.add('z');
		list1.add('x');
		list1.add('z');
		list1.add('m');
		list1.add('k');
		// How to remove repeated elements from a list
		System.out.println(list1);

//		 List<Character> list2 = new ArrayList<>();
//		 
//		    for(int i=0; i<list1.size(); i++) {
//		    	
//		        if(list2.contains(list1.get(i))) {
//		            continue;
//		        }
//		        list2.add(list1.get(i));
//		    }
//		    System.out.println(list2);

		List<Character> list2 = new ArrayList<>();

		for (int i = 0; i < list1.size(); i++) {

			if (list2.contains(list1.get(i))) {

				continue;

			}
			list2.add(list1.get(i));

		}

		System.out.println(list2);

	}

}
