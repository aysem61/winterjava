package day24AyseOverriding;

public class dede extends insan {

	public dede(int yas, int kilo, boolean erkenOlur, String beslenir) {
		super(yas, kilo, erkenOlur, beslenir);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String uyur() {
		// TODO Auto-generated method stub
		return "daha fazla uyur";
	}

	@Override
	public String beslenir() {
		// TODO Auto-generated method stub
		return "daha saglikli beslenmke zorunda";
	}

	@Override
	public String calismak() {
		// TODO Auto-generated method stub
		return "emekli oldugu icin calismaz";
	}

	@Override
	public void konus() {
		// TODO Auto-generated method stub
		System.out.println("Daha yavas ve bilgece konusurlar ");
	}
	
	public void torun() {
		System.out.println(" Dedelerin torunlari olur ve cok severler ");
	}

}
