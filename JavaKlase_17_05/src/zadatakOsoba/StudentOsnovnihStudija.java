package zadatakOsoba;
public class StudentOsnovnihStudija extends Student {
	
	private String odsek;
	private int godinaStudija;
	
	public StudentOsnovnihStudija(String imeIPrezime, long jMBG, String brIndexa, String odsek, int godinaStudija) {
		super(imeIPrezime, jMBG, brIndexa);
		this.odsek = odsek;
		this.godinaStudija = godinaStudija;
	}
	public String getOdsek() {
		return odsek;
	}
	public void setOdsek(String odsek) {
		this.odsek = odsek;
	}
	public int getGodinaStudija() {
		return godinaStudija;
	}
	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	
}