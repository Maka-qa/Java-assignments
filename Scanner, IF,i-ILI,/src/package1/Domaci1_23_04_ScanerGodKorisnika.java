package package1;

import java.util.Scanner;

public class Domaci1_23_04_ScanerGodKorisnika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Napisati program gde korisnik unese kroz skener neko ime, 
		 * prezime i broj godina, a program stampa ime, prezime 
		 * i godinu u kojoj je korisnik rodjen (godiste). */

		Scanner s = new Scanner (System.in);
		
		System.out.println("ime");
		String ime = s.next();
		
		System.out.println("prezime");
		String prezime = s.next();
		
		System.out.println("godine");
		int godine = s.nextInt();

                    System.out.println("Ime:" + ime);
		System.out.println("Prezime:" + prezime);
		System.out.println("Godina rodjenja:  " + (2021- godine));
	}

}
/* 	Scanner s = new Scanner (System.in);
		System.out.println("Unesite ime ");
		String ime = s.next();
		System.out.println("Unesite prezime ");
		String prezime = s.next();
		System.out.println("Unesite broj godina ");
		int brojGodina = s.nextInt();
		int trenutnaGodina = 2021;
		int godinaRodjenja = trenutnaGodina - brojGodina;
		System.out.println("Ime i prezime korisnika su "+ ime + " " + prezime + ", rodjen/a je " + godinaRodjenja + " godine");  */