package day24AyseOverriding;

public class cocuk extends anne {

	public cocuk(int yas, int kilo, boolean erkenOlur, String beslenir) {
		super(yas, kilo, erkenOlur, beslenir);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String uyur() {
		// TODO Auto-generated method stub
		return super.uyur();
	}

	@Override
	public String beslenir() {
		// TODO Auto-generated method stub
		return super.beslenir();
	}

	@Override
	public String calismak() {
		// TODO Auto-generated method stub
		return super.calismak();
	}

	@Override
	public void konus() {
		// TODO Auto-generated method stub
		super.konus();
	}
	
	public void oyun() {
		System.out.println("Her cocuk oyun oynar ....");
	}
	
	public void okul() {
		System.out.println("cocuklar okula giderler ....");
	}

}
