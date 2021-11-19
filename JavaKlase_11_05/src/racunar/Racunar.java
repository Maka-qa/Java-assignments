package racunar;

public class Racunar {
	
	public String markaRacunara;
	public String modelRacunara;
	public int ramGb;
	public String procesor;
	
	public Racunar(String marka,String model, int ram, String procesor) {
		this.markaRacunara = marka;
		this.modelRacunara = model;
		this.ramGb = ram;
		this.procesor = procesor;
	}
	
	public void stampajPodatkeORacunaru() {
		System.out.println("Racunar " + this.markaRacunara + " " + this.modelRacunara + " memorija: " + this.ramGb
				+ " GB " + " sa procesorom " + this.procesor);
	}
	
	
}


/* 1.  dodajte klasu racunar (atributi: marka model ram procesor)
21:13
polazniku kursa dodajte atribut polaznikov racunar
21:13
i dodajte metodu koja stampa podatke o polaznikovom imenu
 i racunaru koji koristi 
 
 *
 * 2. na kraju instancirajte par racunara i dodajte ih polaznicima 
 * i odstampajte poruke
 */