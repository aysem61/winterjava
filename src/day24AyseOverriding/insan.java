package day24AyseOverriding;

public class insan extends canli {

	
	public insan(int yas, int kilo, boolean erkenOlur, String beslenir) {
		super(kilo, kilo, erkenOlur, beslenir);
		
		super.beslenir=beslenir;
		super.erkenOlur=erkenOlur;
		super.kilo=kilo;
		super.yas=yas;
		
		
	}

	@Override
	public String uyur() {
		return "Insanlar gunde 8 saat uyur";
	}

	@Override
	public String beslenir() {
		
		return "Insanlar gunde  3 ogun yemek yerler";
	}

	public String calismak() {
		
		return "Insanlar gunde 8 saat calisir";
	}
	

	public void konus() {
		
		System.out.println("Insanlar iletisim icin kendi aralarinda konusurlar ");
	}
	
	
	
	

}
