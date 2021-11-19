package automobil;

public class Automobil {
	public String marka;
	public String model;
	public String pogonskoGorivo;
	public int brojVrata;
	public int godProizvodnje;
	public Automobil() {
	}
	public Automobil(String marka, String model, String pogonskoGorivo, int brojVrata, int godProizvodnje) {
		this.marka = marka;
		this.model = model;
		this.pogonskoGorivo = pogonskoGorivo;
		this.brojVrata = brojVrata;
		this.godProizvodnje = godProizvodnje;
	}
	public void stampanjePodataka() {
		System.out.println("Automobil marke " + this.marka + " " + this.model + " koji koristi " + this.pogonskoGorivo
				+ ", sa brojem vrata " + this.brojVrata + ", proizveden je " + this.godProizvodnje + ". godine.");
	}
}

/* 1.napraviti klasu automobil koja od atributa ima marku, model,
 *  pogonsko gorivo, broj vrata, godinu proizvodnje. 
 *  Takodje ima 2 konstruktora: prvi prima sve atribute za argumente,
 *   a drugi je prazan
 *   
 *  2.takodje, ima funkciju koja stampa podatke o objektima  
 *  
 *  
 *  3.iz AutomobilGlavna klase instancirajete nekoliko objekata klase
 *   automobil i odstampajte podatke o njima pozivajuci metodu za
 *    stampanje te klase
 *    
 *  4. Dodati private atribut potrosnja na 100km, napraviti getter
 *   i setter i napraviti metodu koja odredjuje potrosnju na 100km,
 *    ako auto ima 3 vrata potrosnja je 5 litara, a ako auto ima 5
 *     vrata potrosnja je 6 litara, iz glavne klase ispisite model
 *      automobila i koliko trosi za svaki objekat
 *    
 *    */

/*package automobili;
public class Automobili {
	
//	napraviti klasu automobil koja od atributa ima marku, model,
//	pogonsko gorivo, broj vrata, godinu proizvodnje.
//	Takodje ima 2 konstruktora: prvi prima sve atribute za argumente, a drugi je prazan
//	takodje, ima funkciju koja stampa podatke o objektima
	
	public String markaAuta;
	public String modelAuta;
	public String pogonskoGorivo;
	public int brojVrata;
	public int godinaProizvodnje;
	private double potrosnja;
	
	public Automobili () {		
	}
	
	public Automobili (String marka, String model, String gorivo, int brojVrata, int godProizvodnje ) {
		this.markaAuta = marka;
		this.modelAuta = model;
		this.pogonskoGorivo = gorivo;
		this.brojVrata = brojVrata;
		this.godinaProizvodnje = godProizvodnje;
	}
	
	public void stampanjePodataka () {
		System.out.println("Automobil marke " + this.markaAuta + ", model " + this.modelAuta + " koristi pogonsko gorivo " + this.pogonskoGorivo +
				" ima " + this.brojVrata + " vrata i proizveden je " + this.godinaProizvodnje + " godine. Potrosnja na 100 km mu je + " + this.potrosnja);
	}
	public double getPotrosnja() {	
		return potrosnja;
	}
	public void setPotrosnja() {
		racunanjePotrosnje();
		
	}
	
	private void racunanjePotrosnje () {
		if (this.brojVrata == 3) {
			this.potrosnja = 5;
		} else  if (this.brojVrata == 5) {
			this.potrosnja = 6;
		}
	}
	
}

  *
  *
  *
  *
  *
  *
  *package automobili;
public class AutomobiliGlavna {
	public static void main(String[] args) {
		Automobili auto1 = new Automobili("Volkswagen", "Polo", "benzin", 3, 2004);
		Automobili auto2 = new Automobili("Opel", "Corsa", "dizel", 5, 2010);
		Automobili auto3 = new Automobili("Lamborgini", "Galardo", "benzin", 3, 2011);
		
		auto1.setPotrosnja();
		auto2.setPotrosnja();
		auto3.setPotrosnja();
		System.out.println(auto1.modelAuta + " na 100 km trosi " + auto1.getPotrosnja() + " litara.");
		System.out.println(auto2.modelAuta + " na 100 km trosi " + auto2.getPotrosnja() + " litara.");
		System.out.println(auto3.modelAuta + " na 100 km trosi " + auto3.getPotrosnja() + " litara.");
		
		
		auto1.stampanjePodataka();
		auto2.stampanjePodataka();
		auto3.stampanjePodataka();
	}
}
*/
 