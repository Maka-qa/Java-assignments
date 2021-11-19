package zadatakOsoba;
public class StudentMasterStudija extends Student {
	
	private String omiljeniPredmet;
	private int brojVezbiUNedelji;
	
	public StudentMasterStudija(String imeIPrezime, long jMBG, String brIndexa, String omiljeniPredmet,
			int brojVezbiUNedelji) {
		super(imeIPrezime, jMBG, brIndexa);
		this.omiljeniPredmet = omiljeniPredmet;
		this.brojVezbiUNedelji = brojVezbiUNedelji;
	}
	public String getOmiljeniPredmet() {
		return omiljeniPredmet;
	}
	public void setOmiljeniPredmet(String omiljeniPredmet) {
		this.omiljeniPredmet = omiljeniPredmet;
	}
	public int getBrojVezbiUNedelji() {
		return brojVezbiUNedelji;
	}
	public void setBrojVezbiUNedelji(int brojVezbiUNedelji) {
		this.brojVezbiUNedelji = brojVezbiUNedelji;
	}
	
	
}