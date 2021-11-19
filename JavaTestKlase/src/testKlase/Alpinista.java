package testKlase;

public class Alpinista extends Planinar {
	
	private int brPoena;
	
	

	public Alpinista(int jedinstveniCelobrojniIdentifikacioniBroj, String imeIPrezime, int brPoena) {
		super(jedinstveniCelobrojniIdentifikacioniBroj, imeIPrezime);
		this.brPoena = brPoena;
	}
	
	

	public int getBrPoena() {
		return brPoena;
	}



	public void setBrPoena(int brPoena) {
		this.brPoena = brPoena;
	}



	@Override
	public void stampaj() {
		System.out.println("Alpinista,id:" + super.getJedinstveniCelobrojniIdentifikacioniBroj());
		System.out.println("Ime: " + super.getImeIPrezime());
		System.out.println("Broj poena: " + getBrPoena());
	}

	@Override
	public double clanarinaPlaninara() {
		return 1500 - 50 *  getBrPoena();
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		
		if (planina.getVisinaPlanine()<=4000) {
			return true;
		} else
			return false;
		
	}

}
