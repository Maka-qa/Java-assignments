package nasledjivanjeOsnove;
public class OsnoveNasledjivanje {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotornoVozilo m1 = new MotornoVozilo(12, 3, "NS331tr");
		m1.stampajPodatkeOVozilu();
		Kamion k1 = new Kamion(8, 3, "Ns2342sdfsf", 1, "tamic", "B");
		k1.stampajPodatkeOVozilu();
		Autobus a1 = new Autobus(m1, "Doubledecker", 100);
		a1.stampajPodatkeOVozilu();
		Hladnjaca h1 = new Hladnjaca(8, 3, "ns 234324", "hladnjaca", "D", -32, 10000.56);
		h1.stampajPodatkeOVozilu();
	}
}