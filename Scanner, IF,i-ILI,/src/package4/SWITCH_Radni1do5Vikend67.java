package package4;

import java.util.Scanner;

public class SWITCH_Radni1do5Vikend67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub#

		/*
		 * sa tastature uneti redni broj od 1 do 7 i u zavisnosti od toga ispisati:
		 * "Radni dan" (1-5), a za "Vikend" za unose 6 i 7
		 */

		System.out.println("Molim Vas unesite redni broj dana u nedelji: ");

		Scanner s = new Scanner(System.in);

		int brDana = s.nextInt();
		
		switch (brDana) {
		case 1: {
			System.out.println(brDana + ". dan u nedelji je ponedeljak");
			break;
		}
		case 2: {
			System.out.println(brDana + ". dan u nedelji je utorak");
			break;
		}
		case 3: {
			System.out.println(brDana + ". dan u nedelji je sreda");
			break;
		}
		case 4: {
			System.out.println(brDana + ". dan u nedelji je cetvrtak");
			break;
		}
		case 5: {
			System.out.println(brDana + ". dan u nedelji je petak");
			break;
		}
		case 6: {
			System.out.println(brDana + ". dan u nedelji je subota");
			break;
		}
		case 7: {
			System.out.println(brDana + ". dan u nedelji je nedelja");
			break;
		}
		default:
		System.out.println("Uneli ste pogresan redni broj dana u nedelji");
		break;
			
		}

	}

}
