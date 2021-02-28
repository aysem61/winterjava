package day12dowhilevariablesconstructors;

public class Animal {

	public int age = 15;
	public String name = "cat";
	public int weight = 25;

	public static void main(String[] args) {

		Animal obj = new Animal();

		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.weight);

		obj.eat();
		obj.sound();

	}

	private void sound() {
		// TODO Auto-generated method stub
		 System.out.println("Animals eat");

	}

	private void eat() {
		// TODO Auto-generated method stub
		  System.out.println("Animals make sound");

	}

}
