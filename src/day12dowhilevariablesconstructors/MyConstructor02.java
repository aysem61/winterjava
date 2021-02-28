package day12dowhilevariablesconstructors;

public class MyConstructor02 {
	
	int x=3;
	int y=5;
	
	MyConstructor02(){
		x+=1;
		
		System.out.println("-x  parametresiz .."+x);
		
	}
	
	MyConstructor02(int i){
		this(); // 4 yukaridan gelir 
		
		this.y=1;
		
		x+=y;
		
		System.out.println(" -x .tek parametreli "+x);
		
	}
	
	MyConstructor02(int i,int i2){
		
		this(3);
		
		this.x-=4;
		
		System.out.println(" -x iki parametreli  cons .."+x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyConstructor02 mc=new MyConstructor02(54,3);
		
		System.out.println(mc);
				

	}

}
