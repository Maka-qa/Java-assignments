/*Kreirati klasu Student koja ima:
● ime i prezime studenta
● broj indeksa
● godinu studija
● gettere, settere i konstruktore
● metodu koja racuna i vraca cenu skolarine, metoda vraca 0 u ovoj klasi.
● metodu koja vraca da li je student na buzetu ili ne, uvek vraca true
● metodu koja stampa podatke u formatu:
ime i prezime, broj indeksa, godina studija
Finansiranje: budzet/samofinansirajuci
Cena skolarine: cena*/

package zadatakStudent;

public class Student {
	
	private String imeIPrezime;
	private String brIndexa;
	private int godStudija;
	
	public Student(String imeIPrezime, String brIndexa, int godStudija) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.brIndexa = brIndexa;
		this.godStudija = godStudija;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}

	public int getGodStudija() {
		return godStudija;
	}

	public void setGodStudija(int godStudija) {
		this.godStudija = godStudija;
	}
	
	public int cenaSkolarine() {
		return 0;
	}
	
	public boolean daLiJeNaBudzetu() {
		return true;
		
	}
	
	public void stampaj() {
		System.out.println(this.imeIPrezime + ", " + this.brIndexa + ", " + this.godStudija);
		System.out.print("Finansiranje: ");
		if(daLiJeNaBudzetu()) {
			System.out.println("budzet");
		} else {
			System.out.println("samofinansiranje");
		}
		System.out.println("Cena skolarine: " + this.cenaSkolarine());
}
}