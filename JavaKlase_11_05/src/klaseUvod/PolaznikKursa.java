package klaseUvod;
public class PolaznikKursa {
	public int idPolaznika;//propertiji(atributi) klase
	public String ime;
	public String prezime;
	public int godinaRodjenja;
	public double prosek;
	private String srednjaSkola;
	public PolaznikKursa(int id, String imeArgument, String prezimeArgument, int godRodj, double prosOcena) {
		this.idPolaznika = id;
		this.ime = imeArgument;
		this.prezime = prezimeArgument;
		this.godinaRodjenja = godRodj;
		this.prosek = prosOcena;	
	}
	public PolaznikKursa() {
	}
	public void setSrednjaSkola(String nazivSkole) {
		this.srednjaSkola = nazivSkole;
	}
	public String getSrednjaSkola() {
		return this.srednjaSkola;
	}
	public void stampanjePodatakaOPolazniku() {
		System.out.println("Polaznika sa id-jem " + this.idPolaznika + " se zove " + this.ime + " " + this.prezime
				+ " i rodjen je " + this.godinaRodjenja + " i ima prosek " + this.prosek + " a isao/la je u srednju "
				+ this.srednjaSkola);
	}
	public void racunanjeProseka(int[] ocene) {
		double zbirOcena = 0;
		for (int i = 0; i < ocene.length; i++) {
			zbirOcena+=ocene[i];
		}
		this.prosek = zbirOcena/ocene.length;
	}
}