package zadatakPlatnaKartica;
/*metodu dodajSredstva koja povecava sumu za unetu vrednost
•metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
•metodu koja stampa podatke o kartici u formatu:4012-1239-1221-3381, 11/2019, $212*/
public class PlatnaKartica {
	private double suma;
	private String brKartice;
	private int godina;
	private int mesec;
	public PlatnaKartica(double suma, String brKartice, int godina, int mesec) {
		super();
		this.suma = suma;
		this.brKartice = brKartice;
		this.godina = godina;
		this.mesec = mesec;
	}
	public double getSuma() {
		return suma;
	}
	public String getBrKartice() {
		return brKartice;
	}
	public int getGodina() {
		return godina;
	}
	public int getMesec() {
		return mesec;
	}
	public void dodajSredstva(double uplata) {
		suma+=uplata;
	}
	public void izvrsiTransakciju(double trosak) {
		suma-=trosak;
	}
	public void stampaj() {
		System.out.println(this.brKartice + " " + this.mesec + "/" + this.godina + ", " + this.suma);
	}
}