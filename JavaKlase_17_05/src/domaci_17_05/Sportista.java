package domaci_17_05;


public class Sportista {
	private String ime;
	private String prezime;
	private int godRodjenja;

	
	public Sportista(String ime, String prezime, int godRodjenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godRodjenja = godRodjenja;
		
	}


	public void stampaj() {
		System.out.println(this.ime + " " + this.prezime + ": " + this.godRodjenja);
	
	}


	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public int getGodRodjenja() {
		return godRodjenja;
	}
}