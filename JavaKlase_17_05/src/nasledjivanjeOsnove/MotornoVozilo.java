package nasledjivanjeOsnove;
public class MotornoVozilo {
	private int brojTockova;
	private int brojVrata;
	private String registarskaOznaka;
	public MotornoVozilo(int brojTockova, int brojVrata, String registarskaOznaka) {
		super();
		this.brojTockova = brojTockova;
		this.brojVrata = brojVrata;
		this.registarskaOznaka = registarskaOznaka;
	}
	public MotornoVozilo(int brojTockova, int brojVrata) {
		super();
		this.brojTockova = brojTockova;
		this.brojVrata = brojVrata;
	}
	public int getBrojTockova() {
		return brojTockova;
	}
	public void setBrojTockova(int brojTockova) {
		this.brojTockova = brojTockova;
	}
	public int getBrojVrata() {
		return brojVrata;
	}
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	public String getRegistarskaOznaka() {
		return registarskaOznaka;
	}
	public void setRegistarskaOznaka(String registarskaOznaka) {
		this.registarskaOznaka = registarskaOznaka;
	}
	public void stampajPodatkeOVozilu() {
		System.out.println("Ispis iz roditeljske klase");
	}
}