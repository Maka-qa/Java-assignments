package zadatakRacun;
/*1.	Napraviti klasu Sastojak koja ima:
Atribute: 
Naziv
Kolicina u gramima
Cena po gramu
Konstrukrore, gettere i settere
Metodu cena sastojaka (vraca cenu sastojka koja se racuna po formuli kolicina u gr * cana po gr)
Metodu stampaj koja vrsi ispis u formatu naziv sastojak, cena sastojka
Primer ispisa:
limun, cena: 30.0 din*/
public class Sastojak {
	private String naziv;
	private double kolicinaGr;
	private double cenaPoGr;
	public Sastojak(String naziv, double kolicinaGr, double cenaPoGr) {
		super();
		this.naziv = naziv;
		this.kolicinaGr = kolicinaGr;
		this.cenaPoGr = cenaPoGr;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getKolicinaGr() {
		return kolicinaGr;
	}
	public void setKolicinaGr(double kolicinaGr) {
		this.kolicinaGr = kolicinaGr;
	}
	public double getCenaPoGr() {
		return cenaPoGr;
	}
	public void setCenaPoGr(double cenaPoGr) {
		this.cenaPoGr = cenaPoGr;
	}
	public double cenaSastojka() {
		return kolicinaGr*cenaPoGr;
	}
	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cenaSastojka() + " din");
	}
}