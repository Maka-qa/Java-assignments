/* U glavnoj klasi kreirati listu od 7 figura (2 trougla,
 *  3 pravougaonika, 2 kvadrata) zatim sabrati sve povrsine 
 *  i obime i za svaku figuru ispisati ponaosob */

package apstraktneKlase;
import java.util.ArrayList;
public class Glavna {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JednakostranicniTrougao t1 = new JednakostranicniTrougao(5);
		JednakostranicniTrougao t2 = new JednakostranicniTrougao(7);
		
		Pravougaonik p1 = new Pravougaonik(3, 5);
		Pravougaonik p2 = new Pravougaonik(2, 5);
		Pravougaonik p3 = new Pravougaonik(4, 7);
		
		Kvadrat k1 = new Kvadrat(5);
		Kvadrat k2 = new Kvadrat(7);
		
		ArrayList <GeometrijskaFigura> listaFigura =  new ArrayList<GeometrijskaFigura>();
		listaFigura.add(t1);
		listaFigura.add(t2);
		listaFigura.add(p1);
		listaFigura.add(p2);
		listaFigura.add(p3);
		listaFigura.add(k1);
		listaFigura.add(k2);
		
		double sumaPovrsina = 0;
		double sumaObima = 0;
		
		for (int i = 0; i < listaFigura.size(); i++) {
			sumaPovrsina+=listaFigura.get(i).povrsina();
			sumaObima+=listaFigura.get(i).obim();
			listaFigura.get(i).stampaj();
			System.out.println("---------------------------------");
		}
		System.out.println("Suma povrsina svih figura je " + sumaPovrsina);
		System.out.println("Suma obima svih figura je " + sumaObima);
	}
}