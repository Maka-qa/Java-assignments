package domaci_18_05;

public class Vozac extends Covek {
	
	private String zanimanje;

	public Vozac(String ime, String prezime, String zanimanje) {
		super(ime, prezime);
		this.zanimanje = zanimanje;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
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