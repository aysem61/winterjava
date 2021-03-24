package day25AyseOverriding02;

public class Cat extends Mammal {
	
	
	@Override
	public void giveBirth() {
		System.out.println("Kediler en az 5 yavru dogurur ");
	}

	@Override
	public void eat() {
		System.out.println("Kediler sut ve et yerler ");
	}

	@Override
	public void drink() {
		System.out.println("su da icerler ama en cok sutu severler ");
	}

	public void meow() {
		
		System.out.println("Cats meow...");
	}

}
