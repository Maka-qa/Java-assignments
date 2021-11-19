package package1;

import java.util.Scanner;

public class Domaci1_23_04_VozackaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Napisati program za prijavu polaganja vozacke dozvole 
		 * gde korisnik unese kroz skener broj godina i program 
		 * mu vrati jednu od cetiri poruke zavisno od unosa. 
		 * Ako je korisnik maloletan ispisuje 
		 * "Samo osobe starije od 18 godina mogu imati vozacku dozvolu"
		 * , ako je korisnik stariji od 65 godina ispisuje
		 *  "Korisnici stariji od 65 godina ne mogu polagati 
		 *  za vozacku dozvolu" i ako korisnik unese neki izmedju 
		 *  broj ispisati "Vasa prijava je prihvacena" */

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj godina: ");
		int broj = s.nextInt();

		if (broj >= 0 && broj < 18) {
			System.out.println("Samo osobe starije od 18 godina mogu imati vozacku dozvolu");
		} else if (broj > 65) {
			System.out.println("Korisnici stariji od 65 godina ne mogu polagati za vozacku dozvolu");
		} else if (broj >= 18 && broj <= 65) {
			System.out.println("Vasa prijava je prihvacena");
		} else
			System.out.println("Pogresan unos");

	}
}