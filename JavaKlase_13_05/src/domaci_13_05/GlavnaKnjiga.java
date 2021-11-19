package domaci_13_05;


public class GlavnaKnjiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Knjiga k1 = new Knjiga("Sto godina samoce", "Gabrijel" , "Markes", 1980,  "MG - 12");
		Knjiga k2 = new Knjiga("Mali princ", "Antoan" , "De Sent Egziperi", 1980,  "AE - 13");
		Knjiga k3 = new Knjiga("Rat i mir", "Lav" , "Nikolajevic Tolstoj", 1980,  "lt - 12");

		
		Autor a1= new Autor("Gabrijel", "Garsija Markes");
		Autor a2= new Autor("Antoan", "De Sent Egziperi");
		Autor a3= new Autor("Lav", "Nikolajevic Tolstoj");

		k1.stampaj();
		k2.stampaj();
		k3.stampaj();
		System.out.println("---------------------");
		a1.stampaj();
		a2.stampaj();
		a3.stampaj();
	}
}


/* Domaci 13.05.2021. @here
Kreirati klasu Autor koja ima
-ime i prezime
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu:
(ime autora) (prezime autora)
Kreirati klasu Knjiga koji ima:
-ISBN
-naziv
-godina izdanja
-autor
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu (izbegavati dupliranje koda):
(ISBN)
(naziv) - (godina izdanja)
autor: (ime autora) (prezime autora)
    U glavnom programu napraviti vise autora sa vise knjiga.  */