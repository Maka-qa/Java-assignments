package racunar;

public class PolaznikKursa {
	public int idPolaznika; //propertiji (atributi) klase
	public String ime;
	public String prezime;
	public double prosek;
	public int godinaRodjenja;
	private String srednjaSkola;
	public Racunar polaznikovRacunar;
	
	
	
	public void StampanjePodataka() {
		System.out.println("Polaznik sa ID " + this.idPolaznika + " se zove " + this.ime + " " + this.prezime 
				+ " rodjen je " + this.godinaRodjenja + " i ima prosek " + this.prosek + ", a srednja skola je " + this.srednjaSkola);
		
	}
	
	public PolaznikKursa() {
		//prazan konstruktor- Eclipse ga smatra defaultnim ako se ne napise, ali cim se napravi drugi konstruktor, ovaj vise nije 
		//"dozvoljen
	}
	
	public PolaznikKursa(int id, String imePol, String prezimePol, double prosek, int godinaRodj) {
		this.idPolaznika = id;
		this.ime = imePol;
		this.prezime = prezimePol;
		this.prosek = prosek;
		this.godinaRodjenja = godinaRodj;
	}
	 public PolaznikKursa(int id, String srednjaSk) {
		 this.idPolaznika = id;
		 this.srednjaSkola = srednjaSk;
	 }
	public void setSrednjaSkola(String srednjaSk) {
		this.srednjaSkola = srednjaSk;
	}
	
	public String getSrednjaSkola() {
		return this.srednjaSkola;
	}
	
	public void RacunanjeProseka(int[] ocene) {
		double zbir = 0;
		for (int i = 0; i < ocene.length; i++) {
			zbir += ocene[i];
		}
		
		this.prosek = zbir/ocene.length;
		
	}
	
	public void StampajPodatkeORacunaru() {
		System.out.println("Polaznik " + this.ime + " " + this.prezime + " ima racunar: ");
		this.polaznikovRacunar.stampajPodatkeORacunaru();
	} 
	
}