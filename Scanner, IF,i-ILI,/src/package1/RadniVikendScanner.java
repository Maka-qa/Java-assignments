package package1;

import java.util.Scanner;

public class RadniVikendScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dan = new Scanner(System.in);
		System.out.println("Unesite redni broj dana:");
		int brojDana = dan.nextInt();
		if (brojDana >=1 && brojDana <=5) {
			System.out.println("Radni dan.");
		}
		else if (brojDana >5 && brojDana <=7) {
			System.out.println("Vikend.");
		}
		else {
			System.out.println("Vrednost van opsega.");

	}

}
}

/*  	Scanner s = new Scanner (System.in);

System.out.println("Unesite broj: ");


int broj = s.nextInt();

if (broj >=1 && broj <=5) {
	System.out.println("Radni dan");
} else if (broj == 6 || broj ==7) {
	System.out.println("Vikend");
} else 
	System.out.println("Pogresan unos");
} */