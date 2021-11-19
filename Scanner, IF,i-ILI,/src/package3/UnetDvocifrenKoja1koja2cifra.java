package package3;

import java.util.Scanner;

public class UnetDvocifrenKoja1koja2cifra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Napisati zadatak koji za uneti dvocifreni broj napise koja je prva cifra, a koja druga
		// primer ispisa:
		//uneli ste 35
		//prvi broj je 3
		//drugi broj je 5

	      Scanner s = new Scanner (System.in);
	        System.out.println("Unesite dvocifreni broj: ");
	        int n = s.nextInt();
		
	        System.out.println("Uneli ste: " + n);
	        if (n > 9 && n < 100 ) {
	        System.out.println("Prva cifra je: " + n/10 );
	        System.out.println("Druga cifra je: " + n%10);
		}
	        else   System.out.println(" Niste uneli dvocifren broj");
	}

}
