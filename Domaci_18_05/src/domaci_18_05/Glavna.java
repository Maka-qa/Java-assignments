package domaci_18_05;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Putnik p1 = new Putnik("Petar", "Petrovic");
		Putnik p2 = new Putnik("Milan", "Milanovic");
		
		
		p1.dodavanjeNovca(234);
		System.out.println("Stanje novca " + p1.getNovac());
		p2.oduzimanjeNovca(222);
		System.out.println("Stanje novca " + p2.getNovac());
		
		Vozac v1 = new Vozac("Marko", "Markovic", "vozac");
		Vozac v2 = new Vozac("Srecko", "Sreckovic", "vozac");
	}

}

/*Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja
 *  objekta. Svi podaci
mogu da se dohvate, ali ne i postave.
Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu
 kolicinu novca koja
mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu
 se doda i/ili
oduzme.
Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime 
voze. Naziv i cena
karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti 
putnika kao i vozaca.

Napomena: Ovaj domaci mozete predati do istog roka kada i domaci 
od cetvrtka/petka. */