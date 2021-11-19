package zadatakOsoba;
/*Kreirati klasu Osoba koja od atributa ima:
•	 ime i prezime
•	 jmbg
•	konstuktor sa parametrima
•	metodu stampaj koja stampa podatke u formatu
	ime prezime, jmbg*/
public class Osoba {
	private String imeIPrezime;
	private long jMBG;
	public Osoba(String imeIPrezime, long jMBG) {
		this.imeIPrezime = imeIPrezime;
		this.jMBG = jMBG;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public long getjMBG() {
		return jMBG;
	}
	public void stampaj() {
		System.out.print(this.imeIPrezime + ", " + this.jMBG);
	}
}