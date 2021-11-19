package test1;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar
		//Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
		//1 evro je 0,0085 dinara
		//1 franak je 0,0093 dinara
		//1 dolar je 0,010 dinara
		//Ispise vrsiti iskljucivo iz main metode
				
		//Primeri ispisa u konzoli:
				
		//Molim vas unesite iznos u dinarima: 
		//1200
		//Molim vas da unesete valutu u koju da konvertujemo dinare: 
		//evro
		//1200.0 dinara, kad se prebaci u evro, iznosi 10.200000000000001 u toj valuti

		//Primer ispisa u konzoli kad se unese pogresna valuta
				
		//Molim vas unesite iznos u dinarima: 
		//123
		//Molim vas da unesete valutu u koju da konvertujemo dinare: 
		//zlato
		//Niste uneli dobru valutu

		
		
		Scanner s = new Scanner (System.in);
		System.out.println("Molim vas unesite iznos u dinarima:");
		double iznosUDinarima = s.nextDouble();
		
		
		System.out.println("Molim vas da unesete valutu u koju da konvertujemo dinare:");
		String valuta = s.next();
		
		double konverzijaValute = konverzijaIzDinara(iznosUDinarima, valuta);
		System.out.println(iznosUDinarima + "dinara, kad konvertujemo u " + valuta + ", daje " + konverzijaValute + valuta);
	}
	 

	private static double konverzijaIzDinara(double iznosUDinarima, String valuta) {
		double iznos = 0;
		if (valuta.equals("evro")) {
			iznos = iznosUDinarima * 0.0085;
		} else if (valuta.contentEquals("franak")) {
			iznos = iznosUDinarima * 0.0093;
		} else if (valuta.contentEquals("dolar")) {
			iznos = iznosUDinarima * 0.010;
		} 
		return iznos;
		

		/*Scanner s = new Scanner(System.in);
		System.out.println("Molim Vas unesite iznos u dinarima:");
		double iznosUDinarima = s.nextDouble();
		System.out.println("Molim Vas da unesete valutu u koju da konvertujemo dinare:");
		String valuta = s.next();
		if (valuta.equals("evro") || valuta.equals("franak") || valuta.equals("dolar")) {
			konverzijaValuta(iznosUDinarima, valuta);
			System.out.println(iznosUDinarima + " dinara, kad se prebaci u " + valuta + ", iznosi "
					+ konverzijaValuta(iznosUDinarima, valuta) + " u toj valuti");
		} else {
			System.out.println("Niste uneli dobru valutu");
		}
	}
	public static double konverzijaValuta(double iznosUDinarima, String valuta) {
		double konvertovaniIznos = 0;
		if (valuta.equals("evro")) {
			konvertovaniIznos = iznosUDinarima * 0.0085;
		} else if (valuta.equals("franak")) {
			konvertovaniIznos = iznosUDinarima * 0.0093;
		} else if (valuta.equals("dolar")) {
			konvertovaniIznos = iznosUDinarima * 0.010;
		}
		return konvertovaniIznos;
	}
}


		 * 
		 * Scanner s = new Scanner(System.in);
		System.out.println("Molim Vas, unesite iznos u dinarima:");
		double iznosUDinarima = s.nextDouble();
		System.out.println("Molim Vas, unesite valutu u koju da konvertujemo dinare:");
		String izabranaValuta = s.next().toLowerCase();
		double iznosUDevizama = konvertovanjeIzDinara(iznosUDinarima, izabranaValuta);
		if (iznosUDevizama == 0) {
			System.out.println("Niste uneli dobru valutu.");
		} else {
			System.out.println(iznosUDinarima + " kad se prebaci u " + izabranaValuta + " iznosi " + iznosUDevizama
					+ " u toj valuti.");
		}
	}
	public static double konvertovanjeIzDinara(double iznos, String valuta) {
		double iznosUZeljenojValuti = 0;
		switch (valuta) {
		case "evro": {
			iznosUZeljenojValuti = iznos * 0.0085;
			break;
		}
		case "franak": {
			iznosUZeljenojValuti = iznos * 0.0093;
			break;
		}
		case "dolar": {
			iznosUZeljenojValuti = iznos * 0.010;
			break;
		}
		}
		return iznosUZeljenojValuti; */
	}

}
