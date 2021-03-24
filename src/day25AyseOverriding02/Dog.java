package day25AyseOverriding02;

public class Dog extends Mammal {
	
	@Override
	public void giveBirth() {
		System.out.println("kopekler dogurur");
	}

	public void bark() {
		System.out.println("Dogs bark..");
	}

}
