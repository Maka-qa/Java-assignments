package package1;

import java.util.Scanner;

public class Pozitivan_negativan_ili_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cifre = new Scanner (System.in);
		System.out.println("Unesite broj:");
		int broj = cifre.nextInt();
		if (broj < 0) {
			System.out.println("Broj je negativan.");
		}
		else if (broj == 0) {
			System.out.println("Broj je 0.");
		}
		else {
			System.out.println("Broj je pozitivan.");
		}
	}
}
