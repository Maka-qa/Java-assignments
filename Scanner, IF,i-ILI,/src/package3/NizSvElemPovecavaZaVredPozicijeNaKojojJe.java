package package3;

public class NizSvElemPovecavaZaVredPozicijeNaKojojJe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Napisati program koji svaki element niza
//		povecava za vrednost pozicije na kojoj se
//		element nalazi. Vrednosti i broj elemenata niza su proizvoljni
//		Primer izvrsenja:
//		niz = {1, 5, 7, -1, 4}
//		Nakon izvrsenja programa:
//		niz = {1, 6, 9, 2, 8}
//		Kako je ovaj niz dobijen?
//		niz = {1+0, 5+1, 6+2, -1+3, 4+4}
		//pre i posle ispis
		
		
		int [] nizBrojeva = {3, 9, 7, 10, 29, 30, 11};
		System.out.print("Niz pre promene: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			System.out.print(nizBrojeva[i] +  ", ");
		}
		System.out.println();
		System.out.print("Niz nakon promene: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva [i]= nizBrojeva[i] + i;
			System.out.print(nizBrojeva[i] +  ", ");
		}
	}

}
