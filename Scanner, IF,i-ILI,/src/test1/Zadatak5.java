package test1;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
		//Proizvoljno napravite niz od 10 brojeva
		//korisnik unosi broj koji zeli da prebroji u nizu
				
		//Primer niza {2, 12, 432, 21, 2, 7, 12, 2, 21, -2}
		//Primeri ispisa u konzoli
				
		//Unesite broj koji zelite da prbrojimo u nizu brojeva:
		//2
		//Broj 2 se pojavljuje 3. puta u nasem nizu brojeva

		//Primer ispisa kad se unese broj koji ne postoji u nizu brojeva
				
		//Unesite broj koji zelite da prbrojimo u nizu brojeva:
		//8
		//Broj 8 se ne pojavljuje u nasem nizu
		/*
		int[] niz = { 1, 5, 10, 5, 12, 4, 15, 5, 7, 30 };
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj koji zelite da prebrojimo u nizu:");
		int broj = s.nextInt();
		int rezultat = prebrojavanjeElemenataNiza(niz, broj);
		System.out.println("Broj se pojavljuje " + rezultat + ". puta u nasem nizu");
	}
	public static int prebrojavanjeElemenataNiza(int[] niz, int broj) {
		int brojac = 0;
		for (int i = 0; i < 10; i++) {
			if (broj == niz[i]) {
				brojac++;
			}
		}
		return brojac;
        }
	}*/
		
		
		Scanner s = new Scanner(System.in);
		int[] nizBrojeva = { 6, 5, 12, 6, 8, 13, 4, 2, 18, 2 };
		System.out.println("Unesite broj koji želite da prebrojimo u nizu brojeva: ");
		int izabraniBroj = s.nextInt();
		int brojPonavljanja = prebrojavanjePonavljanjaUSkupu(nizBrojeva, izabraniBroj);
		if (brojPonavljanja == 0) {
			System.out.println("Broj " + izabraniBroj + " se ne pojavljuje u našem nizu.");
		} else {
			System.out.println("Broj " + izabraniBroj + " se pojavljuje " + brojPonavljanja + " u našem nizu brojeva.");
		}
	}
	public static int prebrojavanjePonavljanjaUSkupu(int[] niz, int odabraniBroj) {
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == odabraniBroj) {
				brojac++;
			}
		}
		return brojac;
	}

}


		
		