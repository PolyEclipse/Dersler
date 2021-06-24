
public class ArabaKonstraktir {

	private String renk;
	private String marka;
	private double motorhacmi;
	private int kapisayisi;
	

	public ArabaKonstraktir(String renk, String marka, double motorhacmi, int kapisayisi) {
		this.renk = renk;
		this.marka = marka;
		this.motorhacmi = motorhacmi;
		this.kapisayisi = kapisayisi;
	}
	public ArabaKonstraktir() {
		
		//YÖNTEM 1
		//this.renk = "Yok";
		//this.marka = "Yok";
		//this.motorhacmi = 0;
		//this.kapisayisi = 0;
		//YÖNTEM 2

		this("Yok2","Yok2",0,0);		
	}
	public ArabaKonstraktir(String renk, String marka) {
		
		//YÖNTEM 1
		this.renk = renk;
		this.marka = marka;
		this.motorhacmi = 0;
		this.kapisayisi = 0;
		//YÖNTEM 2
        //this(renk,marka,0,0);		
	}
	
	
	public void goster() {
		System.out.println(this.renk);
		System.out.println(this.marka);
		System.out.println(this.motorhacmi);
		System.out.println(this.kapisayisi);
	}
	
	
}
