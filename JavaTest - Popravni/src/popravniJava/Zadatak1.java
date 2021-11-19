package popravniJava;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Napisati petlju koja protrcava kroz niz i sabira sve
		 *  brojeve koji nisu deljivi sa 10
		Primer niza: {25,40,72,100,8,30,7}
		Primer ispisa: 
		Zbir brojeva koji nisu deljivi sa 10 je 112 */
		
		int[] niz = {25,40,72,100,8,30,7};
		
		
		int zbir = 0  ;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 10 != 0) {
			zbir += niz[i];
			 
			
			
		}
			
	}
		
		System.out.println("Zbir brojeva koji nisu deljivi sa 10 je: " + zbir);

}
}