package day25overridingexceptions;

public class Cat  extends Animal{
	
	int age = 4;
    int height = 2;
    @Override
    public void sound() {
        System.out.println("Cats meaw");
    }
    @Override
    public void eat() {
        
        System.out.println("Cats drink milk");
        super.eat();
        System.out.println(super.add());
    }
    @Override
    public int add() {
       // System.out.println(super.age);
        System.out.println(this.age);
        return 7+5;
        
    
    }
    @Override
    public Integer multiply() {
        return 9*7;
    }
    @Override
    public Cat create() {
        
        return new Cat();
    }
    
    
}
