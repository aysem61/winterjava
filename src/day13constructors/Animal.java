package day13constructors;

public class Animal {
	
	
	/*
	 * 1)Constructors must have same name with the class
	 * 2)Constructors names start with uppercases(Because they match with the class names 
	 * but method names start with lower cases
	 * 3)Methods must have "return type" ,but Constructors must not 
	 * 
	 */
	
	
	public  String name;
	public int weight;
	public static  boolean isHerbivorous;

	public static void main(String[] args) {
		
		
		Animal dog=new Animal();
		System.out.println(dog.name);//Joe
		System.out.println(dog.weight);//78
		System.out.println(dog.isHerbivorous);//false
		
		
		dog.eat();
	dog.drink();
		dog.move();
		

	}

     static void eat() {
		// TODO Auto-generated method stub
		
		
		if(isHerbivorous) {
			System.out.println(" Eat plants ");
		}else {
			System.out.println(" ayse sen bilirsin bu hataya devam etmede ");
		}
		
	}

	private static void drink() {
		// TODO Auto-generated method stub
		
		System.out.println("Drink water icerikli method  ");
		
	}

	private static void move() {
		// TODO Auto-generated method stub
		
		System.out.println("MOves methodunun ciktisi");
		
	}
	
	
}