
public class Konstraktir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArabaKonstraktir araba1=new ArabaKonstraktir("Sari","Mercedes",1,1);
		ArabaKonstraktir araba2=new ArabaKonstraktir();
		ArabaKonstraktir araba3=new ArabaKonstraktir("Sari","Mercedes");
		araba1.goster();
		araba2.goster();
		araba3.goster();
		
	}

}
