package package2;
/*	Zadatak
Kreirati klasu Sastojak koja ima:
●	naziv
●	cenu
●	gettere i settere
●	konstruktore
●	metodu za stampanje koja stampa  podatke u formatu:
naziv - cena.din*/
public class Sastojak {
	private String naziv;
	private double cena;
	public Sastojak(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public void stampanjePodatakaOSastojku() {
		System.out.println(this.naziv + " - " + this.cena);
	}
}