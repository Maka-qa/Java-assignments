package domaci_18_05;

public class Autobus  extends Vozac{

	private String naziv;	
	private int cenaKarte;
	
	
	
	public Autobus(String ime, String prezime, String zanimanje) {
		super(ime, prezime, zanimanje);
		// TODO Auto-generated constructor stub
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getCenaKarte() {
		return cenaKarte;
	}
	public void setCenaKarte(int cenaKarte) {
		this.cenaKarte = cenaKarte;
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