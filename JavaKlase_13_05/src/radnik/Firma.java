package radnik;
import java.util.ArrayList;
public class Firma {
	private String naziv;
	private String oblastPoslovanja;
	private int godOsnivanja;
	private ArrayList<Radnik> radnici;
	public Firma(String naziv, String oblastPoslovanja, int godOsnivanja) {
		this.naziv = naziv;
		this.oblastPoslovanja = oblastPoslovanja;
		this.godOsnivanja = godOsnivanja;
		this.radnici = new ArrayList<Radnik>();
	}
	public Firma(String oblastPoslovanja) {
		this.oblastPoslovanja = oblastPoslovanja;
		this.radnici = new ArrayList<Radnik>();
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	public void setGodOsnivanja(int godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}
	public String getOblastPoslovanja() {
		return oblastPoslovanja;
	}
	public void stampajOFirmi() {
		System.out.println("Nasa firma se zove " + this.naziv + " i bavimo se " + this.oblastPoslovanja + " a osnovani smo" + this.godOsnivanja);
	}
	public void zaposljavanjeRadnika(Radnik zaposlen) {
		radnici.add(zaposlen);
	}
	public void ispisPodatakaOZaposlenima() {
		if(radnici.size() == 0) {
			System.out.println("Firma " + this.naziv + " nema ni jednog zaposlenog");
		}else {
			System.out.println("U " + this.naziv + " rade:");
			for (int i = 0; i < radnici.size(); i++) {
				radnici.get(i).ispisPodatakaORadniku();
			}
		}
	}
}


/*  3. dodajte klasu firma koja ima od atributa naziv 
 * oblastPoslovanja i godinu kada je osnovana
 * 
 *  4. iz glavne klase instancirati nekoliko firmi */

/*package radnik;
public class Firma {
	private String naziv;
	private String oblastPoslovanja;
	private int godOsnivanja;
	public Firma(String naziv, String oblastPoslovanja, int godOsnivanja) {
		this.naziv = naziv;
		this.oblastPoslovanja = oblastPoslovanja;
		this.godOsnivanja = godOsnivanja;
	}
	public Firma(String oblastPoslovanja) {
		super();
		this.oblastPoslovanja = oblastPoslovanja;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	public void setGodOsnivanja(int godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}
	public String getOblastPoslovanja() {
		return oblastPoslovanja;
	}
} */