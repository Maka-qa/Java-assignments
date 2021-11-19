package popravniJava;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Napisati funkciju koja prima broj, a vraca koji je to dan 
		 * u nedelji.
	Korisnik unosi broj od 1 do 7 kroz tastaturu a program ispise koji
 	je to dan u nedelji
	Ispis vrsiti iz glavne metode.
	Bonus deo: ako korisnik unese broj koji ne pripada rasponu od 1 do 7, 
	ispisati: Uneli ste pogresan broj  */
		System.out.println("Molim Vas unesite redni broj dana u nedelji: ");
		
		Scanner s = new Scanner (System.in);
		
	
		int redniBrDana = s.nextInt();
		
		
		switch (redniBrDana) {
		case 1: {
			System.out.println(redniBrDana + ". dan u nedelji je ponedeljak");
			break;
		}
		case 2: {
			System.out.println(redniBrDana + ". dan u nedelji je utorak");
			break;
		}
		case 3: {
			System.out.println(redniBrDana + ". dan u nedelji je sreda");
			break;
		}
		case 4: {
			System.out.println(redniBrDana + ". dan u nedelji je cetvrtak");
			break;
		}
		case 5: {
			System.out.println(redniBrDana + ". dan u nedelji je petak");
			break;
		}
		case 6: {
			System.out.println(redniBrDana + ". dan u nedelji je subota");
			break;
		}
		case 7: {
			System.out.println(redniBrDana + ". dan u nedelji je nedelja");
			break;
		}
		default:
			System.out.println("Uneli ste pogresan redni broj dana u nedelji. Unesite broj od 1 do 7.");
		}
		
		
	}

}
