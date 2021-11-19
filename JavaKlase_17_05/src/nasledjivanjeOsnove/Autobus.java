package nasledjivanjeOsnove;
public class Autobus extends MotornoVozilo{
		private String tipaAutobusa;
		private int brStojecihMesta;
		public Autobus(int brojTockova, int brojVrata, String registarskaOznaka, String tipaAutobusa,
				int brStojecihMesta) {
			super(brojTockova, brojVrata, registarskaOznaka);
			this.tipaAutobusa = tipaAutobusa;
			this.brStojecihMesta = brStojecihMesta;
		}
		public Autobus(int brojTockova, int brojVrata, String tipaAutobusa,
				int brStojecihMesta) {
			super(brojTockova, brojVrata);
			this.tipaAutobusa = tipaAutobusa;
			this.brStojecihMesta = brStojecihMesta;
		}
		public Autobus(MotornoVozilo m1, String tipaAutobusa,
				int brStojecihMesta) {
			super(m1.getBrojTockova(), m1.getBrojVrata(), m1.getRegistarskaOznaka());
			this.tipaAutobusa = tipaAutobusa;
			this.brStojecihMesta = brStojecihMesta;
		}
		public String getTipaAutobusa() {
			return tipaAutobusa;
		}
		public void setTipaAutobusa(String tipaAutobusa) {
			this.tipaAutobusa = tipaAutobusa;
		}
		public int getBrStojecihMesta() {
			return brStojecihMesta;
		}
		public void setBrStojecihMesta(int brStojecihMesta) {
			this.brStojecihMesta = brStojecihMesta;
		}
		public void stampajPodatkeOVozilu() {
			System.out.println("Tip autobusa " + this.tipaAutobusa + " ima vrata " + super.getBrojVrata());
		}
}