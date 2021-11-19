package package2;
/*Kreirati klasu Pasta koja ima:
●	listu  sastojaka
●	metodu za dodavanje sastojka
●	metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
●	defaultni konstruktor
●	metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
●	metodu za stampu koja stampa podatke u formatu:
Pasta je sa sastojcima:
naziv - cena.din
naziv - cena.din
naziv - cena.din
Cena paste je cena.din*/
import java.util.ArrayList;
public class Pasta {
	private ArrayList<Sastojak> listaSastojaka;
	//private double cenaPaste;
	public Pasta() {
		listaSastojaka = new ArrayList<Sastojak>();
	}
	public void dodavanjeSastojaka(Sastojak primljeniSastojak) {
		this.listaSastojaka.add(primljeniSastojak);
	}
	public void brisanjeSastojaka(String nazivSastojka) {
		for (int i = 0; i < this.listaSastojaka.size(); i++) {
			if(this.listaSastojaka.get(i).getNaziv().equals(nazivSastojka)) {
				listaSastojaka.remove(i);
			}
		}
	}
	public double izracunajCenuPaste() {
		double cenaSvihSastojaka = 0;
		for (int i = 0; i < listaSastojaka.size(); i++) {
			cenaSvihSastojaka+=listaSastojaka.get(i).getCena();
		}
		return cenaSvihSastojaka;
	}
	public void stampanjePodatakaOPasti() {
		System.out.println("Pasta je sa sastojcima");
		for (int i = 0; i < listaSastojaka.size(); i++) {
			listaSastojaka.get(i).stampanjePodatakaOSastojku();
		}
		System.out.println("Cena paste je " + izracunajCenuPaste() + ".din");
	}
}