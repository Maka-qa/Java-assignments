package package2;

import java.util.Scanner;

public class ForPozitivneRacunaOdUnetihScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Napisati program koji ucitava N brojeva od korisnika
//		i ispisuje koliko je pozitivnih brojeva uneo.
		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Koliko brojeva zelite da unesete: ");
		int ukupanBroj = scanner.nextInt();
		int brojacPozitivnih = 0;
		int broj;
		
		for (int i=1; i <=ukupanBroj; i++) {
			
			System.out.println("Unesite " + i + " broj: ");
			broj = scanner.nextInt();
			
			if (broj> 0) {
				brojacPozitivnih++;
			}
		} System.out.println("Uneli ste " + brojacPozitivnih + " pozitivna broja.");

	}

}

		/*int kolikoBr;
		// N mora biti veci od 0
		do {
			System.out.println("Koliko brojeva zelite da unesete:");
			kolikoBr = s.nextInt();
			if(kolikoBr < 0) {
				System.out.println("Pogresan unos, uneti broj mora biti pozitivan.");
			}
		} while (kolikoBr <= 0);
		int unetBr;
		int brojac = 0;
		for (int i = 0; i < kolikoBr; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj:");
			unetBr = s.nextInt();
			if (unetBr > 0) {
				brojac++;
			}
		}
		System.out.println("Uneto je " + brojac + " pozitivnih brojeva.");
		s.close();*/
		
	