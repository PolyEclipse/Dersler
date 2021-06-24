class Hayvan{
	public String cins;
	public String isim;
	public Hayvan(String cins,String isim) {
		this.cins = cins;
		this.isim=isim;
	}
	public void seslendir() {
		cins="Hayvan";
		System.out.println(cins + " "+ isim +" ses çýkarýyor...");
	}
}
class Kus extends Hayvan{
	public String ozellik;
	public Kus(String cins, String isim,String ozellik) {
		super(cins, isim);
		this.ozellik=ozellik;
	}
	@Override
	public void seslendir() {
		System.out.println(cins + " "+ isim + " ötüyor" +" ve "+ozellik+"...");
		//System.out.println(ozellik);
	}
}
class At extends Hayvan{
	String ozellik;
	public At(String cins, String isim,String ozellik) {
		super(cins, isim);
		this.ozellik=ozellik;
	}
	@Override
	public void seslendir() {
		System.out.println(cins + " "+ isim + " kiþniyor"+" ve "+ozellik+"...");
	}
}
class TopluYazdir{
	public TopluYazdir(Hayvan hayvan) {
		hayvan.seslendir();
	}
	
}





public class Inheritance {
	public static void main(String[] args) {
		Hayvan hayvan=new Hayvan("Kuþ","Cimcime");
		hayvan.seslendir();
		Hayvan hayvan2=new Kus("Kuþ","Cimcime","kanatlarý var");
		hayvan2.seslendir();
		Hayvan hayvan3=new Hayvan("At","Kýrat");
		hayvan3.seslendir();
		Hayvan hayvan4=new At("At","Kýrat","yelesi var");
		hayvan4.seslendir();		
		
	}
}
