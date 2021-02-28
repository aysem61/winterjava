package day14constructorsstatickeywordarrays;

public class Dog {

	public static void main(String[] args) {
		
		

		eat();
		
		
	}

	public static void eat() {
		System.out.println("This is static method ...");
		System.out.println("To acces a static method that you need a call just class and its name like Dog.eat();");
	}
	
	public void drink() {
		System.out.println("this is not static  drink method ...non static method ");
	}
	

}
