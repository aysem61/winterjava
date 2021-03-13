package day19foreachloop;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price = 100;
		
		// if you wanna  original value then you should the assignment 
		
		price=discount(price);

		System.out.println(discount(price));// 90 java use only its copy of value   
		// to call only  the method then you cant  change the original value 

		// java keeps the original of the variable of values

		System.out.println(price);// 100 variable is not goint to update

	}

	public static int discount(int price) { // java use in methods of copy of values ...Kopya value kullanilir

		price = price - 10;

		return price;

	}

}
