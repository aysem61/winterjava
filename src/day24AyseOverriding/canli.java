package day24AyseOverriding;

public class canli {

	public String beslenir;

	public int yas;

	public int kilo;

	public boolean erkenOlur;
	
	public canli(int kilo,int yas) {
		
		this.kilo=kilo;
		this.yas=yas;
		
		System.out.println("burasi da 2 parametreli canli constructor ...");
	}

	public canli(int yas, int kilo, boolean erkenOlur, String beslenir) {

		this.beslenir=beslenir;
		this.erkenOlur=erkenOlur;
		this.kilo=kilo;
		this.yas=yas;
		
		System.out.println("Burasi canli 4 parametreli constructor ..");
	}

	public String uyur() {
		return "Ihtiyac kadar canlilar uyur";
	}
	
	public String beslenir() {
		
		return "Ihtiyac kadar canlilar beslenir";
	}
}
