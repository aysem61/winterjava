package day12dowhilevariablesconstructors;

public class Constructor01 {

	String name="Emily";
	int age =20;
	
	Constructor01(String name,int age){
		
		this.name=name;
		
		this.age=22;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor01 st=new Constructor01("Olivier",34);
		
		System.out.println(st.name); // Oliver
		
		System.out.println(" "+st.age); //22 
	}

}
