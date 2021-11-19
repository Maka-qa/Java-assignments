package automobil;

public class AutomobiliGlavna {
	public static void main(String[] args) {
		
		Automobil auto1 = new Automobil("Peugeut", "508", "benzin", 5, 2010 );
		Automobil auto2 = new Automobil("Hyndai", "Tucson", "benzin", 5, 2020 );
		Automobil auto3 = new Automobil("Mercedes", "A klasa", "diesel", 3, 2005 );
		
		Automobil auto4 = new Automobil();
		 auto4.marka = "Fijat";
		 auto4.model = "Punto";
		 auto4.brojVrata = 5;
		 auto4.godProizvodnje = 1999;
		 auto4.pogonskoGorivo = "benzin";
		 
		auto1.stampanjePodataka();
		auto2.stampanjePodataka();
		auto3.stampanjePodataka();
		auto4.stampanjePodataka();
	}
}