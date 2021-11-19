package zadatakRacun;
/*3.	Napraviti klasu Kafa koja nasledjuje Pice koja ima
Atribute: 
Procenat kofeina
Konstrukrore, gettere i settere
Metodu koja racuna cenuPica po formuli (procenat kofeina * 30) + cena svih sastojaka
Metodu stampaj koja stampa ukupnu cenu kafe i sve sastojke sa cenama sastojaka
Primer ispisa:
Mocha, procenat kofeina: 1%, cena: 150.0 din
Sastojci: 
Mleko, cena: 50.0 din
Slag, cena: 70.0 din*/
import java.util.ArrayList;
public class Kafa extends Pice{
	private double procenatKofeina;
	public Kafa(String naziv, double procenatKofeina) {
		super(naziv);
		this.procenatKofeina = procenatKofeina;
	}
	public double getProcenatKofeina() {
		return procenatKofeina;
	}
	public void setProcenatKofeina(double procenatKofeina) {
		this.procenatKofeina = procenatKofeina;
	}
	@Override
	public double cenaPica() {
		double ukupnaCenaPica = (this.procenatKofeina * 30) + super.cenaSvihSastojaka();
		return ukupnaCenaPica;
	}
	@Override
	public void stampaj() {
		System.out.println(super.getNaziv() + ", procenat kofeina " + this.procenatKofeina + "%, cena: " + this.cenaPica() );
		System.out.println("Sastojci: ");
		for (int i = 0; i < super.getListaSastojaka().size(); i++) {
			super.getListaSastojaka().get(i).stampaj();
		}
	}
}