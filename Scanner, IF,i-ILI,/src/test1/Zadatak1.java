package test1;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Napisite niz od 10 elemenata i koristeci petlju pronadjite najmanji broj u nizu
		//Primer niza {3, 5, 4, 11, -1, 23, 5, 43, 0, 5}
		//Primer ispisa resenja u konzoli: 
		//Najmanji broj u nizu je -1
		
		
		int [] nizBrojeva = {1,-5,10,5,20,25,30,35,29,3};
		int min= nizBrojeva[0];
		for (int i=1; i<10; i++) {
			if (nizBrojeva[i]<min) {
				min=nizBrojeva[i];
			}
		}
		System.out.println("Najmanji broj u nizu je "+ min);

		/*  
		  int[] nizElemenata = {3, 5, 4, 11, -1, 23, 5, 43, 0, 5};
		 
		
		
		
		int brPoredjenja = Integer.MAX_VALUE;
		
		for (int i=0; i < nizElemenata.length; i++) {
			if(nizElemenata[i] < brPoredjenja) {
				brPoredjenja = nizElemenata[i];
			}
		}

		System.out.println("Najmanji broj u nizu je " + brPoredjenja + ".");
		
		
		
	/*	int[] nizBrojeva = { 3, 56, 43, 6, -10, 8, 74, -60, 1, 0 };
		int poredbeniBroj = 2147483647;
		for (int i = 0; i < nizBrojeva.length; i++) {
			if (nizBrojeva[i] < poredbeniBroj) {
				poredbeniBroj = nizBrojeva[i];
			}
		}
		System.out.println("Najmanji broj u nizu je: " + poredbeniBroj);

		
		 	int [] brojeviUnizu =  { 18, 98, 54, 45, 21, 5, 28, -9, 15, 32 };
		int poredbeniBroj=Integer.MAX_VALUE;
		for (int i=0; i<brojeviUnizu.length; i++) {
			if (brojeviUnizu[i] < poredbeniBroj) {
				poredbeniBroj= brojeviUnizu[i];
			}
		}
		System.out.println("Najmanji broj iz niza je " + poredbeniBroj);
 */
	}

}
