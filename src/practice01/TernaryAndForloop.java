package practice01;

public class TernaryAndForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileSorusu();

		concatination();
		System.out.println();
		method01();
		
		
	}

	private static void whileSorusu() {
		// TODO Auto-generated method stub
		String s = new String("Hi there!");

		int pos = s.indexOf("t");//3

		int idx =0;

		while(idx<s.length()) {

			if(s.charAt(idx)=='e') {

				pos++;

			}

			idx++;

		}

		String result = s.substring(0, pos);

		System.out.println(result);
	}

	private static void concatination() {
		// TODO Auto-generated method stub
		  String s = "abc";

	        s = s + 1 + 2;

	        s = s + (3 + 4);
	        
	        System.out.print(s);

	        System.out.println();
	        s.concat("5").concat("6");

	        System.out.print(s);
	}

	private static void method01() {
		// TODO Auto-generated method stub
		for(int x = 1; x<6; x++) {

            int y = x<3 ? x : ++x;

            System.out.print(y);

        }
	}

}
