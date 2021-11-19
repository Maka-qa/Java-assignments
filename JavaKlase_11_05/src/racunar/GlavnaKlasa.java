package racunar;

public class GlavnaKlasa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] draganineOcene = {9,10,8,9,10};
		PolaznikKursa polaznik1 = new PolaznikKursa(); //instanciranje ; PolaznikKursa() je defaultni, prazan konstruktor
		polaznik1.idPolaznika = 1;
		polaznik1.ime = "Dragana";
		polaznik1.prezime = "Sekulic";
		polaznik1.godinaRodjenja = 1984;
		polaznik1.prosek = 9.49;
		polaznik1.setSrednjaSkola("Gimnazija Svetozar Markovic");
		polaznik1.RacunanjeProseka(draganineOcene);
		
		String imePolaznika = polaznik1.ime; // smestimo atrinut u promenljivu
		String srednjaSkPol1 = polaznik1.getSrednjaSkola();
		
		System.out.println(imePolaznika + ", " + srednjaSkPol1);
		
		PolaznikKursa polaznik2 = new PolaznikKursa(2, "Igor", "Sekulic", 8.5, 1982);
		polaznik2.setSrednjaSkola("Gimnazija Becej");
		
		polaznik1.StampanjePodataka();
		polaznik2.StampanjePodataka();
		
		
		Racunar r1 = new Racunar("Asus", "X540L", 8, "i7");
		Racunar r2 = new Racunar("Asus", "F45C", 16, "i7");
		polaznik1.polaznikovRacunar = r1;
		polaznik2.polaznikovRacunar = r2;
		
		polaznik1.StampajPodatkeORacunaru();
		polaznik2.StampajPodatkeORacunaru();
	}
}