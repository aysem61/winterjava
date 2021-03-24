package day24AyseOverriding;

public class anne extends dede {

	String emzirme = "Bebekleri emdirirler ";

	public String getEmzirme() {
		return emzirme;
	}

	public void setEmzirme(String emzirme) {
		this.emzirme = emzirme;
	}

	public anne(int yas, int kilo, boolean erkenOlur, String beslenir) {
		super(yas, kilo, erkenOlur, beslenir);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String uyur() {
		// TODO Auto-generated method stub
		return "uykusu duzensizdir";
	}

	@Override
	public String beslenir() {
		// TODO Auto-generated method stub
		return "cok saglikli beslenir ve diyet yapar";
	}

	@Override
	public String calismak() {
		// TODO Auto-generated method stub
		return "bazilari calisiri bazilari ise evde cocuklariyla zaman gecirir ";
	}

	@Override
	public void konus() {
		// TODO Auto-generated method stub
		System.out.println("ince ve narin sesli konusurlar cocuklar icin .....");
	}

}
