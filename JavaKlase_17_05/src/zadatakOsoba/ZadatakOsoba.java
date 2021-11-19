package zadatakOsoba;
 public class ZadatakOsoba {
		/*U glavnom programu kreirati 2 studenta i 2 profesora.*/
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Student s1 = new Student("Milovan Pocek", 2973492473982794379l, "P024/07");
				Student s2 = new Student("Petar petrovic", 12123123123l, "P343/08");
				Profesor p1 = new Profesor("Kosta Josifitis", 2312313131233l, "Makroekonomija");
				Profesor p2 = new Profesor("Misa Misic", 423423423542345l, "Elektriku");
				s1.stampaj();
				s2.stampaj();
				p1.stampaj();
				p2.stampaj();
				
				StudentOsnovnihStudija s3 = new StudentOsnovnihStudija("Milica Milic", 1549746984l, "PG68/09", "Informatika", 4);
				StudentMasterStudija s4 = new StudentMasterStudija("Marko Markovic", 456979149l, "PG48/05", "Informatika", 5);
		
	
	}
 }

/*package zadatakOsoba;
1.	Zadatak
Kreirati klasu Osoba koja od atributa ima:
•	 ime i prezime
•	 jmbg
•	konstuktor sa parametrima
•	metodu stampaj koja stampa podatke u formatu
	ime prezime, jmbg
Kreirati klasu Student koja nasledjuje klasu Osoba, 
	koja od dodatnih atributa ima:
•	broj indeksa
•	konstuktor sa parametrima
•	metodu stampaj koja stampa podatke u formatu:
	ime prezime, jmbg, broj indeksa
Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
	koja od dodatnih atributa ima:
•	naziv predmeta koji predaje
•	konstuktor sa parametrima
•	metodu stampaj koja stampa podatke u formatu:
	ime prezime, jmbg, predmet
	U glavnom programu kreirati 2 studenta i 2 profesora.
public class ZadatakOsoba {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Milovan Pocek", 2973492473982794379l, "P024/07");
		Student s2 = new Student("Petar petrovic", 12123123123l, "P343/08");
		Profesor p1 = new Profesor("Kosta Josifitis", 2312313131233l, "Makroekonomija");
		Profesor p2 = new Profesor("Misa Misic", 423423423542345l, "Elektriku");
		s1.stampaj();
		s2.stampaj();
		p1.stampaj();
		p2.stampaj();
	}
} */