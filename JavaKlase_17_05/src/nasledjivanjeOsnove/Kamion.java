package nasledjivanjeOsnove;
public class Kamion extends MotornoVozilo{
	private int brojPrikolica;
	private String tipKamiona;
	private String kategorijaVozila;
	public Kamion(int brojTockova, int brojVrata, String registarskaOznaka, int brojPrikolica, String tipKamiona,
			String kategorijaVozila) {
		super(brojTockova, brojVrata, registarskaOznaka);
		this.brojPrikolica = brojPrikolica;
		this.tipKamiona = tipKamiona;
		this.kategorijaVozila = kategorijaVozila;
	}
	public int getBrojPrikolica() {
		return brojPrikolica;
	}
	public void setBrojPrikolica(int brojPrikolica) {
		this.brojPrikolica = brojPrikolica;
	}
	public String getTipKamiona() {
		return tipKamiona;
	}
	public void setTipKamiona(String tipKamiona) {
		this.tipKamiona = tipKamiona;
	}
	public String getKategorijaVozila() {
		return kategorijaVozila;
	}
	public void setKategorijaVozila(String kategorijaVozila) {
		this.kategorijaVozila = kategorijaVozila;
	}
	public void stampajPodatkeOVozilu() {
		System.out.println("vozilo je tipa " + this.tipKamiona + " registarskih oznaka " + super.getRegistarskaOznaka());
	}
}