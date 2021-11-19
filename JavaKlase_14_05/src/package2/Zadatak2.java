package package2;
/*	Zadatak
Kreirati klasu Sastojak koja ima:
●	naziv
●	cenu
●	gettere i settere
●	konstruktore
●	metodu za stampanje koja stampa  podatke u formatu:
naziv - cena.din
	Kreirati klasu Pasta koja ima:
●	listu  sastojaka
●	metodu za dodavanje sastojka
●	metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
●	defaultni konstruktor
●	metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
●	metodu za stampu koja stampa podatke u formatu:
Pasta je sa sastojcima:
naziv - cena.din
naziv - cena.din
naziv - cena.din
Cena paste je cena.din
U glavnom programu kreirati objekte i testirati funkcionalnosti */
public class Zadatak2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sastojak sastojak1 = new Sastojak("Makaroni", 50);
		Sastojak sastojak2 = new Sastojak("Sunkarica", 60);
		Sastojak sastojak3 = new Sastojak("Kackavalj", 35);
		Sastojak sastojak4 = new Sastojak("Majonez", 10);
		Pasta aLaMilovan = new Pasta();
		aLaMilovan.dodavanjeSastojaka(sastojak1);
		aLaMilovan.dodavanjeSastojaka(sastojak2);
		aLaMilovan.dodavanjeSastojaka(sastojak3);
		aLaMilovan.dodavanjeSastojaka(sastojak4);
		aLaMilovan.stampanjePodatakaOPasti();
		System.out.println("---------------------------------------");
		System.out.println("Nakon brisanja majoneza");
		aLaMilovan.brisanjeSastojaka("Majonez");
		//aLaMilovan.brisanjeSastojaka(sastojak4.getNaziv());
		aLaMilovan.stampanjePodatakaOPasti();
	}
}