package radnik;
import java.util.ArrayList;
public class RadnikGlavna {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Radnik milovan = new Radnik(1231231231231l, "Milovan Pocek", 3, 5, 23);
		System.out.println("Radnik " + milovan.getImeIPrezime() + " ima platu " + milovan.platu()  + 
				" i ima dana godisnjeg: " + milovan.daniGodisnjeg() + " da li cemo mu dati kredit " + milovan.kreditnoSposoban());
		Firma maxFirma = new Firma("max", "kocka", 2021);
		Firma promet = new Firma("trgovina");
		promet.setNaziv("Megapromet");
		promet.setGodOsnivanja(1920);
		ArrayList<Firma> listaFirmi = new ArrayList<Firma>();
		listaFirmi.add(maxFirma);
		listaFirmi.add(promet);
		for (int i = 0; i < listaFirmi.size(); i++) {
			listaFirmi.get(i).stampajOFirmi();
		}
		System.out.println(milovan.getJmbg());
		int milovanovGodisnji = milovan.daniGodisnjeg();
		Radnik Sloba = new Radnik(1234123412341l);
		Sloba.setImeIPrezime("Sloba Milosevic");
		Radnik dragana;
		dragana = new Radnik(1231231231l, "Dragana Dragic", 4, 5, 12);
		System.out.println(dragana.getImeIPrezime());
		//dragana.setStepenStrucneSpreme(9);
		maxFirma.zaposljavanjeRadnika(milovan);
		maxFirma.zaposljavanjeRadnika(dragana);
		maxFirma.ispisPodatakaOZaposlenima();
		promet.ispisPodatakaOZaposlenima();
		promet.zaposljavanjeRadnika(Sloba);
		promet.ispisPodatakaOZaposlenima();
	}
}
/*package radnik;
public class RadnikGlavna {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Radnik milovan = new Radnik(1231231231231l, "Milovan Pocek", 3, 5, 23);
		System.out.println("Radnik " + milovan.getImeIPrezime() + " ima platu " + milovan.platu()  + 
				" i ima dana godisnjeg: " + milovan.daniGodisnjeg() + " da li cemo mu dati kredit " + milovan.kreditnoSposoban());
		Firma maxFirma = new Firma("max", "kocka", 2021);
		Firma promet = new Firma("trgovina");
		promet.setNaziv("Megapromet");
		promet.setGodOsnivanja(1920);
		System.out.println(milovan.getJmbg());
		int milovanovGodisnji = milovan.daniGodisnjeg();
		Radnik Sloba = new Radnik(1234123412341l);
		Sloba.setImeIPrezime("Sloba Milosevic");
		Radnik dragana;
		dragana = new Radnik(1231231231l, "Dragana Dragic", 4, 5, 12);
		System.out.println(dragana.getImeIPrezime());
		dragana.setStepenStrucneSpreme(9);
	}
}

 package radnik;
public class RadnikGlavna {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Radnik milovan = new Radnik(1231231231231l, "Milovan Pocek", 3, 5, 23);
		System.out.println("Radnik " + milovan.getImeIPrezime() + " ima platu " + milovan.platu()  + 
				" i ima dana godisnjeg: " + milovan.daniGodisnjeg() + " da li cemo mu dati kredit " + milovan.kreditnoSposoban());
		System.out.println(milovan.getJmbg());
		int milovanovGodisnji = milovan.daniGodisnjeg();
		Radnik Sloba = new Radnik(1234123412341l);
		Sloba.setImeIPrezime("Sloba Milosevic");
		Radnik dragana;
		dragana = new Radnik(1231231231l, "Dragana Dragic", 4, 5, 12);
		System.out.println(dragana.getImeIPrezime());
		dragana.setStepenStrucneSpreme(9);
	}
}
------------------------------------------------------------------------
 4. Kreirati klasu Radnik koja ima:
● jmbg radnika (razmisliti kog tipa ce biti promenljiva)
● ime i prezime
● broj dece (1,2,3,... ili 0 ako nema dece)
● stepen strucne spreme (od 1 do 8)
● godine radnog staza
● gettere i settere za sve atribute (jmbg-a ne sme da se menja)
● konstruktore koje smatrate da su logicni da postoje
● metodu koja vraca koeficijent slozenosti
● metodu koja racuna i vraca minuli rad
● metodu koja racuna platu radnika, plata se racuna po formuli:
25000 + (koeficijent slozenosti + minuli rad) * 10000
● metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban
ako je plata veca od 50 000)
● metodu koja racuna i vraca koliko slobodnih dana radnik ima za tekucu
godinu.Svaki radnik godisnje ima 22 radna dana, i za svako dete plus po 2
dana
U main metodi kreirati objekat radnik i pozvati sve metode
Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog
staža:- do 10 godina 0.05
od 10-20 godina 0.75
- preko 20 godina 0.1
Koeficijent slozenosti
- (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
- (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
- (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
- (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
- (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
- (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
- (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
- (VIII stepen) Doktorat nauka, koeficijent: 4,12

 *
 *------------------------------------------
 *2.  dodajte klasu firma koja ima od atributa naziv oblastPoslovanja 
 *i godinu kada je osnovana
 *
 *3.iz glavne klase instancirati nekoliko firmi
 *
 *4.klasi firma dodati atribut radmnici koji je tipa lista radnika,
 * zatim napraviti funkciju dodavanja radnika u klasi firma koja 
 * dodaje radnike toj firm, takodje dodati funkciju koja ispisuje
 *  podatke o radnicima te firme (ako firma nema ni jednog radnika
 *   onda to i ispisati)
 *   
 *5.Na kraju iz glavne klase dodajte par radnika firmi 
 *   i ispisite podatke o zaposlenima u firmi
 */