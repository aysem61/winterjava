package day17lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		
		List<String>list1 = new ArrayList<>();
		
		list1.add("Ahmed");
		
		list1.add("Yavuz");
		
		list1.add("Cemal");
		
		list1.add("Sibel");
		
		list1.add(2,"Ali");
		
		list1.add("Veli");
		
		list1.add("Yavuz");
		
		System.out.println(list1);
		
		System.out.println(list1.size());//6
		
		//to get a specific element in list:
		
		System.out.println(list1.get(2));//Ali
		
		//System.out.println(list1.get(6));//error
		
		//to get index of specific element
		System.out.println(list1.indexOf("Cemal"));//3
		
		System.out.println(list1.indexOf("X"));//-1
		
		System.out.println(list1.indexOf("Yavuz"));//the first occurance 
		
		System.out.println(list1.lastIndexOf("Yavuz"));//6
		
		//How to remove an element from a list?
		//There are two remove() methods
			//1)remove(index)==>returns element that is removed
			//2)remove(elements name)==>returns boolean
		list1.remove(2);
		
		System.out.println(list1.remove(2));//cemal
		
		System.out.println(list1);
		
		list1.remove("Sibel");
		
		System.out.println(list1.remove("Sibel"));//false
		System.out.println(list1.remove("x"));//false
		
		System.out.println(list1);
		
		//Lists are "mutable" you can update them without assigning them
		//Strings are "immutabke" you cannot change them unless you assign them
		String s="String are immutable";
		
		s.replaceAll("are"," ");
		
		String str=s.replaceAll("are"," ");
		
		System.out.println(s);
		
		System.out.println(str);
		
		System.out.println();
		
		//to update elements in lists:
		
		list1.set(2, "John");
		
		System.err.println(list1);
		//to get a part of a list:
		//in sublist() first index is inclusive,second index is exclusive
		list1.subList(1, 3);
		
		System.out.println(list1.subList(1, 3));//[Yavuz,John]
				
				
		List<String>list2 = new ArrayList<>();
		
		list1.add("Ayse");
		list1.add("Serife");
		list1.add("Recep");
		
		list1.addAll(list2);
		System.out.println(list1);//[Ahmed, Yavuz, John, Yavuz, Ayse, Serife, Recep]
		System.out.println(list2);
		
		System.out.println(list1.get(2)+" iskender ");
		
		System.out.println(list1.subList(1, 3)+" can ");


	}

}
