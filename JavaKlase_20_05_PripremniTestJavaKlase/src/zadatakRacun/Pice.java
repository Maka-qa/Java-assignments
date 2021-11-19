package zadatakRacun;
/*2.	Napraviti apstraktnu klasu Pice koja ima:
Atribute: 
•	naziv, 
•	listu sastojaka (predstavlja listu svih sastojaka pica npr. Mohito ima limunadu, mentu i votku)
Konstrukrore, gettere i settere
Metodu dodaj sastojak (kao parametar prima sastojak i dodaje ga u listu sastojaka)
Metodu cena svih sastojaka koja vraca  zbir cena svih sastojaka iz liste sastojaka
Apstraktnu metodu cenaPica 
Apstraktnu metodu stampaj*/
import java.util.ArrayList;
public abstract class Pice {
	private String naziv;
	private ArrayList<Sastojak> listaSastojaka;
	public Pice(String naziv) {
		super();
		this.naziv = naziv;
		this.listaSastojaka = new ArrayList<Sastojak>();
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public ArrayList<Sastojak> getListaSastojaka() {
		return listaSastojaka;
	}
	public void setListaSastojaka(ArrayList<Sastojak> listaSastojaka) {
		this.listaSastojaka = listaSastojaka;
	}
	public void dodajSastojak(Sastojak sastojakZaDodavanje) {
		this.listaSastojaka.add(sastojakZaDodavanje);
	}
	public double cenaSvihSastojaka() {
		double cenaSastojakaUListi = 0;
		for (int i = 0; i < this.listaSastojaka.size(); i++) {
			cenaSastojakaUListi+=this.listaSastojaka.get(i).cenaSastojka();
		}
		return cenaSastojakaUListi;
	}
	public abstract double cenaPica();
	public abstract void stampaj();
}