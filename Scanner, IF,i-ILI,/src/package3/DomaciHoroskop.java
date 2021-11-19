package package3;

import java.util.Scanner;

public class DomaciHoroskop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program gde korisnik unese datum rodjenja i program vrati koji je to
		// horoskopski znak
		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite dan rodjenja");
		int danRodjenja = s.nextInt();
		System.out.println(" Unesite mesec rodjenja");
		int mesecRodjenja = s.nextInt();
		switch (mesecRodjenja) {
		case 1: {
			if (danRodjenja <= 20) {
				System.out.println("Horoskopski znak je Jarac");
			} else {
				System.out.println("Horoskopski znak je Vodolija");
			}
			break;
		}
		case 2: {
			if (danRodjenja <= 19) {
				System.out.println("Horoskopski znak je Vodolija");
			} else {
				System.out.println("Horoskopski znak je Ribe ");
			}
			break;
		}
		case 3: {
			if (danRodjenja <= 20) {
				System.out.println("Horoskopski znak je Ribe ");
			} else {
				System.out.println("Horoskopski znak je Ovan");
			}
			break;
		}
		case 4: {
			if (danRodjenja <= 20) {
				System.out.println("Horoskopski znak je Ovan ");
			} else {
				System.out.println("Horoskopski znak je Bik");
			}
			break;
		}
		case 5: {
			if (danRodjenja <= 21) {
				System.out.println("Horoskopski znak je Bik");
			} else {
				System.out.println("Horoskopski znak je Blizanci");
			}
			break;
		}
		case 6: {
			if (danRodjenja <= 21) {
				System.out.println("Horoskopski znak je Blizanci ");
			} else {
				System.out.println("Horoskopski znak je Rak");
			}
			break;
		}
		case 7: {
			if (danRodjenja <= 22) {
				System.out.println("Horoskopski znak je Rak ");
			} else {
				System.out.println("Horoskopski znak je Lav");
			}
			break;
		}
		case 8: {
			if (danRodjenja <= 22) {
				System.out.println("Horoskopski znak je Lav ");
			} else {
				System.out.println("Horoskopski znak je Devica");
			}
			break;
		}
		case 9: {
			if (danRodjenja <= 22) {
				System.out.println("Horoskopski znak je Devica ");
			} else {
				System.out.println("Horoskopski znak je Vaga");
			}
			break;
		}
		case 10: {
			if (danRodjenja <= 23) {
				System.out.println("Horoskopski znak je Vaga ");
			} else {
				System.out.println("Horoskopski znak je Skorpija");
			}
			break;
		}
		case 11: {
			if (danRodjenja <= 22) {
				System.out.println("Horoskopski znak je Skorpija ");
			} else {
				System.out.println("Horoskopski znak je Strelac");
			}
			break;
		}
		case 12: {
			if (danRodjenja <= 21) {
				System.out.println("Horoskopski znak je Strelac ");
			} else {
				System.out.println("Horoskopski znak je Jarac");
			}
			break;
		}
		default: {
			System.out.println("Uneli ste neispravne podatke");
			break;
		}
		}
	}

}
