package day23encapsulationinheritance;

public class Runner {

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		
		dog1.bark();
		dog1.eat();//dog1 inherited eat() from Animal Class
		dog1.drink();//dog1 inherited drink() from Animal Class
		dog1.giveBirth();//dog1 inherited giveBirth() from Mammal Class
		
		System.out.println(" for cat new line ");
		Cat c1=new Cat();
		c1.meow();
		c1.drink();
		c1.eat();

		
		System.out.println("Egitim icin yeni obje ....");
		
		IlkOgretim boy1=new IlkOgretim();
		
		boy1.ilkOkulEgitimi();
		boy1.okuma();
	}

}
