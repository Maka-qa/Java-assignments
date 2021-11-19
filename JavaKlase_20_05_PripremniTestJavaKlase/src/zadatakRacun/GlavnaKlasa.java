package zadatakRacun;
import java.util.ArrayList;
public class GlavnaKlasa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sastojak jabuka = new Sastojak("jabuka", 50, 1);
		//jabuka.stampaj();
		Kafa makijato = new Kafa("makijato", 7);
		Sastojak mleko = new Sastojak("mleko", 20, 2);
		Sastojak slatkaPavlaka = new Sastojak("slatka pavlaka", 10, 3);
		makijato.dodajSastojak(mleko);
		makijato.dodajSastojak(slatkaPavlaka);
		Koktel goldenSunrise = new Koktel("golden sunrise");
		Sastojak tekila = new Sastojak("tekila olmeca", 10, 25);
		Sastojak multivitamin = new Sastojak("multivitamin", 100, 1);
		Sastojak limun = new Sastojak("limun", 5, 3);
		goldenSunrise.dodajSastojak(limun);
		goldenSunrise.dodajSastojak(tekila);
		goldenSunrise.dodajSastojak(multivitamin);
		Kafa neskafa = new Kafa("nes kafa", 5);
		neskafa.dodajSastojak(mleko);
		neskafa.dodajSastojak(slatkaPavlaka);
		Koktel mojito = new Koktel("mojito");
		Sastojak votka = new Sastojak("votka", 10, 15);
		Sastojak menta = new Sastojak("menta", 3, 70);
		mojito.dodajSastojak(limun);
		mojito.dodajSastojak(votka);
		mojito.dodajSastojak(menta);
		Koktel whiteRussian = new Koktel("white Russian");
		whiteRussian.dodajSastojak(votka);
		whiteRussian.dodajSastojak(mleko);
		ArrayList<Pice> picaSaRacuna = new ArrayList<Pice>();
		picaSaRacuna.add(makijato);
		picaSaRacuna.add(neskafa);
		picaSaRacuna.add(whiteRussian);
		picaSaRacuna.add(mojito);
		picaSaRacuna.add(goldenSunrise);
		double ukupnaCenaRacuna = 0;
		int brojac = 1;
		for (int i = 0; i < picaSaRacuna.size(); i++) {
			ukupnaCenaRacuna+=picaSaRacuna.get(i).cenaPica();
			System.out.print(brojac + ". pice:");
			brojac++;
			picaSaRacuna.get(i).stampaj();
			System.out.println("---------------------------------------------");
		}
		System.out.println("Ukupna cena racuna je " + ukupnaCenaRacuna + " din");
	}
}