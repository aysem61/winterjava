package day18Lists;

import java.util.ArrayList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		
		/*Create a method to delete odd elements 
		 * 
		 * and increase the even elements by multiplying 5
		 * 
		 */
		
		List<Integer>  list=new ArrayList<>();
		
//		list.add(8);
//		list.add(5);
//		list.add(9);
//		list.add(6);
//		list.add(4);
		
		for(int i=0; i<6; i++) {
			
			list.add(i+3);
			
		}
		System.out.println(list);
		
		updateList(list);
		
	}

	private static void updateList(List<Integer> list) {
		
		for(int i=0; i<list.size(); i++) {
			
			
			if(list.get(i)%2!=0) {
				
				list.remove(i);
				
				i--;
				
			}else {
				
				list.set(i, list.get(i)*5);
				
			}
			
		}
		
		System.out.println(list);
		
	}

}
