package package1;
public class zadatak1 {
/*	Zadatak
	Kreirati klasu Reakcija koja ima 
●	tip reakcije (smajli, like, srce)
●	ime i prezime korisnika koji je reagovao 
●	gettere, settere i konstruktore
Kreirati klasu FacebookPost koja ima:
●	ime i prezime korisnika koji je stavio oglas
●	tekst objave
●	Listu reakcija
●	metodu reaguj, koja dodaje reakciju u niz
●	privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
●	metodu stampaj koja stampa info o postu u formatu:
ime i prezime
tekst objave
Smajli 10 | Like 15 | Srce 2
Iz glavne klase instancirati par reakcija i postova i ispisati info o postovima*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reakcija s1 = new Reakcija("Smajli", "Milovan Pocek");
		Reakcija s2 = new Reakcija("Smajli", "Milovan Pocek");
		Reakcija s3 = new Reakcija("Srce", "Milovan Pocek");
		Reakcija s4 = new Reakcija("Srce", "Milovan Pocek");
		Reakcija s5 = new Reakcija("Srce", "Milovan Pocek");
		Reakcija s6 = new Reakcija("Like", "Milovan Pocek");
		Reakcija s7 = new Reakcija("Like", "Milovan Pocek");
		Reakcija josJedna = new Reakcija("Smajli", "Milos Misic");
		FacebookPost f1 = new FacebookPost("Pedja Pocek", "Ja sam kralj");
		f1.reaguj(s1);
		f1.reaguj(s2);
		f1.reaguj(s3);
		f1.reaguj(s4);
		f1.reaguj(s5);
		f1.reaguj(s6);
		f1.reaguj(s7);
		f1.reaguj(josJedna);
		for (int i = 0; i < 10; i++) {
			f1.reaguj(s3);
		}
		f1.stampanjePodatakaOPostu();
	}
}