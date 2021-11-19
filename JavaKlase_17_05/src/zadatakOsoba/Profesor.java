package zadatakOsoba;
/*Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
koja od dodatnih atributa ima:
•	naziv predmeta koji predaje
•	konstuktor sa parametrima
•	metodu stampaj koja stampa podatke u formatu:
ime prezime, jmbg, predmet*/
public class Profesor extends Osoba{
	private String nazivPredmeta;
	public Profesor(String imeIPrezime, long jMBG, String nazivPredmeta) {
		super(imeIPrezime, jMBG);
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public void stampaj() {
		super.stampaj();
		System.out.println(", " + this.nazivPredmeta);
	}
}