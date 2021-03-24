package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		/*//Remove repeated elements from a list
		//Example: [a, b, c, b, a, a, d] ==> [a, b, c, d]
		 * 
		 */
		
		
		List<String> list1=new ArrayList<>();
		
		

		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("b");
		list1.add("a");
		list1.add("a");
		list1.add("d");
		
		List<String> yeni=new ArrayList<>();
		
		// First way
		
//		for (String w:list1) {
//			
//		if(yeni.contains(w)) {
//			
//			continue;
//		}
//			yeni.add(w);
//			
//		}
//		
//		System.out.println(yeni);
//		
//		
		
		// 2 way 
		
		
		for(String w:list1) {
			
			if(!yeni.contains(w)) {
				
				yeni.add(w);
			}
			
		}
		
		System.out.println(list1);
		
		
	}

}
