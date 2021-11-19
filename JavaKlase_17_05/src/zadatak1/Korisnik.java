package zadatak1;
/*1.ZadatakKreirati klasu Korisnik koja ima:●ime i prezime ●tip licence (basic/pro/premium)●konstruktore●gettere i
settere za sve atribute, sem za tip licence koja ne moze da se menja●metodu pretplati se koja postavlja licencu
u zavisnosi od uplacene sume:○ako je uplata 100, postavlja licencu na "pro"○ako je uplata 150, postavlja licencu
na "premium"Metoda kao parametar prima vrednost uplate $100 ili $150●metodu ponisti pretplatu koja postavlja licencu
na basic●metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence○ako je basic, vraca
40min○ako je pro,
vraca 240min○ako je  premium, vraca 1440min●metodu za stampu koja stampa u formatu:ime i prezime*/
public class Korisnik {
	private String imeIPrezime;
	private String tipLicence;
	public Korisnik(String imeIPrezime, String tipLicence) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.tipLicence = tipLicence;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getTipLicence() {
		return tipLicence;
	}
	public void pretplati(int uplata) {
		if(uplata == 100) {
			this.tipLicence = "Pro";
		}else if (uplata == 150) {
			this.tipLicence = "Premium";
		}
	}
	public void ponisti() {
		this.tipLicence = "Basic";
	}
	public int maxDuzinaTrajanjaPozivaUMinutima() {
		int maxDuzinaPoziva = 0;
		if(this.tipLicence.equals("Basic")) {
			maxDuzinaPoziva=40;
		}else if (this.tipLicence.equals("Pro")) {
			maxDuzinaPoziva = 240;
		}else {
			maxDuzinaPoziva =1440;
		}
		return maxDuzinaPoziva;		
	}
	public void stampajKorisnika() {
		System.out.println(this.imeIPrezime);
	}
}