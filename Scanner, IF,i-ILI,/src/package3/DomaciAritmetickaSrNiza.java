package package3;

public class DomaciAritmetickaSrNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati niz brojeva i prikazati aritmeticku sredinu niza
		double [] nizBrojeva = {3, 7, 10, 29, 30};
		double zbir=0;
		for (int i =0; i< nizBrojeva.length; i++) {
			zbir += nizBrojeva [i];
		}
		double aritSredina = zbir / nizBrojeva.length;
		System.out.println("Aritmeticka sredina niza je " + aritSredina);
	}

}
