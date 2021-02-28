package day15arrays;

import java.util.Arrays;

public class Splits01 {

	public static void main(String[] args) {
	String kelime= "insanlar iyilik gormeden iyilik yapmaz oldu, ama ayse hala iyilik yapan iyilik bulur ,diyor eyy JAVA";
	
	
	//String parca[]=kelime.split(",");
	
	String parca[]=kelime.replace(" ", "").split("");
	
	System.out.println(Arrays.toString(parca)+"......."+parca.length);
	
	
	
	

	}

}
