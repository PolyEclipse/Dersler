
public class Siniflar {
	
	public static void yazdirAcikErisim() {
		ArabaAcikErisim acikeristim=new ArabaAcikErisim();
		acikeristim.renk="Sarý";
		acikeristim.marka="Mercedes";
		acikeristim.motorhacmi=2.0;
		acikeristim.kapisayisi=5;
		
		System.out.println(acikeristim.renk);
		System.out.println(acikeristim.marka);
		System.out.println(acikeristim.motorhacmi);
		System.out.println(acikeristim.kapisayisi);
	}
	
	public static void yazdirKapaliErisim() {
		ArabaKapaliErisim kapalieristim=new ArabaKapaliErisim();
		kapalieristim.setRenk("Sarý");
		kapalieristim.setMarka("Mercedes");
		kapalieristim.setMotorhacmi(2.0);//.setRenk("Sarý");
		kapalieristim.setKapisayisi(4);//("Sarý");
		
		System.out.println(kapalieristim.getRenk());
		System.out.println(kapalieristim.getMarka());
		System.out.println(kapalieristim.getMotorhacmi());
		System.out.println(kapalieristim.getKapisayisi());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        yazdirAcikErisim();
        yazdirKapaliErisim();
        
	}

}
