class Hayvan{
	public String cins;
	public String isim;
	public Hayvan(String cins,String isim) {
		this.cins = cins;
		this.isim=isim;
	}
	public void seslendir() {
		cins="Hayvan";
		System.out.println(cins + " "+ isim +" ses ��kar�yor...");
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
		System.out.println(cins + " "+ isim + " �t�yor" +" ve "+ozellik+"...");
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
		System.out.println(cins + " "+ isim + " ki�niyor"+" ve "+ozellik+"...");
	}
}
class TopluYazdir{
	public TopluYazdir(Hayvan hayvan) {
		hayvan.seslendir();
	}
	
}





public class Inheritance {
	public static void main(String[] args) {
		Hayvan hayvan=new Hayvan("Ku�","Cimcime");
		hayvan.seslendir();
		Hayvan hayvan2=new Kus("Ku�","Cimcime","kanatlar� var");
		hayvan2.seslendir();
		Hayvan hayvan3=new Hayvan("At","K�rat");
		hayvan3.seslendir();
		Hayvan hayvan4=new At("At","K�rat","yelesi var");
		hayvan4.seslendir();		
		
	}
}
