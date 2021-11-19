package domaci_13_05;

public class Knjiga extends Autor {
	private String naziv;
	private int godIzdanja;
	private String ISBN; 

	public Knjiga(String ime, String prezime, String naziv, int godIzdanja, String iSBN) {
		super(ime, prezime);
		this.naziv = naziv;
		this.godIzdanja = godIzdanja;
		ISBN = iSBN;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodIzdanja() {
		return godIzdanja;
	}

	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void stampaj1() {
		System.out.println("ISBN: " + this.naziv + " - " + this.godIzdanja  );
		System.out.println("Autor: " + this.getIme() + " " + this.getPrezime() );

	}
	

	public void stampaj() {
		System.out.println(this.getIme() + " " + this.getPrezime() );
	
	}

}
