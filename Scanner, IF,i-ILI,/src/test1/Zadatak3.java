package test1;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Napisite program koji, koristeci petlju, racuna zbir unetih brojeva, sve dok korisnik ne unese 0
		//Primer ispisa resenja:

		//Molim vas unesite 1. broj
		//4
		//Trenutni zbir je 4
		//Molim vas unesite 2. broj
		//5
		//Trenutni zbir je 9
		//Molim vas unesite 3. broj
		//0
		//Uneli ste 0 Kraj programa

		Scanner s = new Scanner (System.in);
		int brojac = 1;
		int zbir =0;
		do {
			System.out.println("Molim Vas unesite " + brojac + ". broj:");
			int unetBroj = s.nextInt();
			zbir+=unetBroj;
			if (unetBroj==0) {
				System.out.println("Uneli ste 0. Kraj programa.");
				break;
			}
			else {
				System.out.println("Trenutni zbir je: " + zbir);
			brojac++;
			}
		} while (true);
	}

}

/* 		Scanner s = new Scanner(System.in);
		int redniBroj=1;
		System.out.println("Molim Vas unesite " + redniBroj+ ". broj");
		int broj = s.nextInt();
		int zbir = broj;
		System.out.println("Trenutni zbir je "+ broj);
		while (broj != 0) {
			System.out.println("Molim Vas unesite "+ (redniBroj+1) +". broj");
			broj = s.nextInt();
			if (broj==0) {
				System.out.println("Uneli ste 0. Kraj programa");
			} else {
			zbir += broj;
			redniBroj++;
			System.out.println("Trenutni zbir je " + zbir);
		}
	}
}
} */
