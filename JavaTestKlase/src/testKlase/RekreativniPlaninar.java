package testKlase;

public class RekreativniPlaninar extends Planinar {
	
	private int tezinaOpreme;
	private String nazivOkruga;
	private int maksimalniUsponBezOpreme;
	

	public RekreativniPlaninar(int jedinstveniCelobrojniIdentifikacioniBroj, String imeIPrezime, int tezinaOpreme,
			String nazivOkruga, int maksimalniUsponBezOpreme) {
		super(jedinstveniCelobrojniIdentifikacioniBroj, imeIPrezime);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maksimalniUsponBezOpreme = maksimalniUsponBezOpreme;
	}

	
	public int getTezinaOpreme() {
		return tezinaOpreme;
	}


	public String getNazivOkruga() {
		return nazivOkruga;
	}


	public int getMaksimalniUsponBezOpreme() {
		return maksimalniUsponBezOpreme;
	}


	@Override
	public void stampaj() {
		
		System.out.println("Rekreativac,id:" + super.getJedinstveniCelobrojniIdentifikacioniBroj());
		System.out.println("Ime: " + super.getImeIPrezime());
		System.out.println("Okrug: " + getNazivOkruga());
	
	}

	@Override
	public double clanarinaPlaninara() {
	return 1000;
	}


	@Override
	public boolean uspesanUspon(Planina planina) {
		if(this.maksimalniUsponBezOpreme + (this.tezinaOpreme) < planina.getVisinaPlanine()) {
			return false;
		} else
		return true;
		
	
	}
	

}
