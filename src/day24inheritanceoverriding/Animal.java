package day24inheritanceoverriding;

public class Animal {
	
	public int heigth;
	public int weigth;

	public Animal() {
		this(5); // call in a class a constructor  itselfs 
		System.out.println("Animal constructor without parameter...");
	}
	
	public Animal(int a) {
		System.out.println("Animal constructor with int parameter");
	}
	
	public Animal(int heigth,int weigth) {
		
		this.heigth=heigth;
		this.weigth=weigth;
		
	}

}
