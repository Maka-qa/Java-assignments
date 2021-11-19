package package4;

import java.util.Scanner;

public class IF_Radni1do5Vikend67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*sa tastature uneti redni broj od 1 do 7 i 
		u zavisnosti od toga ispisati: "Radni dan" (1-5),
		a za "Vikend" za unose 6 i 7*/
		
		System.out.println("Molim Vas unesite redni broj dana u nedelji: ");
		
		Scanner s = new Scanner (System.in);
		
		int brDana = s.nextInt();
		
		if (brDana>=1 || brDana<=5) {
			System.out.println("Radni dan.");
		} else if (brDana == 6 || brDana == 7) {
			System.out.println("Vikend");
		} else
			System.out.println("Uneli ste pogresan redni broj dana. Unesite broj od 1 do 7.");
	}

}
