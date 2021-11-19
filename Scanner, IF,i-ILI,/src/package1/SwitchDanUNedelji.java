package package1;
import java.util.Scanner;
public class SwitchDanUNedelji {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite redne broj dana: ");
		
		Scanner s = new Scanner(System.in);
		
		int redniBrojDanaUNedelji = s.nextInt();
		
		switch (redniBrojDanaUNedelji) {
		case 1: {
			System.out.println("Ponedeljak je");
			break;
		}
		case 2: {
			System.out.println("Utorak je");
			break;
		}
		case 3: {
			System.out.println("Sreda je");
			break;
		}
		case 4: {
			System.out.println("Cetvrtak je");
			break;
		}
		case 5: {
			System.out.println("Petak je");
			break;
		}
		case 6: {
			System.out.println("Subota je");
			break;
		}
		case 7: {
			System.out.println("Nedelja je");
			break;
		}
		default:
			System.out.println("Redni broj dana u nedelji nije validan");
			break;
		}
	}
}

/* 		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Unesi redni broj dana u nedelji: ");
		
		String br = s.next();
		br.toLowerCase();-unos za MALA slova
		br.toUpperCase();-unos za VELIKA slova
		
		switch (br) {
		case "ponedeljak": {
			System.out.println("Ponedeljak");
			break;
		}
		case "utorak": {
			System.out.println("Utorak");
			break;
		}
		case "sreda": {
			System.out.println("Sreda");
			break;
		}
		case "cetvrtak": {
			System.out.println("Cetvrtak");
			break;
		}
		case "petak": {
			System.out.println("Petak");
			break;
		}
		case "subota": {
			System.out.println("Subota");
			break;
		}
		case "nedelja": {
			System.out.println("Nedelja");
			break;
		}
		default:
			System.out.println("Uneli ste pogresan redni broj dana u nedelji");
			break;
		}

	}


}

---------------------------------------------------------------------



		Scanner s = new Scanner (System.in);
		
		System.out.println("Unesi redni broj dana u nedelji: ");
		
		int br = s.nextInt();
		
		switch (br) {
		case 1: {
			System.out.println("Ponedeljak");
			break;
		}
		case 2: {
			System.out.println("Utorak");
			break;
		}
		case 3: {
			System.out.println("Sreda");
			break;
		}
		case 4: {
			System.out.println("Cetvrtak");
			break;
		}
		case 5: {
			System.out.println("Petak");
			break;
		}
		case 6: {
			System.out.println("Subota");
			break;
		}
		case 7: {
			System.out.println("Nedelja");
			break;
		}
		default:
			System.out.println("Uneli ste pogresan redni broj dana u nedelji");
			break;
		}
*/