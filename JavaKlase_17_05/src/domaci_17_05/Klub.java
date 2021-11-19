package domaci_17_05;

public class Klub extends Sportista {
	public Klub(String ime, String prezime, int godRodjenja) {
		super(ime, prezime, godRodjenja);
		
	}
	
	private String naziv;
	private String sediste;
	private int godOsnivanja;

	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSediste() {
		return sediste;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	

}
