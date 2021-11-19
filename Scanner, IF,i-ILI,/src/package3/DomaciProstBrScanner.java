package package3;

import java.util.Scanner;

public class DomaciProstBrScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program gde korisnik preko skenera unese brojeve od 1 do 10
		// (ukljucujuci 1 i 10) i program mu vrati odgovor da li je broj prost ili ne.
		// (Prost broj je onaj koji je deljiv samo sa brojem 1 i sa sobom)

		System.out.println("Unesite broj od 1 do 10");

		Scanner s = new Scanner(System.in);
		int broj = s.nextInt();
		int i = 2; // moguci delilac
		// parni brojevi su deljivi sa 2 pa samim tim nisu prosti, izuzev broja 2
		if (broj % i == 0 && broj != 2) {
			System.out.println("Uneti broj nije prost broj");
		} else if (broj == 1) {
			System.out.println("Uneli ste broj " + broj + ", taj broj ima poseban polozaj i nije ni prost ni slozen");
		}
		while (i <= broj) {
			if (broj % i != 0 || broj == 2) {
				System.out.println("Uneti broj je prost broj");
				i += 2;
				break;
			}
		}

	}

}
