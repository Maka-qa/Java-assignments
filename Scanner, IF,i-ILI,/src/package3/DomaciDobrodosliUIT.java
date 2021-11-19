package package3;

public class DomaciDobrodosliUIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Napisati program gde korisnik unese ime, prezime i pol (preko void metode) a main metoda stampa i vraca "Dobrodosao u IT" ili "Dobrodosla u IT" zavisno koji pol unese
		String rezultatFunkcije = pocetakIT("", "Nisavic", "zenski");
		System.out.println(rezultatFunkcije);
		}
		public static String pocetakIT(String ime, String prezime, String pol) {
			String dobrodoslica;
			if (pol.equals("muski") ) {
				dobrodoslica = "Dobrodosao u IT";
			} else if (pol.equals("zenski")) {
				dobrodoslica = "Dobrodosla u IT";
			}else {
				dobrodoslica = "Nepravilan unos";
			}
			return dobrodoslica;
	}

}
