
public class EnkapsulasyonNiye {
	//Bu sýnýfý, ArabaAcikErisim sinifini yazmamis olan  baska bir  programci yazacak.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArabaAcikErisim araba=new ArabaAcikErisim();
		araba.kapisayisi=0;
		System.out.println("Araba kapý sayýsý: " + araba.kapisayisi);
		/*
         Console'da yazan "Araba kapý sayýsý: 0"
         
         0 kapýlý araba?!?!?
         
         Hata kime yazýlmalý?
         Ýlk sýnýfý yazan programcý=> Direkt eriþime açýk sýnýf yazdý, kontrolü saðlamadý!
         Bu sýnýfý yazan programcý=> 0 kapýlý araba olamaycaðýný düþünemedi!
         
         
         Diðer bir örnek: Televizyon kumandasý örneði=> Devreler, süreçler bizden gizlenmiþ,
                          Kumanda devreleri kutunun içinde.


*/
	}

}
