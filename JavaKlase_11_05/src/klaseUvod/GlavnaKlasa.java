package klaseUvod;
public class GlavnaKlasa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] milovanoveOcene = {6,7,8,7,6,10,6};
		PolaznikKursa polaznik1 = new PolaznikKursa();
		polaznik1.idPolaznika = 1;
		polaznik1.ime = "Milovan";
		polaznik1.prezime = "Pocek";
		polaznik1.godinaRodjenja = 1988;
		polaznik1.prosek = 6.01;
		polaznik1.setSrednjaSkola("Gimnazija Laza Kostic");
		polaznik1.racunanjeProseka(milovanoveOcene);
		String imePolaznika1 = polaznik1.ime;
		String srednjaSkolaPolaznika1 = polaznik1.getSrednjaSkola();
		System.out.println("Polaznik 1 se zove " + imePolaznika1
				+ " a isao je u srednju skolu " + srednjaSkolaPolaznika1);
		PolaznikKursa polaznik2 = new PolaznikKursa(2, "Aca", "Milenkovic", 1992, 10);
		polaznik2.setSrednjaSkola("ES Nikola Tesla");
		polaznik1.stampanjePodatakaOPolazniku();
		polaznik2.stampanjePodatakaOPolazniku();
	}
}