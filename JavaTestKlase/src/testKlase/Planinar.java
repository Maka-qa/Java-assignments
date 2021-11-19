package testKlase;

public abstract class Planinar {
	
	protected int jedinstveniCelobrojniIdentifikacioniBroj;
	protected String imeIPrezime;
	
	
	public Planinar(int jedinstveniCelobrojniIdentifikacioniBroj, String imeIPrezime) {
		super();
		this.jedinstveniCelobrojniIdentifikacioniBroj = jedinstveniCelobrojniIdentifikacioniBroj;
		this.imeIPrezime = imeIPrezime;
	}
	public int getJedinstveniCelobrojniIdentifikacioniBroj() {
		return jedinstveniCelobrojniIdentifikacioniBroj;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	
	public abstract void stampaj();
	public abstract double clanarinaPlaninara() ;
	public abstract boolean uspesanUspon(Planina planina);

}
