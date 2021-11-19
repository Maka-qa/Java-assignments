package zadatak1;
public class Glavna {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korisnik korisnik1 = new Korisnik("Paja Pajic", "Basic");
		Korisnik korisnik2 = new Korisnik("Maja Majic", "Premium");
		ZoomCall poziv = new ZoomCall("www.link.dejt", "1234", korisnik1, korisnik2);
		poziv.pokreniPoziv();
		System.out.println("----------------------------------------");
		korisnik1.pretplati(100);
		poziv.pokreniPoziv();
		System.out.println("----------------------------------------");
		korisnik1.pretplati(150);
		poziv.pokreniPoziv();
		System.out.println("----------------------------------------");
		korisnik1.ponisti();
		poziv.pokreniPoziv();
	}
}