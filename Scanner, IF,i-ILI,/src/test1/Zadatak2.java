package test1;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Napisati program koji racuna potrosnju goriva
		//Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
		//Motor trosi 5 litara goriva na 100 kilometara, automobil trosi 7 litara na 100 kilometara,
		//kombi trosi 11 litara na 100km, dok kamion trosi 15 litara na 100km
				
		//Primeri ispisa u konzoli:
				
		//Molim vas unesite distancu u kilometrima:
		//134
		//Molim vas unesite tip vozila: 
		//Kombi
		//Kombi na 134.0 km potrosi 14.74 litara goriva

		//Primer ispisa kad se unese pogresno vozilo
				
		//Molim vas unesite distancu u kilometrima:
		//133
		//Molim vas unesite tip vozila: 
		//Tenk
		//Uneli ste pogresan tip vozila
		
		
		Scanner s = new Scanner (System.in);
		System.out.println("Molim vas unesite distancu u kilometrima:");
		double distanca = s.nextDouble();
		System.out.println("Molim vas unesite tip vozila:");
		String tipVozila = s.next();
		
		double gorivo = 0;
		
		if (tipVozila.contentEquals("motor")) {
			gorivo = (distanca*5)/100;
			System.out.println("Motor na " + distanca + " km potrosi " + gorivo + " litara goriva.");
		} else if (tipVozila.contentEquals("automobil")) {
			gorivo = (distanca*7)/100;
			System.out.println("Automobil na " + distanca + " km potrosi " + gorivo + " litara goriva.");
		} else if (tipVozila.contentEquals("kombi")) {
			gorivo = (distanca*11)/100;
			System.out.println("Kombi na " + distanca + " km potrosi " + gorivo + " litara goriva.");
		} else if (tipVozila.contentEquals("kamion")) {
			gorivo = (distanca*15)/100;
			System.out.println("Kamion na " + distanca + " km potrosi " + gorivo + " litara goriva.");
		} else 
			System.out.println("Uneli ste pogresan tip vozila" + "Molim vas unesite tip vozila:" + "Molim vas unesite distancu u kilometrima:");
	}
		
		
		
		
	/*	
	 * Scanner s = new Scanner(System.in);
		System.out.println("Molim Vas unesite distancu u kilometrima: ");
		double distanca = s.nextInt();
		System.out.println("Molim Vas unesite tip vozila: ");
		String tipVozila = s.next();
		double potrosnjaGoriva;
		switch (tipVozila) {
		case "Motor": {
			potrosnjaGoriva = distanca * 5 / 100;
			System.out.println(tipVozila + " na " + distanca + " km potrosi " + potrosnjaGoriva + " litara goriva");
			break;
		}
		case "Automobil": {
			potrosnjaGoriva = distanca * 7 / 100;
			System.out.println(tipVozila + " na " + distanca + " km potrosi " + potrosnjaGoriva + " litara goriva");
			break;
		}
		case "Kombi": {
			potrosnjaGoriva = distanca * 11 / 100;
			System.out.println(tipVozila + " na " + distanca + " km potrosi " + potrosnjaGoriva + " litara goriva");
			break;
		}
		case "Kamion": {
			potrosnjaGoriva = distanca * 15 / 100;
			System.out.println(tipVozila + " na " + distanca + " km potrosi " + potrosnjaGoriva + " litara goriva");
			break;
		}
		default: {
			System.out.println("Uneli ste pogresan tip vozila.");
			break;
		}

	 * 
	 * 
	 * Scanner s = new Scanner(System.in);
		System.out.println("Molim Vas, unesite distancu u kilometrima: ");
		double distanca = s.nextDouble();
		System.out.println("Molim Vas, unesite tip vozila: ");
		String tipVozila = s.next().toLowerCase();
		double potrosnja = 0;
		switch (tipVozila) {
		case "motor": {
			potrosnja = (5.0 / 100.0) * distanca;
			break;
		}
		case "automobil": {
			potrosnja = (7.0 / 100.0) * distanca;
			break;
		}
		case "kombi": {
			potrosnja = (11.0 / 100.0) * distanca;
			break;
		}
		case "kamion": {
			potrosnja = (15.0 / 100.0) * distanca;
			break;
		}
		default: {
			System.out.println("Uneli ste pogrešan tip vozila.");
			break;
		}
		}
		if (potrosnja != 0) {
			System.out.println(tipVozila + " na " + distanca + " km potroši " + potrosnja + " litara goriva.");
		} 
		*/

	}


