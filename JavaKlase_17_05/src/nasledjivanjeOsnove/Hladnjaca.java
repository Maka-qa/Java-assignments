package nasledjivanjeOsnove;
public class Hladnjaca extends Kamion{
		private int temperaturaUHladnjaci;
		private double zapreminaZamrzivaca;
		public Hladnjaca(int brojTockova, int brojVrata, String registarskaOznaka, String tipKamiona,
				String kategorijaVozila, int temperaturaUHladnjaci, double zapreminaZamrzivaca) {
			super(brojTockova, brojVrata, registarskaOznaka, 0, tipKamiona, kategorijaVozila);
			this.temperaturaUHladnjaci = temperaturaUHladnjaci;
			this.zapreminaZamrzivaca = zapreminaZamrzivaca;
		}
		public int getTemperaturaUHladnjaci() {
			return temperaturaUHladnjaci;
		}
		public void setTemperaturaUHladnjaci(int temperaturaUHladnjaci) {
			this.temperaturaUHladnjaci = temperaturaUHladnjaci;
		}
		public double getZapreminaZamrzivaca() {
			return zapreminaZamrzivaca;
		}
		public void setZapreminaZamrzivaca(double zapreminaZamrzivaca) {
			this.zapreminaZamrzivaca = zapreminaZamrzivaca;
		}
		public void stampajPodatkeOVozilu() {
			System.out.println("Hladnja ima temperaturu zamrzivaca " + this.temperaturaUHladnjaci + " i on ima " + super.getBrojPrikolica() + " prikolica");
		}
}