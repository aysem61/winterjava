package day13constructors;

public class Dog {
	
	public String name;
	public int weight;
	public int height;
	
	
	// I created a constructor below.
	//The constructor has no any parameter
	//The constructor has nothing inside the body
	// That kind of constructor are same with the default constructor
	//Note:If you create a constructor Java deletes the "default one"
	
	
	public Dog() {
		
	}
	
	public Dog(String name) {
		this.name=name;
	}
	
	public Dog(int weight,int height) {
		
	}
	
		
	
	public Dog(String name,int weight,int height) {
		this.name=name;
		this.weight=weight;
		this.height=height;
	}	

		
	public static void main(String[] args) {
		
		Dog dog1=new Dog("Joe");
		System.out.println(dog1.name);//Joe
		dog1.sound();
		
		//Create a dog by using name,weight and height
		
		Dog dog2=new Dog("Bobby",24,67);
		System.out.println(dog2.weight);//24
		System.out.println(dog2.name);//Bobby
 		System.out.println(dog2.height);//67
 		dog2.sound();
 		
 		System.out.println(dog2.weight); // we can reach through an object everything of class such as methos and variables.
 		
 		String str="Java"; //I created a String Object
 	

	}
	
	public static void sound() {
		System.out.println("dOGS BARK...");
	}

}
