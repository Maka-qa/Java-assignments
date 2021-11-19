package package2;

import java.util.Scanner;

public class Domaci1_26_04_KolikoMeseciImaNbrDana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Napisati program koji od korisnika trazi unos broja
		 *  dana u jednom mesecu i da za rezultat ispise koliko 
		 *  meseci u godini ima toliko dana.
		 * Primer. korisnik unese 31 a program vrati rezultat
		 *  "7 meseci u godini ima 31 dan"
 */

		Scanner s = new Scanner (System.in);
		
		System.out.println("Unesite broj dana u mesecu: ");
		
		int broj = s.nextInt();

		if (broj == 1) {
			System.out.println("Svi meseci imaju jedan dan.");
		} else if ((broj > 1) && (broj <= 28)) {
			System.out.println("Svi meseci imaju " + broj + " dana.");
		} else if (broj == 29) {
			System.out.println("Februar kad je prestupna godina i svi ostali meseci imaju 29 dana.");
		} else if ((broj > 29) && (broj <= 30)) {
			System.out.println("Svi meseci osim februara imaju " + broj + " dana.");
		} else if (broj == 31) {
			System.out.println("Januar, Mart, Maj, Jul, Avgust, Oktobar i Decembar imaju po " + broj + " dan.");
		} else {
			System.out.println("Uneli ste nulu, negativan broj ili veci od 31");

		}
	}



		
	/*	switch ( brDana ) {
		case 30: {
			System.out.println( "4 meseca u godini ima 30 dana. ");
		}
		case 31: {
			System.out.println("7 meseci u godini ima 31 dan.");
		}
		case 28: {
			System.out.println("Samo februar ima 28 dana.");
		}
		default:
			System.out.println("Uneli ste po");
		} */
	}


