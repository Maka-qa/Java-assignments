package package2;

import java.util.Scanner;

public class ForZeljeniBrOdUnetihScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Napisati program koji ucitava N brojeva
//		od korisnika i proverava da li se u
//		unetim brojevima nalazi broj K
//		(K takodje unosi korisnik)
	//  Kad korisnik unese broj K program ispise "Zeljeni broj je pronadjen"
	//  ako se ne nadje zeljeni broj ispise se poruka da "Zeljeni broj nije pronadjen"
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Koliko brojeva zelite da unesete: ");
		int N = scanner.nextInt();
		System.out.println("Unesite zeljeni broj:");
		int M =scanner.nextInt();
		int unetiBroj;
		int brojZaProveru = 1;
		
		for (int i = 1; i <=N; i++) {
			System.out.println("Unesi " + i + ". broj:");
			unetiBroj = scanner.nextInt();
			if (unetiBroj == M) {
				brojZaProveru++;
				System.out.println("Pronasli smo zeljeni broj.");
				break;
				
			}
			
		}
		
		if (brojZaProveru == 1) {
			System.out.println("Nismo nasli zeljeni broj.");
		}
		

	}

}
