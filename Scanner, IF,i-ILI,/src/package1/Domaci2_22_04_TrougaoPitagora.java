package package1;

public class Domaci2_22_04_TrougaoPitagora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ako jedna stranica trougla iznosi 5 cm, druga iznosi 10 cm, 
		 * koliko iznosi
		 * treca stranica? (za ovo ce vam trebati mozda malo guglanja
		 *  ali nema mnogo
		 * pisanja, koristi se Pitagorina teorema. Funkcija za koren
		 *  je
		 * "math.sqrt(promenljiva)" ili "sqrt(promenljiva)"
		 */
		
		
		int stranicaA = 5;
		int stranicaB = 10;
		double hipotenuza = Math.sqrt((stranicaA * stranicaA) +
				(stranicaB * stranicaB));
		
		System.out.println("Iznos trece stranice (hipotenuze) je "
				+ hipotenuza + " cm.");
	
		
		/*
		 * int prvaKateta = 5; int drugaKateta = 10; int prvaKatetanakvadrat =
		 * prvaKateta * prvaKateta; int drugaKatetanakvadrat = drugaKateta *
		 * drugaKateta; int zbirKvadrataPrveIDruge = prvaKatetanakvadrat +
		 * drugaKatetanakvadrat; double trecaKateta = Math.sqrt(prvaKateta*prvaKateta +
		 * drugaKateta*drugaKateta); ;
		 * 
		 * 
		 * System.out.println("a =  " + prvaKateta ); System.out.println("b=  " +
		 * drugaKateta); System.out.println("a na kvadrat =" + prvaKatetanakvadrat);
		 * System.out.println("b na kvadrat =" + drugaKatetanakvadrat);
		 * System.out.println("c^2=a^2 + b^2 =" + zbirKvadrataPrveIDruge);
		 * System.out.println("c =" + trecaKateta);
		 */

	}

}
