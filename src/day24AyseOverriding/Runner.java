package day24AyseOverriding;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cocuk c1=new cocuk(8,18,false,"et ve sut urunlerini tuketirler");
		
		System.out.println(c1.beslenir);
		
		c1.setEmzirme("Bebekleri 2 yasina kadar emzirirler ");
		System.out.println(c1.getEmzirme());

	}

}
