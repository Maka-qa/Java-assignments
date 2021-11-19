package domaci_17_05;


public class GlavnaSportista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sportista s1 = new Sportista("Marija", "Milojevic", 1990);
		Klub k1= new Klub("KK Novi Sad ", "NS", 2011);
		s1.stampaj();
		System.out.println("---------------------");
		k1.stampaj();
	}


	}

/* Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina rodjenja se
zadaju prilikom kreiranja i ne mogu da se promene. Sportistu ispisati u obliku:

IME_PREZIME: godinaRodjenja
Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. Sva polja mogu da se
dohvate, a naziv kluba moze i da se postavi.

Napisati glavni program, gde cete testirati kako ove klase funkcionisu.

Dodatak zadatku za vezbu: U Klubu napraviti niz sportista tipa Sportista umesto jednog sportiste.
Samim tim postojace metode koje ce dodavati i uklanjati sportistu.
  */
