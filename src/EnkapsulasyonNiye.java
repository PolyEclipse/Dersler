
public class EnkapsulasyonNiye {
	//Bu s�n�f�, ArabaAcikErisim sinifini yazmamis olan  baska bir  programci yazacak.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArabaAcikErisim araba=new ArabaAcikErisim();
		araba.kapisayisi=0;
		System.out.println("Araba kap� say�s�: " + araba.kapisayisi);
		/*
         Console'da yazan "Araba kap� say�s�: 0"
         
         0 kap�l� araba?!?!?
         
         Hata kime yaz�lmal�?
         �lk s�n�f� yazan programc�=> Direkt eri�ime a��k s�n�f yazd�, kontrol� sa�lamad�!
         Bu s�n�f� yazan programc�=> 0 kap�l� araba olamayca��n� d���nemedi!
         
         
         Di�er bir �rnek: Televizyon kumandas� �rne�i=> Devreler, s�re�ler bizden gizlenmi�,
                          Kumanda devreleri kutunun i�inde.


*/
	}

}
